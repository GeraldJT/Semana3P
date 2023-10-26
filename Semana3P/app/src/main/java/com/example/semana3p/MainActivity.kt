package com.example.semana3p

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Ejercicio 1

        var cedula = 1105817892
        var comprobar = 212121212

        var lista = cedula.toString().map { it.toString().toInt() }
        var listaC = comprobar.toString().map { it.toString().toInt() }
        var contador = 0
        var c = 0
        var redond = 0
        for (i in 0 until lista.size - 1) {

            contador = lista[i] * listaC[i]
            if (contador >= 10) {
                var num = contador.toString().map { it.toString().toInt() }
                contador = num.sum()
            }
            c += contador
        }
        redond = redondear(c)
        var final = redond - c
        if (final == lista.last()) {
            println("El numero " + final + " es igual a " + lista.last() +" es valido ")

        }
        //Ejercicio2

        val myArray20 = arrayOf( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
            19, 20)
        val pares = arrayListOf<Int>()
        val impares = arrayListOf<Int>()
        for ( i in 0 until myArray20.size){
            if (myArray20[i] % 2 == 0){
                pares.add(myArray20[i])
            }else{
                impares.add(myArray20[i])
            }
        }
        println("los pares son:" + pares)
        println("los impares son:" + impares)


        //Ejercicio3
        val persona1 :Map <String, String> = mapOf(
            "nombre" to "Gerald",
            "cedula" to "111111",
            "Edad" to "20",
            "Estado Civil" to "soltero"
        )
        val persona2 : Map <String, String> = mapOf(
            "nombre" to "Yhair",
            "cedula" to "111111",
            "Edad" to "61",
            "Estado Civil" to "soltero"
        )
        val persona3 : Map <String, String> = mapOf(
            "nombre" to "Roberto",
            "cedula" to "111111",
            "Edad" to "69",
            "Estado Civil" to "soltero"
        )
        val persona4 : Map <String, String> = mapOf(
            "nombre" to "Luis",
            "cedula" to "111111",
            "Edad" to "62",
            "Estado Civil" to "casado"
        )
        val persona5 : Map <String, String> = mapOf(
            "nombre" to "Sandra",
            "cedula" to "111111",
            "Edad" to "52",
            "Estado Civil" to "soltero"
        )
    val myArray5 = arrayOf(persona1, persona2, persona3, persona4, persona5)
    myArray5.forEach { var nombre = it ["nombre"] as String
                        var edad = it ["Edad"] as String
                        var eCivil = it ["Estado Civil"] as String
     if(edad > "60" && eCivil == "soltero" ){
         println("la persona: " + nombre + " tiene: " + edad + " y está: " + eCivil)
     }
    }
    }

}
fun redondear(c: Int): Int {
    return (c + 9)/10*10

}