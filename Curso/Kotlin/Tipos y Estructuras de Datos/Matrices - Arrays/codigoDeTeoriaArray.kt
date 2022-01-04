// Teoria


val numbers = intArrayOf(1, 2, 3, 4, 5) // It stores 5 elements of the Int type
println(numbers.joinToString()) // 1, 2, 3, 4, 5

val characters = charArrayOf('K', 't', 'l') // It stores 3 elements of the Char type
println(characters.joinToString()) // K, t, l

val doubles = doubleArrayOf(1.25, 0.17, 0.4) // It stores 3 elements of the Double type
println(doubles.joinToString()) // 1.15, 0.17, 0.4


val array = intArrayOf(1, 2, 3, 4,) // works since Kotlin 1.4


val numbers = IntArray(5) // an array of 5 integer numbers
println(numbers.joinToString())

val doubles = DoubleArray(7) // an array of 7 doubles
println(doubles.joinToString())



val numbers = IntArray(5) { readLine()!!.toInt() } // on each line single numbers from 1 to 5
println(numbers.joinToString()) // 1, 2, 3, 4, 5




// here we have an input string "1 2 3 4 5"

val numbers = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
println(numbers.joinToString()) // 1, 2, 3, 4, 5





val regex = "\\s+".toRegex()
val str = "1 2\t\t3  4\t5  6"
val nums = str.split(regex).map { it.toInt() }.toTypedArray()
println(nums.joinToString()) // 1, 2, 3, 4, 5, 6




val numbers = intArrayOf(1, 2, 3, 4, 5)
println(numbers.size) // 5 





val numbers = IntArray(3) // numbers: 0, 0, 0

numbers[0] = 1 // numbers: 1, 0, 0
numbers[1] = 2 // numbers: 1, 2, 0
numbers[2] = numbers[0] + numbers[1] // numbers: 1, 2, 3

println(numbers[0]) // 1, the first element
println(numbers[2]) // 3, the last element


val alphabet = charArrayOf('a', 'b', 'c', 'd')

val last = alphabet[alphabet.size - 1]    // 'd'
val prelast = alphabet[alphabet.size - 2] // 'c'

println(alphabet.first())   // 'a'
println(alphabet.last())    // 'd'
println(alphabet.lastIndex) // 3



val numbers1 = intArrayOf(1, 2, 3, 4)
val numbers2 = intArrayOf(1, 2, 3, 4)
val numbers3 = intArrayOf(1, 2, 3)

println(numbers1.contentEquals(numbers2)) // true
println(numbers1.contentEquals(numbers3)) // false



val simpleArray = intArrayOf(1, 2, 3, 4)
val similarArray = intArrayOf(1, 2, 3, 4)

println(simpleArray == simpleArray)  // true, simpleArray points to the same object
println(simpleArray == similarArray) // false, similarArray points to another object


