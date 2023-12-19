package Modelo.Dao.Implements

import Modelo.Dao.Interfaces.IUsuario
import Modelo.Entity.Usuario

class UsuarioDAO: GenericDAO<Usuario, Int>(Usuario::class.java), IUsuario {

}