package com.sustain.track.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    data object Home : BottomNavItem("home", Icons.Default.Home, "Home")
    data object Track : BottomNavItem("track", Icons.Default.Search, "Track")
}


val bottomNavList = listOf(
    BottomNavItem.Home,
    BottomNavItem.Track,
)