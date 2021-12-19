/*
Entrada de muestra 1:
654

Salida de muestra 1:
456
*/

// TODO opcion 1
fun reverse(input: Int?) = input?.toString()?.reversed() ?: -1

// TODO opcion 2
fun reverse(input: Int?): Int {
    return input?.toString()?.reversed()?.toInt() ?: -1
}

// TODO opcion 3
const val TENS = 10
const val ZEROS = 0
fun reverse(input: Int?): Int {
    if (input == null) {
        return -1
    } else {
        var num = input
        var reversed = ZEROS

        while (num != ZEROS) {
            val digit = num % TENS
            reversed = reversed * TENS + digit
            num /= TENS
        }
        return reversed
    }
    
}

// TODO opcion 4
fun reverse(input: Int?): Int {
    return if (input == null) {
        -1
    } else {
        input.toString().reversed().toInt()
    }
}
