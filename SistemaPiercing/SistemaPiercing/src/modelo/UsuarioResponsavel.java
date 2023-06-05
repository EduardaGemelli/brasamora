package modelo;

import java.util.Objects;

public class UsuarioResponsavel {
    private String nomeResp;
    private String rgResp;
    private String cpfResp;
    private String nascResp;
    private String sexoResp;

    public UsuarioResponsavel() {
    }

    public UsuarioResponsavel(String nomeResp, String rgResp, String cpfResp, String nascResp, String sexoResp) {
        this.nomeResp = nomeResp;
        this.rgResp = rgResp;
        this.cpfResp = cpfResp;
        this.nascResp = nascResp;
        this.sexoResp = sexoResp;
    }

    public String getNomeResp() {return nomeResp;}
    public void setNomeResp(String nomeResp) {this.nomeResp = nomeResp;}
    public String getRgResp() {return rgResp;}
    public void setRgResp(String rgResp) {this.rgResp = rgResp;}
    public String getCpfResp() {return cpfResp;}
    public void setCpfResp(String cpfResp) {this.cpfResp = cpfResp;}
    public String getNascResp() {return nascResp;}
    public void setNascResp(String nascResp) {this.nascResp = nascResp;}
    public String getSexoResp() {return sexoResp;}
    public void setSexoResp(String sexoResp) {this.sexoResp = sexoResp;}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nomeResp);
        hash = 47 * hash + Objects.hashCode(this.rgResp);
        hash = 47 * hash + Objects.hashCode(this.cpfResp);
        hash = 47 * hash + Objects.hashCode(this.nascResp);
        hash = 47 * hash + Objects.hashCode(this.sexoResp);
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
        final UsuarioResponsavel other = (UsuarioResponsavel) obj;
        if (!Objects.equals(this.nomeResp, other.nomeResp)) {
            return false;
        }
        if (!Objects.equals(this.rgResp, other.rgResp)) {
            return false;
        }
        if (!Objects.equals(this.cpfResp, other.cpfResp)) {
            return false;
        }
        if (!Objects.equals(this.nascResp, other.nascResp)) {
            return false;
        }
        return Objects.equals(this.sexoResp, other.sexoResp);
    }

    @Override
    public String toString() {
        return "UsuarioResponsavel{" + "nomeResp=" + nomeResp + ", rgResp=" + rgResp + 
                ", cpfResp=" + cpfResp + ", nascResp=" + nascResp + ", sexoResp=" + sexoResp + '}';
    }
    
    
    
}
