package domain;

public class MaterialOrcamento {

    private double precoVenda;
    private int qtdVenda;
    private Orcamento orcamento;
    private Material material;

    public MaterialOrcamento(double precoVenda, int qtdVenda, Orcamento orcamento, Material material) {
        this.precoVenda = precoVenda;
        this.qtdVenda = qtdVenda;
        this.orcamento = orcamento;
        this.material = material;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

}
