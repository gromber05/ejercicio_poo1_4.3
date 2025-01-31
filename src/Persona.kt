import kotlin.math.pow
import kotlin.math.round


class Persona(var peso: Double, var altura: Double) {
    var nombre: String = ""

    var imc: Double = round((peso / altura.pow(2)) * 100) / 100

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    fun alturaEncimaMedia(): Boolean {
        return altura >= 1.75
    }

    fun pesoEncimaMedia(): Boolean {
        return peso >= 70
    }

    fun saludar(): String {
        return "Hola, $nombre"
    }

    fun obtenerDescImc(): String {
        when {
            imc < 18.5 -> return "Peso insuficiente"
            imc in 18.5..24.9 -> return "Peso saludable"
            imc in 25.0..29.9 -> return "Sobrepeso"
            imc <= 30.0 -> return "Obesidad"
        }

        return "null"
    }

    fun obtenerDesc(): String {
        return "$nombre con una altura de ${altura}m (${if (alturaEncimaMedia()) "Altura por encima de la media" else "Altura por debajo de la media"}) y un peso ${peso}kg (${if (pesoEncimaMedia()) "Peso por encima de la media" else "Peso por debajo de la media"}) tiene un IMC de ${"%.2f".format(imc)} (${obtenerDescImc()})"
    }

    override fun toString(): String {
        return "Nombre: $nombre, Peso: $peso kg, Altura: $altura metros, IMC: $imc"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return nombre == other.nombre && peso == other.peso &&  altura == other.altura && imc == other.imc
    }

    override fun hashCode(): Int {
        return  nombre.hashCode() * 31 + peso.hashCode() * 31 + altura.hashCode() * 31 + imc.hashCode()
    }

}

