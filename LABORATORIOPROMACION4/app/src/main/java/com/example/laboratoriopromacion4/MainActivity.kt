package com.example.laboratoriopromacion4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SegundoLaboratorio(){

        val carro1 = vehiculonuevo("Toyota", "Hilux", 2011)
        carro1.ListarVehiculo()

        val carro2 = vehiculonuevo("Nissan", "frontier", 2018)
        carro2.ListarVehiculo()

        val carro3 = vehiculonuevo("Toyota", "tacoma", 2021)
        carro3.ListarVehiculo()
    }
}