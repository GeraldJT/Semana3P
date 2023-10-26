package com.example.semana3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables
        var myFirstVariable = "Hola mundo"
        println(myFirstVariable)
        var secondVariable = myFirstVariable
        myFirstVariable = "Aplicaciones Moviles"
        println(myFirstVariable)

        //Constantes
        val myFirstConstant = "Presidente: Guillermo Lasso"
        println(myFirstConstant)
        val secondConstant = myFirstConstant
        //myFirstConstant = "Hola"
        println(secondConstant)

        //String
        val myString = "Hola Android"
        val myString2 = "desarrollo de plataformas moviles"
        val myString3 = myString + " " + myString2
        println(myString3)
        // enteros(byte, short, int, long)
        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //decimales (float, double)

        val myFloat = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)
        //Boolean (Bool)

        val myBool = true
        val myBool2 = false

        println(myBool == myBool2)
        println(myBool && myBool2)

        //Condicionales
        val edad = 19
        if(edad > 18) {
            println("es mayor de edad")
        }else if (edad < 18){
            println("es menor de edad")
        }

        //Case, ciclo
        val country = "Colombia"
        when(country) {
            "Ecuador", "Colombia", "Peru" ->{println("lenguage Spanish")}
            else-> { println("No se conoce el idioma")}
        }

        //Array
        val name = "Gerald"
        val surname = " Jaramillo"
        val university = "UTPL"
        val age = "39"

        val myArray = arrayListOf<String>()
        myArray.add(name)
        myArray.add(surname)
        myArray.add(university)
        myArray.add(age)

        println(myArray)
        myArray.addAll(listOf("Hola", "Curso android"))
        println(myArray)

        //eliminar datos
        myArray.removeAt(4)
        println(myArray)

        //Recorrer el Array
        myArray.forEach(){
            println(it)
        }

        //otras operaciones
        println(myArray.count())
        myArray.clear()
        println(myArray.count())
        //myArray.first()
        //myArray.last()
        //myArray.sort()

        var myMap: Map<String, Int> = mapOf()

        //agregar elemento

        myMap = mutableMapOf("Ramiro" to 1, "Pedro" to 2, "Sara" to 5)
        println(myMap)

        //Ejercicio 1
        val myArray2 = arrayOf<Int>(1, 1 ,0 , 5, 8, 1, 7, 8, 9, 2)
        for ( i in 0 until myArray2.size - 1){
            println(myArray[i])

        }




        //Ejercicio 2
        //Ejercicio 3
    }

}


