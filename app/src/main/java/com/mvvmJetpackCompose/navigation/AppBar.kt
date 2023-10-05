package com.mvvmJetpackCompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import com.mvvmJetpackCompose.navigation.ui.theme.JetpackComposeDrawerNavigationTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomAppBar(drawerState: DrawerState?, title: String) {
    val coroutineScope = rememberCoroutineScope()

    CenterAlignedTopAppBar(
        navigationIcon = {
            if (drawerState != null) {
                // Display a burger menu icon if drawerState is provided
                IconButton(onClick = {
                    coroutineScope.launch {
                        // Open the drawer when the icon is clicked
                        drawerState.open()
                    }
                }) {
                    Icon(Icons.Filled.Menu, contentDescription = "")
                }
            }
        },
        title = {
            // Display the provided title in the app bar
            Text(text = title)
        }
    )
}

@Preview(widthDp = 300)
@Composable
fun PreviewCustomAppBar() {
    JetpackComposeDrawerNavigationTheme {
        // Render a preview of the CustomAppBar with a sample title
        CustomAppBar(drawerState = null, title = "Title")
    }
}
