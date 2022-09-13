package com.example.yourrunsapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.yourrunsapp.repositories.MainRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {
}