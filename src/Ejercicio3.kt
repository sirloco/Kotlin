fun main() {

    print("Escribe un número: ")

    var n: Int = readLine()?.toInt() as Int

    var asteriscos: Int = 1

    for (i in 2..n){

        asteriscos += 2
    }

    var reverso: Int = n

//////////////////////////////////////////
    var vueltas: Int = asteriscos
    var espacios: Int = 1
    for (i in 1..vueltas) {

        for (j in 1..espacios) {
            print(" ")
        }

        for (j in 1..asteriscos) {
            print("*")
        }

        if (asteriscos == 1){

        }
        espacios ++
        asteriscos -= 2
        println()
    }
////////////////////////////////////////////
    var asteriscosReverso: Int = 1

    for (i in 1..n) {

        for (j in 1..reverso) {
            print(" ")
        }

        for (j in 1..asteriscosReverso) {
            print("*")
        }
        reverso--
        asteriscosReverso += 2
        println()
    }

}