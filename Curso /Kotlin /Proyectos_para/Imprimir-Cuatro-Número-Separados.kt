Escriba un programa que lea cuatro números enteros de una línea y los imprima en una nueva línea. 
Los números de entrada deben estar separados por uno o más espacios. 

Ejemplo de entrada 1:

101    102 103  104 

Salida de muestra 1:

101
102
103
104 

------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()

    println("$a\n$b\n$c\n$d")
}

--------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val input: MutableList<Int> = ArrayList()
    for (i in 1..4) {
        input.add(scanner.nextInt())
    }
    for (element in input) {
        println(element)
    }
    
    ----------------------------------------------------------------------
  
  fun main() = readln().split(' ').sorted().forEach(::println)

  --------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    println(scanner.nextInt())
    println(scanner.nextInt())
    println(scanner.nextInt())  
    println(scanner.nextInt()) 
}

---------------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) println(scanner.next())
}

--------------------------------------------------------------------------------------
  
  fun main() {
    val (item1, item2, item3, item4) = readLine()!!.split(" ").filter { e -> e.trim().isNotEmpty() }
    println("$item1\n$item2\n$item3\n$item4\n")
}
  
  
  
