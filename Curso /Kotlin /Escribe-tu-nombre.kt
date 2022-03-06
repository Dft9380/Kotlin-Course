Descripción

La parte del saludo es excelente, pero también se supone que los chatbots interactúan con un usuario. Es hora de implementar esta funcionalidad.
Objetivo

En esta etapa, te presentarás al bot para que te salude por tu nombre.

Su programa debe imprimir las siguientes líneas:

/* 
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
What a great name you have, {yourName}!
*/

Puede cambiar el nombre y el año de creación de su bot si lo desea.

En lugar de {yourName}, el bot debe imprimir su nombre ingresado desde la entrada estándar.
Ejemplo

El símbolo mayor que seguido de un espacio ( > ) representa la entrada del usuario. Tenga en cuenta que no es parte de la entrada.

Ejemplo 1: un diálogo con el bot

/*
Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
> Max
What a great name you have, Max!
*/

Utilice la plantilla proporcionada para simplificar su trabajo. Puede cambiar el texto pero no el número de líneas impresas. 

------------------------------------------------------------------------------------------------------------------------------------------
  
  package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    // reading a name
    val diego = scanner.nextLine()
    println("What a great name you have, $diego!")
}

-------------------------------------------------------------------------------------------------
  
  package bot

const val BOT_NAME = "Makar"
const val BIRTHDAY = 2022
const val WELCOME_TEMPLATE = "Hello! My name is %s."
const val BIRTHDAY_TEMPLATE = "I was created in %d."
const val GREETING_TEMPLATE = "What a great name you have, %s!"
const val NAME_PROMPT = "Please, remind me your name."

fun welcome() {
    println(WELCOME_TEMPLATE.format(BOT_NAME))
    println(BIRTHDAY_TEMPLATE.format(BIRTHDAY))
}

fun readName(): String {
    println(NAME_PROMPT)
    return readln()
}

fun greet(name: String) {
    println(GREETING_TEMPLATE.format(name))
}

fun main() {
    welcome()
    greet(readName())
}
  
  
