package com.hamalawey.mealz

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.hamalawey.mealz.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    private val viewModel : MealsViewModel by viewModels()
    val mealsAdapter = MealsAdapter()
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        viewModel.getMeals()
//        lifecycleScope.launch {
//            viewModel.categories.collect{
//                mealsAdapter.submitList(it?.categories)
//                binding.categoryRv.adapter = mealsAdapter
//            }
//        }
    }
    override fun onResume() {
        super.onResume()
        val navController = findNavController(R.id.fragment_container)
        NavigationUI.setupActionBarWithNavController(this,navController)
        binding.bottomNavigationBar.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp() : Boolean {
        findNavController(R.id.fragment_container).navigateUp()
        return true
    }
}