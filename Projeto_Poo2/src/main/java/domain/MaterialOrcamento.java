package domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class MaterialOrcamento implements Serializable {

    @EmbeddedId
    private MaterialOrcamentoPK chComposta;

    @Column(name = "preco_venda")
    private double precoVenda;

    @Column(name = "qtd_venda")
    private int qtdVenda;

    public MaterialOrcamento(Orcamento orcamento, Material material , double precoVenda, int qtdVenda) {
        this.chComposta = new MaterialOrcamentoPK(orcamento,material);
        this.precoVenda = precoVenda;
        this.qtdVenda = qtdVenda;
    }

    public MaterialOrcamento(double precoVenda, int qtdVenda) {
        this.precoVenda = precoVenda;
        this.qtdVenda = qtdVenda;
    }

    public MaterialOrcamentoPK getIdMaterialOrcamento() {
        return chComposta;
    }

    public void setIdMaterialOrcamento(MaterialOrcamentoPK chComposta) {
        this.chComposta = chComposta;
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

    
    
    
    

    

}
