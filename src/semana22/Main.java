package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC - Java Databas Connection
// - Conjunto de interface e classe para acesso a SGBDs

// App Java    -->    MySQL

// Connection
// Como abrir uma conexão?
// Como executar um MySQL?
// Qual o formato de resultados de uma consulta SELECT * FROM...

// App Java    -->    Driver PostgreSQL  -->  PostgreSQL
// Connection conn = ...

// Database Connection

// Java App    -->    JDBC     -->   Driver (biblioteca que implementa JDBC)
// App Desktop -->    JDBC     -->   Driver MySQL --> MySQL


public class Main {
    public static void main(String[] args) throws SQLException {

        // 1. Criar conexão

        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        // 2. Executar a consulta SQL

        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome TEXT, email TEXT, ativo BOOL);";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        // 3. Fechar a conexão

        stm.close();
        conn.close();
    }   
}