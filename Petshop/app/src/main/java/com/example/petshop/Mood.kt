package com.example.petshop

abstract class Mood(val feeling: String,val date: String) {
    abstract fun speak(): String
    override fun toString(): String{
        return "$feeling on $date"
    }
}