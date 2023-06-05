package modelo;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String nascimento;
    private String cpf;
    private String telefone;
    private String sexo;
    private String email;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String telefoneRecado;
    private int id;
    private String dataPerfuracao;
    private String valor;
    private String descricao;
    private String local;

    public Cliente() {
    }

    public Cliente(String nome, String dataPerfuracao, String valor, String descricao, String local) {
        this.nome = nome;
        this.dataPerfuracao = dataPerfuracao;
        this.valor = valor;
        this.descricao = descricao;
        this.local = local;
    }
    
    public Cliente(String nome, String dataPerfuracao, String valor, String descricao, String local, int id) {
        this.nome = nome;
        this.dataPerfuracao = dataPerfuracao;
        this.valor = valor;
        this.descricao = descricao;
        this.local = local;
        this.id = id;
    }

    public Cliente(String nome, String nascimento, String cpf, 
            String telefone, String sexo, String email, String rua, String numero, String bairro, 
            String cep, String cidade, String estado, String telefoneRecado, int id) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.email = email;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.telefoneRecado = telefoneRecado;
        this.id = id;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getNascimento() {return nascimento;}
    public void setNascimento(String nascimento) {this.nascimento = nascimento;}
    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getRua() {return rua;}
    public void setRua(String rua) {this.rua = rua;}
    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}
    public String getBairro() {return bairro;}
    public void setBairro(String bairro) {this.bairro = bairro;}
    public String getCep() {return cep;}
    public void setCep(String cep) {this.cep = cep;}
    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    public String getTelefoneRecado() {return telefoneRecado;}
    public void setTelefoneRecado(String telefoneRecado) {this.telefoneRecado = telefoneRecado;}  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.nascimento);
        hash = 53 * hash + Objects.hashCode(this.cpf);
        hash = 53 * hash + Objects.hashCode(this.telefone);
        hash = 53 * hash + Objects.hashCode(this.sexo);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + Objects.hashCode(this.rua);
        hash = 53 * hash + Objects.hashCode(this.numero);
        hash = 53 * hash + Objects.hashCode(this.bairro);
        hash = 53 * hash + Objects.hashCode(this.cep);
        hash = 53 * hash + Objects.hashCode(this.cidade);
        hash = 53 * hash + Objects.hashCode(this.estado);
        hash = 53 * hash + Objects.hashCode(this.telefoneRecado);
        hash = 53 * hash + this.id;
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
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return Objects.equals(this.telefoneRecado, other.telefoneRecado);
    }

    @Override
    public String toString() {
        return getNome();
//        return "Cliente{" + "nome=" + nome + ", nascimento=" + nascimento + ", cpf=" + cpf + ", telefone=" 
//                + telefone + ", sexo=" + sexo + ", email=" + email + ", rua=" + rua + ", numero=" + numero + 
//                ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + 
//                ", telefoneRecado=" + telefoneRecado + ", id=" + id + '}';
    }

    public String getDataPerfuracao() {return dataPerfuracao;}
    public void setDataPerfuracao(String dataPerfuracao) {this.dataPerfuracao = dataPerfuracao;}
    public String getValor() {return valor;}
    public void setValor(String valor) {this.valor = valor;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
    public String getLocal() {return local;}
    public void setLocal(String local) {this.local = local;}
    
    

    

    
}
    



