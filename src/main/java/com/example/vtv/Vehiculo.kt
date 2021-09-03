package com.example.vtv

class Vehiculo  {

    var anio : Int = 0
        get() = field
        set(value) {
            if (value < 2018) field = value else print("No se puede")

        }
    var marca : String = ""
        get() {
            return field.toUpperCase()

        }
    var modelo : String = ""
    var patente : String = ""
    var kmActual : Int = 0
    var domicilioRadicacion : String = ""
    var velocidadActual : Int = 0
        set(value) {
            if(this.encendido == false){
                arrancar(this.encendido)
                field = value
            }
        }

    var encendido : Boolean = false

    val velocidadEstipulada : Int = 20

    //Regular la velocidad del auto a 20 km/h, si entra a menos de 20 : acelerar, si entra a mas de 20: detener

    fun ControlarVelocidad(){
        print("Vehículo Marca: " + this.marca + " \n")
        print("         Modelo: " + this.modelo + " \n")
        if(velocidadActual < velocidadEstipulada && velocidadActual !=0){
            velocidadActual = acelerar(velocidadActual)

        }
        else if (velocidadActual == 0){

            arrancar(this.encendido)
            acelerar(0)
        }
        else{

            velocidadActual = frenar(velocidadActual)
        }

    }

    fun frenar(velocidad : Int) : Int{
        var velocidad : Int = velocidad

        if (velocidad > velocidadEstipulada){
            while(velocidad > velocidadEstipulada ){
                velocidad --
                print("Disminuyendo la velocidad... " + velocidad +"km/h"+ "\n")

            }
        }
        return velocidad
    }

    fun acelerar(velocidad : Int) : Int{

        var velocidad : Int = velocidad

        if (velocidad < velocidadEstipulada){
            while(velocidad < velocidadEstipulada ){
                velocidad++
                print("Aumentando la velocidad... " + velocidad +"km/h"+ "\n")


            }
        }
        return velocidad
    }

    //pasar a true el encendido
    fun arrancar(encendido : Boolean){
        if(encendido == false){
            print("El auto está apagado, se procede a encenderlo \n")
            this.encendido =true
            //print("Ya está encendido\n")
        }
        else{
            print("El auto se encuentra encendido.\n")
        }

    }
    //pasar a false el encendido
    fun detener(encendido : Boolean){
        if (encendido){
            print("El auto está encendido")
        }


    }


}