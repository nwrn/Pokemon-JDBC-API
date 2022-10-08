package br.com.pokemon.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        String url = "urlServidorDB";
        conexao = DriverManager.getConnection(url, "user", "pass");
        System.out.println("Conexao aberta");
        conexao.closeConnection(conexao);
    }
}
