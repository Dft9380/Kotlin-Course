/*
  TITULO: Funcion que devuelve la Longitud de un String
  PROBLEMA: Escriba una implementación de una función nombrada getLength que devuelva la longitud de una String, o -1 si la cadena es null.
  
  Entrada de muestra 1:
  Kotlin
  
  Salida de muestra 1:
  6
  
*/

//TODO Opcion 1
fun getLength(input: String?): Int {
    if (input == null) return -1
    else return input.length
}


//TODO Opcion 2
fun getLength(input: String?): Int {
    return if (input != null) input.length else -1
}

//TODO Opcion 3
fun getLength(input: String?): Int = input?.length ?: -1


//TODO Opcion 4
fun getLength(input: String?): Int {
    return input?.length ?: -1
}

