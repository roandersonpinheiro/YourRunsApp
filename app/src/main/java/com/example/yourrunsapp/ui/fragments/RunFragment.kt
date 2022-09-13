package com.example.yourrunsapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.yourrunsapp.R
import com.example.yourrunsapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment:Fragment(R.layout.fragment_run) {
    private val viewModel:MainViewModel by viewModels()
}