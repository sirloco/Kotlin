fun main() {

    print("Introduce un número: ")
    var n1: Int = readLine()?.toInt() as Int
    print("Introduce otro número: ")
    var n2: Int = readLine()?.toInt() as Int

    if (n2 > n1) {

        print("$n1 - $n2 = ${n1 - n2}")
    } else {
        print("$n1 + $n2 = ${n1 + n2}")
    }
    
}
