package com.example.vtv

fun main (){
    val objAuto = Vehiculo()


    val objPersona = Persona()
    objPersona.nombre="Bin Laden"
    print(objPersona.nombre )
    objPersona.edad = 17


    print("---------------- \n")

    val objPersona2 = Persona()
    objPersona2.nombre="Pedro"
    print(objPersona2.nombre)
    print("\n")
    objPersona2.edad = 18

    val objVehiculo = Vehiculo()
    objVehiculo.marca = "Ford"
    objVehiculo.modelo = "Mondeo"
    objVehiculo.velocidadActual = 25

    objVehiculo.ControlarVelocidad()


}