//EJERCICIO 1
//Desarrollar un programa que permita guardar las notas de los alumnos y alumnas.
//El programa debera tener un menu con las siguientes opciones:
// meter alumno o alumna.
//matricular alumno o alumna en una asignatura
//insertar nota en la asignatura
//visualizar las notas de un alumno o alumna
//visualizar todas las notas de todo el alumnado
// Hay que tener en cuenta que hay seis posibles asignaturas;
// matemáticas, física, química, lenguaje, biología, dibujo.
//usar clases para hacer este ejercicio

fun main() {

    val listAlumnos = mutableListOf<Alumno>()
    do {

        print(
            "1.- Meter un alumn@\n" +
                    "2.- Matricular alumn@\n" +
                    "3.- Insertar nota en asignatura\n" +
                    "4.- Mostrar notas\n" +
                    "5.- Mostrar notas de todos\n" +
                    "6.- salir\n" +
                    "Opcion: "
        )

        val opcion = readLine()?.get(0)

        when (opcion) {

            '1' -> {
                print("Nombre del Alumn@: ")
                val nombre = readLine().toString()
                listAlumnos.add(Alumno(nombre))
                print("Alumno $nombre Creado")
            }
            '2' ->{

                var numero = 0
                for (alumno in listAlumnos) {
                    println("$numero ${alumno.nombre}" )

                    numero ++

                }

                println("Elige el alumn@: ")

                val alu = readLine()?.toInt() as Int

                print("Elige Asignatura: \n" +
                        "0.- matematicas\n" +
                        "1.- fisica \n" +
                        "2.- quimica\n" +
                        "3.- lenguaje\n" +
                        "4.- biologia\n" +
                        "5.- dibujo")

                val asig = readLine()?.toInt() as Int

                when (asig){

                    1-> listAlumnos[alu].matriculas.add(Matricula(Asignatura.matematicas))
                    2-> listAlumnos[alu].matriculas.add(Matricula(Asignatura.fisica))
                    3-> listAlumnos[alu].matriculas.add(Matricula(Asignatura.quimica))
                    4-> listAlumnos[alu].matriculas.add(Matricula(Asignatura.lenguaje))
                    5-> listAlumnos[alu].matriculas.add(Matricula(Asignatura.biologia))
                    6-> listAlumnos[alu].matriculas.add(Matricula(Asignatura.dibujo))
                }

            }
            '3' ->{

                var numero = 0
                for (alumno in listAlumnos) {
                    println("$numero ${alumno.nombre}" )

                    numero ++

                }

                println("Elige el alumn@: ")

                val alu = readLine()?.toInt() as Int

                print("Elige Asignatura: \n" +
                        "0.- matematicas\n" +
                        "1.- fisica \n" +
                        "2.- quimica\n" +
                        "3.- lenguaje\n" +
                        "4.- biologia\n" +
                        "5.- dibujo")

                val asig = readLine()?.toInt() as Int

                print("nota: ")
                val nota = readLine()?.toInt() as Int

                listAlumnos[alu].matriculas[asig].nota = nota

            }
            '4' -> {
                var numero = 0
                for (alumno in listAlumnos) {
                    println("$numero ${alumno.nombre}" )

                    numero ++

                }

                println("Elige el alumn@: ")

                val alu = readLine()?.toInt() as Int

                println(listAlumnos[alu].nombre)
                println()
                for (matricula in listAlumnos[alu].matriculas) {

                    print("${matricula.nombre} --> ${matricula.nota} \n")

                }
            }
            '5' ->{

                for (alumno in listAlumnos) {

                    println(alumno.nombre)
                    println()

                    for (matricula in alumno.matriculas) {
                        print("${matricula.nombre} --> ${matricula.nota} \n")
                        println()

                    }

                }
                print("Mostrar notas todos los alumnos")
            }
            '6' -> println("Adios!")
            else -> println("Opción Incorrecta")
        }

    } while (opcion != '6')

}
