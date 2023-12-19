package Modelo.Dao.Implements

import Modelo.Dao.Interfaces.ICuenta
import Modelo.Dao.Interfaces.IGenericDAO
import Modelo.Entity.Cuenta


class CuentaDAO: GenericDAO<Cuenta, Int>(Cuenta::class.java), ICuenta{

    override fun delete(id: Int){
        val allItems = getAll().toMutableList()
        allItems.remove(allItems.find {it.id == id})
        saveAll(allItems)
    }
}