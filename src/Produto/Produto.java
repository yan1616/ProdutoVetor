package Produto;

public class Produto {

    private String nomeProd;
    private double precoProd;

    public Produto(String nomeProd, double precoProd) {
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

}