package com.sustain.track.ui.navigation

import com.sustain.track.R


sealed class BottomNavItem(val route: String, val icon: Int, val label: String) {
    data object Home : BottomNavItem("home", R.drawable.ic_home, "Home")
    data object Track : BottomNavItem("track", R.drawable.ic_track, "Track")
}


val bottomNavList = listOf(
    BottomNavItem.Home,
    BottomNavItem.Track,
)