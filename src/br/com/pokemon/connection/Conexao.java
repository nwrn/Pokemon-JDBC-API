package br.com.pokemon.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("jdbc.driver");
            String url = "urlServidorDB";
            final String user = "user";
            final String pass = "pass";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexao aberta.");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Erro no envio de dados.");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage()+ "Erro no envio de conexão.");
        }
        return con;
    }

    public static void closeConnection(Connection con){
        try{
            con.close();
            System.out.println("Conexão fechada");
        } catch (SQLException e){
            System.out.println(e.getMessage()+ "Erro para fechar a conexao.");
        } catch (Exception e){
            System.out.println(e.getMessage()+ "Erro para fechar a conexao.");
        }
    }

}
