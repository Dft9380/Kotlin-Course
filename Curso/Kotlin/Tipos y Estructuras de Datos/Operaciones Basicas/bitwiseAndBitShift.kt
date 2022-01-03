// Teoria

val first = 15  // binary format 1111
val second = 10 // binary format 1010

val bitwiseAnd = first and second // 1111 & 1010 = 1010, the result is 10
val bitwiseOr = first or second  // 1111 | 1010 = 1111, the result is 15
val bitwiseXor = first xor second // 1111 ^ 1010 = 0101, the result is 5
val first = 35  // binary format 0..00100011
val second = -35 // binary format 1..11011101

val inverseFirst = first.inv() // ~ 0..00100011 = 1..11011100, the result is -36
val inverseSecond = second.inv()  // ~ 1..11011101 = 0..00100010, the result is 34
val a = 5
val b = 4

val bitwiseAndA = a and 1 // 101 & 001 = 001, the result is 1 =>
// a is divided by 2 with a remainder equal to one

val bitwiseAndB = b and 1 // 100 & 001 = 000, the result is 0 => 
// a is divided by 2 without a remainder
var value = 25   // binary: 0001 1001, decimal: 25

value = value shl 1 // binary: 0011 0010, decimal: 50
value = value shl 2 // binary: 1100 1000, decimal: 200

var anotherVal = 14   // binary: 1110, decimal: 14
anotherVal = anotherVal shr 1 // binary: 0111, decimal: 7
var newVal = 25

newVal = newVal shl 1 // 25 * 2^1 = 50
newVal = newVal shl 3 // 50 * 2^3 = 400
newVal = newVal shr 2 // 400 / 2^2 = 100
val left = 10
val right = 20

val mid = (left + right) shr 1 // this is 15!
val number1 = 5
val number2 = -5

val shrNumber1 = number1 shr 1 // 0101 shr 1 = 0010, the result is 2
val ushrNumber1 = number1 ushr 1 // 0101 ushr 1 = 0010, the result is 2
val shrNumber2 = number2 shr 1 // 1011 shr 1 = 1101, the result is -3
val ushrNumber2 = number2 ushr 1 // the result is 2147483645 

