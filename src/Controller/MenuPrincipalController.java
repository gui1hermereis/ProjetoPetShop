package Controller;

import View.Agenda;
import View.Login;
import View.MenuPrincipal;
import java.sql.SQLException;

public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda() throws SQLException, ClassNotFoundException{
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        view.dispose();
    }
    
    public void logoffUsuario(){
        Login login = new Login();
        login.setVisible(true);
        this.view.dispose();
    }
}
