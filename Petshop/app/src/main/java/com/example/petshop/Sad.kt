package com.example.petshop

class Sad(feeling: String, date: String): Mood(feeling,date){
    override fun speak(): String {
        return "not great"
    }}