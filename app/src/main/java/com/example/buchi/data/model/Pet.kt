package com.example.buchi.data.model

data class Pet(
    val age: String,
    val gender: String,
    val good_with_children: Boolean,
    val pet_id: String,
    val photos: List<Photo>,
    val size: String,
    val source: String,
    val type: String
)