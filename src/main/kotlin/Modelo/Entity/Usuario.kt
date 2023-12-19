package Modelo.Entity

import java.util.*

class Usuario (
    val nombre: String,
    val fechaNacimiento: Date,
    val id: Int,
    val sueldo: Double,
    val usuarioBetado: Boolean
){
    override fun toString(): String {
        return "Usuario[id=$id, nombre=$nombre, nacimiento=$fechaNacimiento, sueldo=$sueldo, betado=$usuarioBetado]"
    }
}