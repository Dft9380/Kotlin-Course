**Descripción**

Los asistentes personales digitales ayudan a las personas a conducir automóviles, planificar su día, comprar algo en línea.  En cierto sentido, son versiones simplificadas de inteligencia artificial con las que puedes hablar.

En este proyecto, desarrollarás paso a paso un bot simple que te ayudará a estudiar programación.

**Objetivo**

Para la primera etapa, escribirá un bot que muestre un saludo, su nombre y la fecha de su creación.  ¡Las primeras impresiones cuentan!Su programa debe imprimir las siguientes líneas:

//Hello! My name is {botName}.
//I was created in {birthYear}.

En lugar de `{botName}`, imprime cualquier nombre que elijas y reemplaza `{birthYear}`con el año en curso (cuatro dígitos).

**Ejemplo**

Producción:

//Hello! My name is Aid.
//I was created in 2020.

Puede cambiar el texto si lo desea, pero imprima exactamente dos líneas.

A continuación, usaremos **Aid** y **2020** como el nombre de su bot y su año de nacimiento, pero puede cambiarlo si lo necesita.

-----------------------------------------------------------------------------------------------
  
  fun main() {
    val name = "Diego"
    val year = 1993
    println("Hello! My name is $name.\nI was created in $year.")
    
}
  
  --------------------------------------------------------------------------------------------
  
  package bot

fun main() {
    val botName = "BotKo"
    val birthYear = 2022

    println("Hello! My name is $botName.")
    println("I was created in $birthYear.")
}

  ---------------------------------------------------------------------------------------------
  
  package bot

fun main() {
    println("Hello! My name is Pipirka.")
    println("I was created in 2022.")
}
  
  ------------------------------------------------------------------------------------
