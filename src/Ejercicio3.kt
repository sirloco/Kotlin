fun main() {

    print("Escribe un número: ")
    //hace un cast a enteros
    var n: Int = readLine()?.toInt() as Int
    //calcula el número de vueltas totales de la figura
    var vueltas = n * 2 - 1
    //el numero de vueltas es el mismo que los asteriscos por fila
    var asteriscos = vueltas
    //inicializa los espacios a 0
    var espacios = 0
    //prepara la bandera para el cambio de orientacion
    var cambio = false

    //empieza la fiesta
    for (i in 1..vueltas) {
        //primero pinta los espacios de cada fila
        for (j in 1..espacios) {
            print(" ")
        }
        //despues pinta los asteriscos
        for (j in 1..asteriscos) {
            print("*")
        }
        //salto de linea
        println()
        //si llega a pintar un asterisco solo hace cambio de vuelta
        if (asteriscos == 1)
            cambio = true
        //oeprador ternario que va asignado los asteriscos y espacios
        asteriscos = if (cambio) asteriscos + 2 else asteriscos - 2
        espacios = if (cambio) espacios - 1 else espacios + 1
    }

}