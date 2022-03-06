Escriba un programa que lea dos líneas y luego dos números y los envíe en el mismo orden, cada uno en una nueva línea. 

Ejemplo de entrada 1:

Hola
 kotlin
 500 600 

Salida de muestra 1:

Hola
 kotlin
 500
 600 

------------------------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine() 
    val line2 = scanner.nextLine() 
    val num = scanner.nextInt()   
    val num2 = scanner.nextInt()  
    
    println("$line\n$line2\n$num\n$num2") 
}

-------------------------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println(scanner.nextLine())
    println(scanner.nextLine())
    println(scanner.nextInt())
    println(scanner.nextInt())
}

---------------------------------------------------------------------------------------------
  
  @SuppressWarnings("MagicNumber")
fun main() = List(3) { readln() }.let { 
    print(it.first() + "\n" + it[1] + "\n"); it.last().split(' ').forEach(::println)
}
-------------------------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    println(scanner.next())
    println(scanner.next())
    println(scanner.nextInt())
    println(scanner.nextInt())
}

------------------------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    scanner.forEach {
        println(it)
    }
}

-------------------------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) println(scanner.next())
}

  
  
