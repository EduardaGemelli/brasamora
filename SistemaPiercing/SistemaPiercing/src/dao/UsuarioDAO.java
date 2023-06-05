package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.Conexao;
import modelo.UsuarioFuncionario;

public class UsuarioDAO {
    
    public void adicionar(UsuarioFuncionario usuario) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO login(login, senha, nome, nivel) "
                + "VALUES (?, ?, ?, ?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuario.getLogin());
        ps.setString(2, usuario.getSenha());
        ps.setString(3, usuario.getNome());
        ps.setString(4, usuario.getNivel());
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    
    public UsuarioFuncionario login(String login, String senha) throws SQLException{
      Connection conexao = new Conexao().getConexao();
        String sql = "select * from login where login =? and senha =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        
        UsuarioFuncionario usuario = null;
        while(rs.next()){
            usuario = new UsuarioFuncionario();
            usuario.setCodigo(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setNivel(rs.getString("nivel"));
        }
        rs.close();
        ps.close();
        conexao.close();
        
        return usuario;  
    }
    
}
