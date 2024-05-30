package com.sustain.track.ui.navigation

import com.sustain.track.R


sealed class BottomNavItem(val route: String, val icon: Int, val label: String) {
    data object Home : BottomNavItem("home", R.drawable.track_vector2, "Home")
    data object Track : BottomNavItem("track", R.drawable.track_vector1, "Track")
}


val bottomNavList = listOf(
    BottomNavItem.Home,
    BottomNavItem.Track,
)