package com.hamalawey.mealz.history

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hamalawey.mealz.R

class HistoryFragment : Fragment() {

    private lateinit var viewModel : HistoryViewModel

    override fun onCreateView(
        inflater : LayoutInflater, container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View? {
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

}