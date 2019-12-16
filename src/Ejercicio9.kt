import kotlin.random.Random

//Ejercicio 9 - Matriz aleatoria
//Pide al usuario dos valores (filas y columnas). Úsalos para generar una matriz de números enteros aleatorios de tamaño FxC.
//Cuando esté creada:
//  Muestra la matriz en pantalla.
//  Crea un array con el tamaño suficiente para almacenar todos los valores de la matriz y copia en él los datos.
//  Muestra el array.
//  Muestra el array eliminando los valores repetidos.


fun main() {

    print("Nº de filas: ")

    val filas = readLine()?.toInt() as Int

    print("Nº de Columnas: ")

    val columnas = readLine()?.toInt() as Int

    val matriz = Array(filas) { IntArray(columnas) }

    val array = IntArray(filas * columnas)

    var z = 0

    println("-MATRIZ-")
    for (i in 0 until filas) {

        for (j in 0 until columnas) {

            matriz[i][j] = Random.nextInt(10)
            print(matriz[i][j])
            array[z] = matriz[i][j]
            z++

        }

        println()
    }

    println("-ARRAY-")

    for (i in 0 until filas * columnas) {
        print(array[i])
    }

    println()
    println("-Distintos-")
    print(array.distinct())
}

