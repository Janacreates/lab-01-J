package com.example.petshop

class Happy(feeling: String,date: String): Mood(feeling,date){
    override fun speak(): String {
        return "feeling good"
    }}