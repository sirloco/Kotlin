fun main() {
    do {
        print("1.- Sumar\n" +
            "2.- Restar\n" +
            "3.- multiplicar\n" +
            "4.- dividir\n" +
            "5.- resto\n" +
            "6.- salir\n" +
            "opción: ")

        var opcion: Int = readLine()?.toInt() as Int

        if (opcion != 6) {

            print("Escribe Un número: ")
            var n1: Int = readLine()?.toInt() as Int

            print("Escribe Un número: ")
            var n2: Int = readLine()?.toInt() as Int

            when (opcion) {

                1 -> print("$n1 + $n2 = ${n1 + n2}")

                2 -> print("$n1 - $n2 = ${n1 - n2}")

                3 -> print("$n1 X $n2 = ${n1 * n2}")

                4 -> print("$n1 / $n2 = ${n1 / n2}")

                5 -> print("$n1 % $n2 = ${n1 % n2}")

                6 -> print("Adios!")

                else -> print("Opción incorrecta")

            }

            println()

        }


    }while (opcion != 6)

}

