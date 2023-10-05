package com.mvvmJetpackCompose.navigation.screens

import CreditCardScreen
import CreditCardViewModel
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.mvvmJetpackCompose.navigation.CustomAppBar
import com.mvvmJetpackCompose.navigation.R

@Composable
fun ArticlesScreen(drawerState: DrawerState, viewModel: CreditCardViewModel) {
    // Scaffold is a Material Design layout structure that
    // provides the app's basic structure, like top bar and drawers.
    Scaffold(
        topBar = {
            // CustomAppBar is a custom composable function that defines the top bar.
            CustomAppBar(
                drawerState = drawerState, // Pass the drawer state to enable opening the drawer.
                title = LocalContext.current.getString(R.string.list_of_credit_cards) // Set the title of the top bar.
            )
        }
    ) { paddingValues ->
        // Column is a composable that arranges its children vertically.
        Column(
            modifier = Modifier
                .fillMaxSize() // Fill the entire available space.
                .padding(paddingValues), // Apply padding values.
            horizontalAlignment = Alignment.CenterHorizontally, // Center horizontally.
            verticalArrangement = Arrangement.Center // Center vertically.
        ) {
            // CreditCardScreen is another composable function that is
            // included in the Column to display credit card information.
            CreditCardScreen(viewModel = viewModel)
        }
    }
}
