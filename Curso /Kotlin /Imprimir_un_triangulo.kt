Escriba un programa que imprima la siguiente forma:

#
##
###
####
#####
######

--------------------------------------------------------

fun main() {
    print("#\n##\n###\n####\n#####\n######")
}

------------------------------------------------------------
  
  fun main() {
    println("#")
    println("##")
    println("###")
    println("####")
    println("#####")
    println("######")
}
  
  -------------------------------------------------------------------
  
  const val LEVELS = 6
  fun main() = (1..LEVELS).forEach { println("#".repeat(it)) }
  
  -----------------------------------------------------------------------
  
  fun main() {
    for (i in 1..6) {
        for (j in 1..i) {
            print('#')
        }
        print('\n')
    }
}
