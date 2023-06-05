package modelo;

import java.util.Objects;

public class UsuarioFuncionario {
    private String nome;
    private String login;
    private String senha;
    private String nivel;
    private int id;

    public UsuarioFuncionario() {
    }

    public UsuarioFuncionario(String nome, String login, String senha, String nivel) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getLogin() {return login;}
    public void setLogin(String login) { this.login = login;}
    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}
    public String getNivel() {return nivel;}
    public void setNivel(String nivel) {this.nivel = nivel;}
    public int getCodigo() {return id;}
    public void setCodigo(int Codigo) {this.id = id;}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.login);
        hash = 41 * hash + Objects.hashCode(this.senha);
        hash = 41 * hash + Objects.hashCode(this.nivel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioFuncionario other = (UsuarioFuncionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return Objects.equals(this.nivel, other.nivel);
    }

    @Override
    public String toString() {
        return "UsuarioFuncionario{" + "nome=" + nome + ", login=" + login + ", senha=" + senha + ", nivel=" + nivel + '}';
    }

    
    
    
    
    
}
