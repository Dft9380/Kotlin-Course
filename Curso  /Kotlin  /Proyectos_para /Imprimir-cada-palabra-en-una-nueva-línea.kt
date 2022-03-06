Escriba un programa que lea cinco palabras de la entrada estándar y genere cada palabra en una nueva línea.

Las palabras se pueden ordenar de manera diferente en el flujo de entrada.

Para resolver el problema, utilice `Scanner` .

Sample Input 1:

This course
teach you Kotlin

Sample Output 1:

This
course
teach
you
Kotlin

Sample Input 2:

one two three four five

Sample Output 2:

one
two
three
four
five

----------------------------------------------------------------------------

  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.next()
    val b = scanner.next()
    val c = scanner.next()
    val d = scanner.next()
    val e = scanner.next()
    print("$a\n$b\n$c\n$d\n$e")
}

-------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        scanner.nextLine().split(' ').map { it.trim() } .forEach(::println)
    }
}

------------------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val input: MutableList<String> = ArrayList()
    for (i in 1..5) {
        input.add(scanner.next())
    }
    for (element in input) {
        println(element)
    }
}

-----------------------------------------------------------------------------------
  
  fun main() = java.util.Scanner(System.`in`).run { while (hasNext()) println(next()) }

 ------------------------------------------------------------------------------------
  
  import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) println(scanner.next())
}

  
  
