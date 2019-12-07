fun main() {

    val listaNombres: MutableList<String> = mutableListOf()
    do {

        print(
            "1.- Agregar un nombre\n" +
                    "2.- Agregar un nombre en una posición concreta\n" +
                    "3.- Cambiar nombre de la lista\n" +
                    "4.- Buscar\n" +
                    "5.- Salir\n" +
                    "opcion: "
        )

        val opcion = readLine()?.get(0)

        when (opcion) {
            '1' -> {
                print("Escribe el nombre nuevo: ")
                val nombre: String = readLine()!!
                agrega(nombre, listaNombres)
                mostrarLista(listaNombres)
            }
            '2' -> {
                print("Escribe el nombre nuevo: ")
                val nombre: String = readLine()!!
                mostrarLista(listaNombres)
                print("Elige la posición para insertar: ")
                val posicion: Int = readLine()?.toInt() as Int - 1
                inserta(posicion, nombre,listaNombres)
                mostrarLista(listaNombres)
            }
            '3' -> {
                mostrarLista(listaNombres)
                print("Escribe el índice del nombre a cambiar: ")
                val posicion: Int = readLine()?.toInt() as Int - 1
                print("Nombre nuevo: ")
                val nombre: String = readLine()!!
                mete(posicion, nombre,listaNombres)
                mostrarLista(listaNombres)
            }
            '4' -> {
                print("Nombre a buscar: ")
                val nombre: String = readLine()!!
                mostrarLista(busca(nombre,listaNombres))
            }
            '5' -> print("Adios!")

            else -> print("Opcion Incorrecta")
        }

    } while (opcion != '5')
}

fun busca(nombre: String, listaNombres: MutableList<String>): MutableList<String> {

    val encontrados: MutableList<String> = mutableListOf()

    for (i in listaNombres){
        if(i.contains(nombre,true))
            encontrados.add(i)
    }
    return encontrados
}

fun mete(posicion: Int, nombre: String,listaNombres: MutableList<String>) {
    listaNombres[posicion] = nombre
}

fun inserta(posicion: Int, nombre: String,listaNombres: MutableList<String>) {
    listaNombres.add(posicion, nombre)
}

fun agrega(nombre: String, listaNombres: MutableList<String>) {
    listaNombres.add(nombre)
}

fun mostrarLista(listaNombres: MutableList<String>) {

    var index = 1
    println("//////////// Listado ///////////////////")
    for (i in listaNombres) {
        print("$index $i")
        println()
        index++
    }
    println("////////////////////////////////////////")

}


