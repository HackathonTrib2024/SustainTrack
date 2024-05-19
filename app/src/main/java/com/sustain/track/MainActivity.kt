package com.sustain.track

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sustain.track.ui.navigation.BottomNavItem
import com.sustain.track.ui.navigation.bottomNavList
import com.sustain.track.ui.screens.home.SustainHomeScreen
import com.sustain.track.ui.screens.spend.TransactionWiseCarbonFootprint
import com.sustain.track.ui.screens.tips.TipsSuggestion
import com.sustain.track.ui.theme.SustainTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SustainTrackTheme {
                val navController = rememberNavController()
                var selectedItemState by rememberSaveable { mutableIntStateOf(0) }
                Scaffold(bottomBar = {
                    NavigationBar {
                        bottomNavList.forEachIndexed { index, navItem ->
                            NavigationBarItem(selected = selectedItemState == index, onClick = {
                                selectedItemState = index
                                navController.navigate(navItem.route) {
                                    popUpTo(navController.graph.startDestinationId) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }, label = {
                                Text(text = navItem.label)
                            }, icon = {
                                BadgedBox(badge = {
                                    // Nothing to handle for now
                                }) {
                                    Icon(
                                        imageVector = if (index == selectedItemState) navItem.icon else navItem.icon, // TODO: Replace with your selected icon
                                        contentDescription = navItem.route
                                    )
                                }
                            })
                        }
                    }
                }) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        NavHost(
                            navController = navController, startDestination = bottomNavList[0].route
                        ) {
                            composable(route = BottomNavItem.Home.route) {
                                SustainHomeScreen()
                            }
                            composable(route = BottomNavItem.Spend.route) {
                                TransactionWiseCarbonFootprint()
                            }
                            composable(route = BottomNavItem.Tips.route) {
                                TipsSuggestion()
                            }
                        }
                    }
                }
            }
        }
    }
}
