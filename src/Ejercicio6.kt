import java.lang.NumberFormatException

fun main() {

    //Ejercicio 6 - Día de la semana
    //Pedir al usuario un número comprendido entre el 1 y el 7 e imprimir el día de la semana al que hace referencia.
    //Por ejemplo, si introducen el 1, se visualizará Lunes.

    val listaSemana = mapOf(1 to "Lunes", 2 to "Martes", 3 to "Miercoles", 4 to "Jueves", 5 to "Viernes", 6 to "Sabado", 7 to "Domingo")

    val dia = recogeNum()

    println(listaSemana[dia])

}
fun recogeNum(): Int {

    var numero: Int
    do {
        try {

            print("Escribe un número del 1 al 7: ")

            numero = readLine()?.toInt() as Int

            if (numero < 1)
                print("Tiene que ser un número mayor de 1\n")

            if (numero > 7)
                print("Tiene que ser un número menor de 7\n")

        } catch (e: NumberFormatException) {
            print("Tiene que ser un número entero\n")
            numero = -1
        }

    } while ((numero < 1) or (numero > 7))

    return numero
}