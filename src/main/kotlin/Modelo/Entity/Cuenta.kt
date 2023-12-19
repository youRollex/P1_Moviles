package Modelo.Entity

import java.util.Date

class Cuenta (
    val nombre: String,
    var id: Int,
    val cantidad: Double,
    val esCaducada: Boolean,
    val fechaCreacion: Date
){
    override fun toString(): String {
        return "Cuenta[id=$id, nombre=$nombre, caducidad=$esCaducada, catidadCuenta=$cantidad, fechaCreacion=$fechaCreacion"
    }

}