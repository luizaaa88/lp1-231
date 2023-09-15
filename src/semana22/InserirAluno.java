package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirAluno {
    public static void main(String[] args) throws SQLException { 
        
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        int id = 1;
        String nome = "Domingos Latorre";
        String email = "domingoslatorre@gmail.com";
        boolean ativo = true;

        String sql = "INSERT INTO alunos VALUES(?,?,?,?);";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setBoolean(4, ativo);

        pstm.executeUpdate();

        pstm.close();
        conn.close();

        // "INSERT INTO alunos VALUES(1, 'Domingos Latorre', 'domingoslatorre@gmail.com', 0);"
    }
}