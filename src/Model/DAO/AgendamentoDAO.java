package Model.DAO;

import Model.DAO.Conexao;
import Model.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgendamentoDAO {
    
    private Connection connection;
    
    public AgendamentoDAO() throws SQLException, ClassNotFoundException{
        this.connection=(Connection) new Conexao().conectar();
   }
    
    public void insert(Agendamento ObjUsuario){
        try {
            String sql;
            if (String.valueOf(ObjUsuario.getId()).isEmpty()) {
                sql = "INSERT INTO agenda(cliente, servico, valor, data, hora, observacao)VALUES(?,?,?,?,?)";
                try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                    stmt.setString(1, ObjUsuario.getCliente());
                    stmt.setString(2, ObjUsuario.getServico());
                    stmt.setFloat(3, ObjUsuario.getValor());
                    stmt.setString(4, ObjUsuario.getData());
                    stmt.setString(5, ObjUsuario.getHora());
                    stmt.setString(5, ObjUsuario.getObservacao());
                    stmt.execute();
                }
            } 
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }          
}
