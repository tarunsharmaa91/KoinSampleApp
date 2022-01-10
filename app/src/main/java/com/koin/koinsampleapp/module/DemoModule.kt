package com.koin.koinsampleapp.module

import com.koin.koinsampleapp.demo.Car
import com.koin.koinsampleapp.demo.Engine
import com.koin.koinsampleapp.demo.Key
import org.koin.dsl.module

val demoModule = module {
    //This will create multiple object upon multiple usage

    factory { Key() }
    //Create dependency of engine
    factory { Engine() }
    factory {
        Car(get(), get())
    }

    //To make it singleton
    /*val singletonModule = single {
        Car()
    }*/
}