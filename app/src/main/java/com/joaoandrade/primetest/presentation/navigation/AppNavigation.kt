package com.joaoandrade.primetest.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.joaoandrade.primetest.presentation.ui.ItemDetailScreen
import com.joaoandrade.primetest.presentation.ui.MyStringList

@Composable
fun AppNavigation(
    navController: NavHostController,
    selectedItem: MutableState<String?>
) {
//    NavHost(navController = navController, startDestination = "itemList") {
//        composable("itemList") {
//            MyStringList(navController, selectedItem.value) { item ->
//                selectedItem.value = item
//                navController.navigate("itemDetail/$item")
//            }
//        }
//        composable(
//            route = "itemDetail/{itemName}",
//            arguments = listOf(navArgument("itemName") { type = NavType.StringType })
//        ) { backStackEntry ->
//            val itemName = backStackEntry.arguments?.getString("itemName")
//            ItemDetailScreen(itemName ?: "Unknown Item", navController)
//        }
//    }
}