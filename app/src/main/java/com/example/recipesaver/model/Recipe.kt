package com.example.recipesaver.model

class Recipe (
    val name: String,
    val ingredient: List<String> = listOf(),
    val time: Int,
    val cook: Boolean,
    val timeToCook: Int
    ){

}