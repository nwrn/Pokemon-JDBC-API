package br.com.pokemon.dao;

import br.com.pokemon.beans.Pokemon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PokemonDAO {

    private Connection con;

    public Connection getCon() {return con;}
    public void setCon(Connection con) {this.con = con;}

    public PokemonDAO(Connection con){ setCon(con);}

    public String insert(Pokemon pokemon){
        String sql = "INSERT INTO x VALUES (?)";
        try{PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pokemon.getName());
            if(ps.executeUpdate() > 0){ return "Inserido com sucesso.";}
            else{ return "Erro ao inserir.";}
        } catch(SQLException e){ return e.getMessage(); }
    }

    public ArrayList<Pokemon> select() {
        String sql = "SELECT * FROM x";
        ArrayList<Pokemon> retornaPokemon = new ArrayList<>();
        try{PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    Pokemon pokemon = new Pokemon();
                    pokemon.setName(rs.getString(1));
                    pokemon.setType(rs.getString(2));
                    retornaPokemon.add(pokemon);}
            return retornaPokemon;}
            else{ return null; } }
        catch(SQLException e){ return null; }
    }

}
