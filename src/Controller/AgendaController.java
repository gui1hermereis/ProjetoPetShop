package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import View.MenuPrincipal;
import java.sql.SQLException;

public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }

    public void voltarParaMenu(){
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.view.dispose();     
    }
    
    public void atualizaTabela() throws SQLException, ClassNotFoundException{
         
    }
    
    public void agendar() throws SQLException, ClassNotFoundException{
        //Buscar obj agendamento da tela
        Agendamento agendamento = helper.obterModelo();
        
        //Salvar obj no BD
        new AgendamentoDAO().insert(agendamento);
            
        //Inserir na tabela
        atualizaTabela();
        helper.limparTela();   
    }

    public void atualizaCliente() {
        
    }
}
