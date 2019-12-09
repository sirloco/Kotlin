import java.lang.NumberFormatException

fun main() {

    //Ejercicio 7 - Lista de números primos 
    //Escribe un programa en el que pidamos al usuario un número y nos muestre los números primos entre 1 y ese número (incluido). 
    //Para conseguirlo, tendrá que llamar a una función EsPrimo() que nos diga si, en efecto, lo es. 

    val numero = recogeN()

    println(if (esPrimo(numero)) "Es Primo" else "No es primo")


}

fun esPrimo(n: Int): Boolean {

    var primo = true

    for (i in 2 until n) {
        if (n % i == 0)
            primo = false
    }

    return primo
}

fun recogeN(): Int {

    var numero: Int
    do {
        try {

            print("Escribe un número: ")

            numero = readLine()?.toInt() as Int

            if (numero < 0)
                print("Tiene que ser un número positivo\n")

        } catch (e: NumberFormatException) {
            print("Tiene que ser un número entero\n")
            numero = -1
        }

    } while (numero < 0)

    return numero
}