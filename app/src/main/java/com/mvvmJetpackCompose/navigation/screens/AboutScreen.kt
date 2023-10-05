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
fun AboutScreen(drawerState: DrawerState) {
    // Scaffold is a basic structure for a screen with top bar and content
    Scaffold(
        topBar = { CustomAppBar(drawerState = drawerState, title = "About Us")}
    ) { paddingValues ->
        Column(
            // Column is used for arranging content vertically
            modifier = Modifier.padding(paddingValues).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally, // Center horizontally
            verticalArrangement = Arrangement.Center // Center vertically
        ) {
            // Text to display the screen title
            Text(text = LocalContext.current.getString(R.string.about))
        }
    }
}
