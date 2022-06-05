
package Model.DAO;


import Model.Usuario;
import java.util.ArrayList;


public class Banco {
    
    public static ArrayList<Usuario> usuario;
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "guilherme", 'M', "14/07/2004", "30212121", "guilherme@petshop.com", "521454123", "guilherme", "administrador");
        Usuario usuario2 = new Usuario(2, "felipe", 'M', "14/04/1996", "30212122", "felipe@petshop.com", "531356214", "felipe", "administrador");
        Usuario usuario3 = new Usuario(3, "estagiario", 'M', "09/05/2000", "30212123", "estagiario@petshop.com", "451244123", "estagiario", "funcionario");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
             
    }
    
    
}
