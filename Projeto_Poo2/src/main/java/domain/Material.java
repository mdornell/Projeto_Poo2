package domain;

public class Material {
    private String descricao;
    private double pecoCompra;
    private int qtdEstoque;
    private Fornecedor fornecedor;
    
    public Material(String descricao, double pecoCompra, int qtdEstoque, Fornecedor fornecedor) {
        this.descricao = descricao;
        this.pecoCompra = pecoCompra;
        this.qtdEstoque = qtdEstoque;
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPecoCompra() {
        return pecoCompra;
    }

    public void setPecoCompra(double pecoCompra) {
        this.pecoCompra = pecoCompra;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
