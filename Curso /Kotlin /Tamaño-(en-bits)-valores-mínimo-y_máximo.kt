Cree un programa que imprima el tamaño (en bits) y los valores mínimo y máximo de la Int escribe. Muestra cada valor en una nueva línea.

Aquí hay un ejemplo de salida con el Byteescribe:

8
-128
127

------------------------------------------------------------------------------------------------------------------------------------------
  
  fun main(args: Array<String>) {
    println(Int.SIZE_BITS)
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)
}
  
--------------------------------------------------------------------------
  
  fun main() = print("${Int.SIZE_BITS}\n${Int.MIN_VALUE}\n${Int.MAX_VALUE}")
  
-------------------------------------------------------------------------------------
  
  
  
