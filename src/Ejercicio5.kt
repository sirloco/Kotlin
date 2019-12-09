import java.lang.NumberFormatException

fun main() {

    //Escribe un programa que pida tres variables enteras y las compare entre sí, sacando en pantalla cuál de ellas es
    // la mayor, la siguiente más grande y la menor.
    //Hay que tener en cuenta si son iguales, nunca se sabe.

    val numero1 = recogeNumero()

    val numero2 = recogeNumero()

    val numero3 = recogeNumero()

    if ((numero1 == numero2) and (numero1 == numero3)) {

        print("$numero1 = $numero2 = $numero3")

    } else if (numero1 > numero2) {

        if (numero1 > numero3)

            println(if (numero2 > numero3) "$numero1 > $numero2 > $numero3" else "$numero1 > $numero3 > $numero2")
        else

            println("$numero3 > $numero1 > $numero2")

    } else {

        if (numero3 > numero2)

            println("$numero3 > $numero2 > $numero1")
        else

            println(if (numero1 > numero3) "$numero2 > $numero1 > $numero3" else "$numero2 > $numero3 > $numero1")

    }

}

fun recogeNumero(): Int {

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
