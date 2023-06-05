package modelo;

import java.util.Objects;

public class Relatorios {
    private String material;
    private double valorMaterial;
    private int quantidade;
    private double qtdPerf;
    private double valorPerf;
    private int id;
    
    public Relatorios(){
        
    }

    public Relatorios(String material, double valorMaterial, int quantidade, double qtdPerf, double valorPerf) {
        this.material = material;
        this.valorMaterial = valorMaterial;
        this.quantidade = quantidade;
        this.qtdPerf = qtdPerf;
        this.valorPerf = valorPerf;
    }

    public Relatorios(String material, double valorMaterial, int quantidade, double qtdPerf, double valorPerf, int id) {
        this.material = material;
        this.valorMaterial = valorMaterial;
        this.quantidade = quantidade;
        this.qtdPerf = qtdPerf;
        this.valorPerf = valorPerf;
        this.id = id;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public double getValorMaterial() { return valorMaterial; }
    public void setValorMaterial(double valorMaterial) { this.valorMaterial = valorMaterial; }
    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
    public double getQtdPerf() {return qtdPerf;}
    public void setQtdPerf(double qtdPerf) {this.qtdPerf = qtdPerf;}
    public double getValorPerf() {return valorPerf;}
    public void setValorPerf(double valorPerf) {this.valorPerf = valorPerf;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.material);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.valorMaterial) ^ (Double.doubleToLongBits(this.valorMaterial) >>> 32));
        hash = 41 * hash + this.quantidade;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.qtdPerf) ^ (Double.doubleToLongBits(this.qtdPerf) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.valorPerf) ^ (Double.doubleToLongBits(this.valorPerf) >>> 32));
        hash = 41 * hash + this.id;
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
        final Relatorios other = (Relatorios) obj;
        if (Double.doubleToLongBits(this.valorMaterial) != Double.doubleToLongBits(other.valorMaterial)) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (Double.doubleToLongBits(this.qtdPerf) != Double.doubleToLongBits(other.qtdPerf)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorPerf) != Double.doubleToLongBits(other.valorPerf)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.material, other.material);
    }

    @Override
    public String toString() {
        return "Relatorios{" + "material=" + material + ", valorMaterial=" + valorMaterial + ", quantidade=" + quantidade + ", qtdPerf=" + qtdPerf + ", valorPerf=" + valorPerf + ", id=" + id + '}';
    }
    
    
    
}
