
package Model.DAO;

import java.sql.Connection;
// conexão SQL para Java 
import java.sql.DriverManager;
import java.sql.ResultSet;
// driver de conexão SQL para Java 
import java.sql.SQLException;
import java.sql.Statement;
// classe para tratamento de exceções 

public class Conexao {
    private Connection con = null; // conexão
    public Statement stm = null; // canal para execução de queryies
    private ResultSet rs = null;
    // conexão com servidor e base de dados
    public Connection conectar() throws SQLException, ClassNotFoundException {
        // registrando classe e driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
             return DriverManager.getConnection("jdbc:mysql://localhost:3306/petshop", "root", "");
        } catch (SQLException excecao) {
            throw new RuntimeException (excecao);
         }
    }
}
