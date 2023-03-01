package com.example.buchi.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.buchi.data.repository.PetsRepository
import com.example.buchi.utils.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: PetsRepository
) : ViewModel() {
    // TODO: Implement the ViewModel

    init {
        getPets()
    }

    private fun getPets() = viewModelScope.launch {
        repository.getPets().collect() { response ->
            response.status.let {
               if (it ==  Status.SUCCESS ){

               }
            }
//            _ldAnimal.emit(animal)
        }
    }
}