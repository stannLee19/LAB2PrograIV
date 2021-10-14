package com.example.laboratoriopromacion4

class vehiculonuevo(val nombre:String, val modelo:String, val year:Int):vehiculo {
    fun ListarVehiculo(){
        println("Bienvenido, usted acaba de comprar un vehiculo Marca: $nombre, Modelo: $modelo y su año es: $year")
        darSaludo()
    }
    override fun darSaludo(){
        println("Gracias por comprar su nuevo vehiculo: $nombre")
    }
    private fun conducir(){
        println("Usted ha empezado a conducir su vehiculo $nombre")
    }
}