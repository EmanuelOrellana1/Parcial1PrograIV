package com.example.parcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Ejercicio1()
        Ejercicio2()
        Ejercicio3()

    }
}

private fun Ejercicio1(){

    var color = "Negro"

    if (color == "Naranja"){
        println("El color que desea es: $color")
    }
    else if(color == "Verde"){
        println("El color que desea es: $color")
    }
    else if(color == "Azul"){
        println("El color que desea es: $color")
    }
    else if(color == "Violeta"){
        println("El color que desea es: $color")
    }
    else if(color == "Rojo"){
        println("El color que desea es: $color")
    }
    else{
        println("El color no ha sido encontrado")
    }
}
private fun Ejercicio2(){

    val tipocomida = "Pizza"
    when(tipocomida){
        "Pizza" ->{
            println("Su comida es de Italia")
        }
        "Enchiladas" ->{
            println("Su comida es de Salvadoreña")
        }
        else ->{
            println("No se enconrtro su comida")
        }

    }


}


private fun Ejercicio3(){
    //Imprimir los valores x (1 en 1)
    for (x in 0..18){
        println(x)
    }

    //Imprimir los valores x (2 en 2)
    for (x in 0..18 step 2){
        println(x)
    }

    //Imprimir los valores x (1 en 1 hacia abajo)
    for (x in 18 downTo 0){
        println(x)
    }

    //Imprimir los valores x (3 en 3 hacia abajo)
    for (x in 18 downTo 0 step 3){
        println(x)
    }
}
