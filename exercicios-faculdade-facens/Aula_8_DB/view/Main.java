package Aula_8_DB.view;

import Aula_8_DB.dao.UsuarioDAO;
import Aula_8_DB.entity.Usuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // CRUD (Create, Read, Updade e Delete)
        // Create
        Usuario usu = new Usuario(0, "fabio", "123");
        
        UsuarioDAO usuDao = new UsuarioDAO();
        usuDao.inserir(usu);
        
        // Editar (Edit)
        /*Usuario usu1 = new Usuario(7, "Joao", "123");
        usuDao.editar(usu1);
        
        // EXcluir (Delete)
        usuDao.excluir(9);*/
        
        //Usuario u1 = usuDao.getUserById(1);
        //System.out.println(u1.getLogin());
        
        //boolean autentica = usuDao.autenticar("fabio", "1234");
        //System.out.println(autentica);
        
        // Mostrar todos (Read)
        //ArrayList<Usuario> lstusuarios = usuDao.getAllUsuarios();
        
        //for (Usuario u : lstusuarios) {
            //System.out.println(u.getLogin());
        //}
    }
}
