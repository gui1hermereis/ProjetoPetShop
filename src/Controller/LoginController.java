package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {
    private final Login view;
    private LoginHelper helper;
    private Usuario usuarioAutenticado;
    

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //Pegar um Usuário da View
        Usuario usuario = helper.obterModelo();
        
        //Pesquisar o Usuário no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        this.usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se o usuario da view tiver o mesmo usuario e senha do banco direcionar para menu
        // Senão mostrar mensagem ao usuário "Usuário ou senha inválidos"
 
        if(usuarioAutenticado != null){
            //navegar para menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true); //mostrar menu
            this.view.dispose(); // Descartar tela de login
        }else {
            view.exibeMensagem("Usuário ou senha inválidos");
        }
        
    }

    public Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(Usuario usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }
}
