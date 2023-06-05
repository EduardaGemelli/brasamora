package dao;

import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexao;
import modelo.Cliente;

public class ClienteDAO {

    public void adicionarCliente(Cliente cliente) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO cliente (nome, nascimento, cpf, telefone,  "
                + "email, sexo, rua, numero, bairro, cep, cidade, estado, "
                + "telefoneContato) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getNascimento());
        ps.setString(3, cliente.getCpf());
        ps.setString(4, cliente.getTelefone());
        ps.setString(5, cliente.getEmail());
        ps.setString(6, cliente.getSexo());
        ps.setString(7, cliente.getRua());
        ps.setString(8, cliente.getNumero());
        ps.setString(9, cliente.getBairro());
        ps.setString(10, cliente.getCep());
        ps.setString(11, cliente.getCidade());
        ps.setString(12, cliente.getEstado());
        ps.setString(13, cliente.getTelefoneRecado());
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public void remover(int codigo) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "delete from cliente where id= ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, codigo);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    public void alterar(Cliente cliente) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE cliente set nome=?, nascimento=?, cpf=?, telefone=?,"
                + "email=?, sexo=?, rua=?, numero=?, bairro=?, cep=?,"
                + "cidade=?, estado=?, telefoneContato=? where id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getNascimento());
        ps.setString(3, cliente.getCpf());
        ps.setString(4, cliente.getTelefone());
        ps.setString(5, cliente.getEmail());
        ps.setString(6, cliente.getSexo());
        ps.setString(7, cliente.getRua());
        ps.setString(8, cliente.getNumero());
        ps.setString(9, cliente.getBairro());
        ps.setString(10, cliente.getCep());
        ps.setString(11, cliente.getCidade());
        ps.setString(12, cliente.getEstado());
        ps.setString(13, cliente.getTelefoneRecado());
        ps.setInt(14, cliente.getId());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    
    public List<Cliente> buscarPorCPF(String cpf) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from cliente where cpf like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + cpf + "%");
        ResultSet rs = ps.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        while (rs.next()) {
            Cliente cliente = new Cliente(rs.getString("nome"),
                    rs.getString("nascimento"), rs.getString("cpf"), rs.getString("telefone"),
                    rs.getString("email"), rs.getString("sexo"), rs.getString("rua"),
                    rs.getString("numero"), rs.getString("bairro"), rs.getString("cep"), rs.getString("cidade"),
                    rs.getString("estado"), rs.getString("telefoneContato"), rs.getInt("id"));
            clientes.add(cliente);
        }
        rs.close();
        ps.close();
        conexao.close();

        return clientes;

    }
    
    public List<Cliente> buscarPorNome(String nome) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from cliente where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        while (rs.next()) {
            Cliente cliente = new Cliente(rs.getString("nome"),
                    rs.getString("nascimento"), rs.getString("cpf"), rs.getString("telefone"),
                    rs.getString("email"), rs.getString("sexo"), rs.getString("rua"),
                    rs.getString("numero"), rs.getString("bairro"), rs.getString("cep"), rs.getString("cidade"),
                    rs.getString("estado"), rs.getString("telefoneContato"), rs.getInt("id"));
            clientes.add(cliente);
        }
        rs.close();
        ps.close();
        conexao.close();

        return clientes;

    }
  
    public List<Cliente> buscar() {
        String sql = "select * from cliente";
        Connection conexao = new Conexao().getConexao();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            List<Cliente> resultado = new ArrayList<>();
            ResultSet rs = ps.executeQuery();

            while (rs.next())  {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));

                resultado.add(cliente);
            }
            return resultado;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
