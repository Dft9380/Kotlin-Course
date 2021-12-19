/*/**
 * Escriba un programa que lea N números y genere el producto máximo por pares de los N números dados.

Si solo hay un elemento, envíe este elemento.

La primera línea de la entrada contiene el número N.
Las otras líneas contienen N números. Todos los números son positivos.


 */



import java.util.*


/** fun main() {
    val phrase_0 = "Do you want to convert /from decimal or /to decimal? (To quit type /exit) "
    val phrase_1 = "Enter a number in decimal system:"
    val phrase_2 = "Enter the target base:"
    val phrase_3 = "Conversion result:"
    val phrase_4 = "Enter source number:"
    val phrase_5 = "Enter source base:"
    val phrase_6 = "Conversion result:"

    while(phrase_0 != "/exit") {

        print(phrase_0)
        val frase = readLine()!!.toString()

        if (frase == "/exit") break

    when(frase){
        "/from" -> {
            print(phrase_1)
            val campo1 = readLine()!!.toInt()
            print(phrase_2)
            val campo2 = readLine()!!.toInt()
            print(phrase_3)
            when(campo2){

                2 -> {val binaryResult = Integer.toBinaryString(campo1)
                    println(binaryResult) }

                8-> {val octalResult = Integer.toOctalString(campo1)
                    println(octalResult) }

                16-> {val hexResult = Integer.toHexString(campo1)
                    println(hexResult) }
            }
            println(" ")
        }
        "/to" -> {
            print(phrase_4)
            val campo1 = readLine()!!.toString()
            print(phrase_5)
            val campo2 = readLine()!!.toInt()
            print(phrase_6)
            when(campo2){

                2 -> println("$campo1".toInt(2))

                8-> println("$campo1".toInt(8))

                16-> println("$campo1".toInt(16))
                }
            println(" ")
            }
        }
    }

}
 */


 */

import java.math.BigDecimal
import java.math.RoundingMode

fun main(){
    var number = BigDecimal("2.001")
    number += BigDecimal.ONE
    number = -number
    number.setScale(1, RoundingMode.HALF_DOWN)
    print(number)
}