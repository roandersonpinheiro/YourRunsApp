package com.example.yourrunsapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.yourrunsapp.R
import com.example.yourrunsapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment:Fragment(R.layout.fragment_tracking) {
    private val viewModel: MainViewModel by viewModels()
}