//Da datos en tiempo de compilacion y es una variable global
const val N = "Name"
fun main(args: Array<String>) {

    println("Hola Mundo")

   //VARIABLE EN KOTLIN COMO OBJETOS

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    //Const y Val

   //Da datos en tiempo de ejecucion y es variable local
    val name = args[0]
    println(name)
    println(N)

    val nombre = "Zamahel"
    val apellido: String = "Mendez"
    //escapar variables en kotlin
    val nombreApellido = "Zamahel\nMendez"

    println("Tu nombre es: $nombre y tu apellido es: $apellido")
    println("Tu nombre es: $nombreApellido")

    //Para parrafos Raw String
    val parrafo: String = """
       Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
       **sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
       Ut enim ad minim veniam, 
       **quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.  
    """.trimIndent()
                              //Limpia basura del texto
    println(parrafo.trimMargin(marginPrefix = "**"))

    //Rangos en Kotlin

    val unoAlCinco :IntRange = 1..5
    //Despues se agrega el ciclo for
    for (i in unoAlCinco)
    {
        println(i)
    }
    //Resumido Sintaxis a
    for (letra :Char in 'A'..'C')
    {
        println(letra)
    }

    //sentencia if
    val numero = -5
    if (numero.equals(20))
    {
        println ("Si son iguales")

    }else{
        println("No, no son iguales")
    }

    //when == swicht
    when(numero){
        in -1..5 -> println("Si esta entre 1 a 5")
        in -1..100 -> println("Si esta entre 1 a 100")
        //negacion
        !in 150..1000 -> println("No esta entre 15 a 1000")
        else -> println("no esta en ninguno de los anteriores")
    }

    //while se maneja en contadores
    var i = 1
    while (i<1){
        println("mensaje: $i")
        i++
    }

    //do while

   i=1
    do {
        println("mensaje do while: $i")
        i++
    }while (i<1)

    //recorrido de indices

    var daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    //forma tradicional

    for(day in daysOfWeek){
        println("Forma Tradicional $day")
    }
    //acceso a indices
    for((index,day) in daysOfWeek.withIndex()){
        println("Acceso a indices $index :$day")
    }

    //foreach

    daysOfWeek.forEach{
        println("ForEach $it")
    }

    //Operadores nulos y Elvis Null Safty

    //Hacer una llamada segura
    var compute: String?
    compute = null
    var longitud: Int? = compute?.length//va a devolver valor nulo
    println("Longitud: $longitud")

    //Operador Elvis ?:

    var teclado: String? = null
    val longitudTeclado: Int = teclado?.length ?: 0
    println("Longitud del teclado: $longitudTeclado")

    val ListWithNulls: List<Int?> = listOf<Int?>(7,null,null,4)
    println("Lista con Null: ${ListWithNulls}")

    val ListWithoutNulls: List<Int?> = ListWithNulls.filterNotNull()
    println(ListWithoutNulls)















}