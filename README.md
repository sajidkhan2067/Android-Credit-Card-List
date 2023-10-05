# API Integration in Jetpack Compose Android App with MVVM, NavController, and Retrofit

This repository demonstrates the process of integrating an API into a Jetpack Compose-based Android application using the MVVM (Model-View-ViewModel) architecture. It showcases the use of Retrofit for handling network requests, LiveData for data observation, and Compose for constructing the user interface. The API employed in this repository serves credit card data.

**Jetpack Compose** provides a native approach to navigate between different components within Android applications. It replaces conventional methods such as fragment transactions, navigation components, and intent-based activities. This repository introduces the concepts of **NavHost** and **NavController**, which simplify route declaration and navigation management. The `NavController` instance is created using `rememberNavController()`, ensuring consistency even after recomposition.

Navigation setup involves defining the `NavHost` and specifying the starting destination, representing the initial screen route. Users can navigate between composables using `navController.navigate("route to composable")`. A `navController.popBackStack()` call simulates the user's back button.

For multi-screen navigation, the `NavHost` is extended with additional composables, and screens include buttons for facilitating movement. For instance, the third screen incorporates a button that returns the user to the first screen while clearing the stacked components.

Data transfer between screens is achieved by encoding the value within the route as a string, which is then parsed on the receiving screen. Typically, only essential data is passed via routes, with other information retrieved using the ViewModel or other logical units.

In this repository, successful integration of the provided API into a Jetpack Compose-based Android application using the MVVM architecture is showcased. It covers the configuration of Retrofit for network requests, the utilization of LiveData for data observation, and the utilization of Compose for constructing the user interface. The ViewModel effectively manages data retrieval and state management, while the Composable UI displays the list of credit cards fetched from the API. This architectural approach offers a structured and responsive solution for managing network requests and updating the user interface.

For comprehensive guidance on integrating APIs into an Android application using Jetpack Compose and MVVM, follow the steps outlined in this repository.


**Note:** This README serves as a brief summary of the repository. For an in-depth understanding of the concepts and complete code samples, please visit the repository source.

References:
1. https://developer.android.com/
2. https://proandroiddev.com/drawer-navigation-using-material-3-in-jetpack-compose-1bfd5f3f7ed4
3. https://medium.com/@dheerubhadoria/jetpack-compose-android-app-with-mvvm-architecture-and-retrofit-api-integration-4eb61ca6fbf2