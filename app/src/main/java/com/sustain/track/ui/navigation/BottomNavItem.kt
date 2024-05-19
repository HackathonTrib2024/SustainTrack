package com.sustain.track.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector


sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    data object Home : BottomNavItem("home", Icons.Default.Home, "Home")
    data object Spend : BottomNavItem("spend", Icons.Default.Search, "Spend Analysis")
    data object Tips : BottomNavItem("tips", Icons.Default.Person, "Sustainability")
}


val bottomNavList = listOf(
    BottomNavItem.Home,
    BottomNavItem.Spend,
    BottomNavItem.Tips
)