package dao;

import jdbc.Conexao;
import modelo.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendasDAO {
    
    public void adicionarVenda(Cliente cliente) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO vendas(nome, dataPerfuracao, valor, descricao, local) "
                + "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getDataPerfuracao());
        ps.setString(3, cliente.getValor());
        ps.setString(4, cliente.getDescricao());
        ps.setString(5, cliente.getLocal());
        ps.execute();
        ps.close();
        conexao.close();
        
    }
    
    public void alterar(Cliente cliente) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE vendas set nome=?, dataPerfuracao=?, valor=?, descricao=?, local=? where id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getDataPerfuracao());
        ps.setString(3, cliente.getValor());
        ps.setString(4, cliente.getDescricao());
        ps.setString(5, cliente.getLocal());
        ps.setInt(6, cliente.getId());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
    public void remover(int codigo) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "delete from vendas where id= ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, codigo);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
    public List<Cliente> buscarPorNome(String nome) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from vendas where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        while (rs.next()) {
            Cliente cliente = new Cliente(rs.getString("nome"),
                    rs.getString("dataPerfuracao"), rs.getString("valor"), rs.getString("descricao"), rs.getString("local"), rs.getInt("id"));
            clientes.add(cliente);
        }
        rs.close();
        ps.close();
        conexao.close();

        return clientes;
    }
    
    
}
