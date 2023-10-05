package com.mvvmJetpackCompose.navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.mvvmJetpackCompose.navigation.CustomAppBar
import com.mvvmJetpackCompose.navigation.R

@Composable
fun SettingsScreen(drawerState: DrawerState) {
    // Scaffold is a basic structure for creating UI with top app bars and drawers
    Scaffold(
        topBar = {
            // CustomAppBar is a custom top app bar component with drawer integration
            CustomAppBar(drawerState = drawerState, title = "Settings")
        }
    ) { paddingValues ->
        // Column is a composable that arranges its children vertically
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            // Center align children horizontally and arrange them in the center vertically
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Text composable displays text on the screen
            Text(text = LocalContext.current.getString(R.string.settings))
        }
    }
}
