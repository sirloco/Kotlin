import java.lang.Exception
import kotlin.random.Random

fun main() {
    //Ejercicio 8 - Buscar mayor y menor
    //Crea un array de 10 posiciones con números aleatorios.
    //Escribe y pon a prueba estas funciones:
    // visualizar(): muestra el array en pantalla.
    // buscarMayor(): muestra el número más alto que haya en el array.
    // buscarMenor(): muestra el número más pequeño que haya en el array.
    // existe(n): devuelve true si el valor buscado existe en el array.
    //Notas:
    // Las funciones deben recibir el array como parámetro.  Investiga a ver si en Kotlin hay métodos predefinidos
    // que nos ayuden con estas tareas.


    val array = Array(10) { Random.nextInt(10) }

    visualizar(array)

    buscarMayor(array)

    buscarMenor(array)

    print("Escribe un número a buscar: ")

    val n: Int = readLine()?.toInt() as Int

    print(if(existe(n, array)) "El número $n está en el array" else "El número $n no está en el array")
}

fun existe(n: Any, array: Array<Int>): Boolean {

    return n in array

}

fun buscarMenor(array: Array<Int>) {

    array.sortDescending()
    println("El número mas bajo es: " + array[9])

}

fun buscarMayor(array: Array<Int>) {

    println()
    array.sortDescending()
    println("El número mas alto es: " + array[0])

}

fun visualizar(array: Array<Int>) {

    for (i in array) {
        print(i)
    }
}


