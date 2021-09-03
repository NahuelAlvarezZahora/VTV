package com.example.vtv

import java.util.*

class Persona {

    var nombre : String = "Default"
        get() = field
        set(value) {
            if (AlertaFbi(value)){
                print("Sospechoso Encontrado\n")
            }
            else {
                field = value
            }
        }

    var apellido : String = ""
    var dni : Int = 0
    var edad : Int = 0
        get() = field
        set(value) {
            if (value >= 18) {
                field = value
                mostrarEdad()
            }
                else{
                    AlertaMenorDeEdad(value)
            }

        }
    var mail : String = ""
    var fechaNacimiento : String = ""
    var domicilio : String =  ""
    var discapacitado : Boolean = false
    var jubilado : Boolean = false

    fun GetJubilacion() {

    }

    fun GetDiscapacidad() {

    }
    fun  AlertaFbi(nomIngresado : String) : Boolean {
        var check : Boolean = false
        if(nomIngresado.equals("Bin Laden")) {
            print("Persona Buscada, Alerta Roja activada \n")
            check = true
        }
        return check;
    }

    fun mostrarEdad(){
        print("Valor de Edad: "+ this.edad +"\n")
    }

    fun AlertaMenorDeEdad( edadIngresada : Int){
        print("Edad ingresada: " + edadIngresada+"\n" +"Debe ser mayor de edad"+"\n" )
    }

}

