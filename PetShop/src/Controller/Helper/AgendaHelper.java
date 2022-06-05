
package Controller.Helper;

import Model.Agendamento;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class AgendaHelper implements IHelper{
    
    private final Agenda view;
    

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        //percorrer a lista preenchendo
        agendamentos.forEach(agendamento -> {
            tableModel.addRow(new Object[]{
                
                agendamento.getId(),
                agendamento.getCliente(),
                agendamento.getServico(),
                agendamento.getValor(),
                agendamento.getData(),
                agendamento.getHora(),
                agendamento.getObservacao()
            });
        });
        
    }

    public void setarValor(float valor) {
       
        view.getTextValor().setText(valor+"");
    
    }

    @Override
    public Agendamento obterModelo() {
         
        String idString = view.getTextId().getText();
        Integer id = Integer.parseInt(idString);
        String cliente = view.getTextCliente().getText();
        String servico = view.getTextServico().getText();
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTextData().getText();
        String hora = view.getTextHora().getText();
        String observacao = view.getTextObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, data, hora, observacao);
        return agendamento;
    }

    /**
     *
     */
    @Override
    public void limparTela() {

        view.getTextId().setText("0");
        view.getTextData().setText("");
        view.getTextHora().setText("");
        view.getTextObservacao().setText("");
    
    }
    
    
}
