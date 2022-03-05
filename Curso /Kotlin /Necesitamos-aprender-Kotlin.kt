Escriba un programa que imprima este texto:

WE NEED

TO LEARN KOTLIN

AS QUICKLY AS POSSIBLE

--------------------------------------------------------
  
  fun main() {
    val a = "WE NEED"
    val b = "TO LEARN KOTLIN"
    val c = "AS QUICKLY AS POSSIBLE"
    println(a)
    println()
    println(b)
    println()
    print(c)
}
  
  --------------------------------------------------------------
  
 fun main() {
    """
    WE NEED

TO LEARN KOTLIN

AS QUICKLY AS POSSIBLE
    """.lines().forEach { println(it) }
}
 
 ---------------------------------------------------------------------
  
  fun main() {
    println("WE NEED")
    println()
    println("TO LEARN KOTLIN")
    println()
    println("AS QUICKLY AS POSSIBLE")
}
  -------------------------------------------------------------------------
  
  fun main() = print("WE NEED\n\nTO LEARN KOTLIN\n\nAS QUICKLY AS POSSIBLE")
