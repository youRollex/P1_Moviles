import Modelo.Dao.Implements.CuentaDAO
import Modelo.Entity.Cuenta
import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val cuentaAdministrador = Cuenta("Pepe", 2,20.00, false, Date())
    val cuentaDao = CuentaDAO()
    //cuentaDao.create(cuentaAdministrador)

    //cuentaDao.delete(2)

    val listaActualizada = cuentaDao.getAll();

    val objetoMidificado = Cuenta("Pepe", 2,50.00, false, Date())
    cuentaDao.update(objetoMidificado)
    println("Lista actualizada: $listaActualizada")

}