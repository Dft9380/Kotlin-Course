Escriba un programa que lea cinco palabras de la entrada estándar y genere las palabras en una línea. En la salida, las palabras deben estar separadas por un solo espacio.
/*
 Sample Input 1:

Never
gonna
give
you
up

Sample Output 1:

Never gonna give you up

Sample Input 2:

Never
gonna
let
you
down

Sample Output 2:

Never gonna let you down
*/

-----------------------------------------------------------------------------------------------------------
  
  fun main() {
    val a = readLine()!!
    val b = readLine()!!
    val c = readLine()!!
    val d = readLine()!!
    val e = readLine()!!
    val space = " "
    print("$a $b $c $d $e")
}

  --------------------------------------------------------------------------------------------------
  
  fun main() {
    var b = 0
    val c = 5
    repeat(c) {
        print(readLine())
        b += 1
        if (b != c) {
            print(" ")
        }
    }
    // put your code here
}
  ----------------------------------------------------------------------------------------------
  
  fun main() {
    for (i in 0..4) print("${readln()} ")
}
  
--------------------------------------------------------------------------------------------------
  
  fun main() {
    print(readln() + " " + readln() + " " + readln() + " " + readln() + " " + readln())
}
