
fun main () {

    val listaPersonas = listOf(
        Persona("Carlos", 70.2, 1.80),
        Persona("María", 72.9, 1.90),
        Persona("Luis", 56.2, 1.55),
        Persona("Andrea", 80.5, 1.75),
        Persona("Javier", 65.3, 1.68),
        Persona("Sofía", 90.7, 1.85),
        Persona("Elena", 50.2, 1.60)
    )

    for (persona in listaPersonas) {
        println(persona.saludar())
        println(persona.obtenerDesc())
    }

}