/*  
    TITULO: Determina si un String es un Numero
    PROBLEMA: Escriba una implementación de una función nombrada isNumber que determine si String se puede convertir a Int. 
              Si puede, devuelve su Int valor; de lo contrario, devuelve el mismo String.

Entrada de muestra 1:
1

Salida de muestra 1:
1

*/

//TODO Opcion 1
fun isNumber(input: String) = input?.toIntOrNull() ?: input.toString()


//TODO Opcion 2
fun isNumber(input: String): Any {
    return if (input.toIntOrNull() != null) {
        input.toInt()
    } else {
        input
    }
}

//TODO Opcion 2
import java.lang.NumberFormatException

fun isNumber(input: String): Any = try { input.toInt() } catch (e: NumberFormatException) { input }
