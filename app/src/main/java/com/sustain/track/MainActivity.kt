package com.sustain.track

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExtendedFloatingActionButton
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sustain.track.ui.navigation.BottomNavItem
import com.sustain.track.ui.navigation.bottomNavList
import com.sustain.track.ui.notification.NotificationUtils
import com.sustain.track.ui.screens.TopBar
import com.sustain.track.ui.screens.home.NewTransactionsHome
import com.sustain.track.ui.screens.track.NewTrackScreen
import com.sustain.track.ui.theme.SustainTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SustainTrackTheme {
                val navController = rememberNavController()
                var selectedItemState by rememberSaveable { mutableIntStateOf(0) }
                val context = LocalContext.current
                Scaffold(
                    topBar = {  TopBar(title = "SustainTrack") },
                    bottomBar = {
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
                                        Image(
                                            painter = painterResource(id = navItem.icon),
                                            contentDescription = navItem.route
                                        )
                                    }
                                })
                            }
                        }
                    },
                    floatingActionButton = {
                        ExtendedFloatingActionButton(
                            text = { Text(text = "Pay") },
                            icon = {
                                Icon(
                                    imageVector = Icons.Default.AddCircle,
                                    contentDescription = "Pay"
                                )
                            },
                            onClick = {
                                NotificationUtils.showNotification(
                                    context,
                                    "750kr paid to Uber", "Your a/c XX0423 is debited for Kr.750 " +
                                            "and credited to a/c XX6902(Ref no 4582604274045)." +
                                            "Plz call 18002356464 if not done by you."
                                )
                            })
                    },
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        NavHost(
                            navController = navController, startDestination = bottomNavList[0].route
                        ) {
                            composable(route = BottomNavItem.Home.route) {
                                NewTransactionsHome()
                            }
                            composable(route = BottomNavItem.Track.route) {
                                NewTrackScreen()
                            }
                        }
                    }
                }
            }
        }
    }
}
