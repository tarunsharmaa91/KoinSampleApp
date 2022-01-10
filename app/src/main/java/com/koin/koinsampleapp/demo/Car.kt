package com.koin.koinsampleapp.demo

import android.util.Log

class Car constructor(private val key: Key, private val engine: Engine) {
    fun startCar(){
        key.getKey()
        engine.startEngine()
        Log.e("Starting car", "Car is starting: ")
    }
}

class Engine{
    fun startEngine(){
        Log.e("Starting Engine", "startEngine: " )
    }
}

class Key{
    fun getKey(){
        Log.e("Getting Key", "getting Key: " )
    }
}