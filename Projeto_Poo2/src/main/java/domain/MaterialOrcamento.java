package domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class MaterialOrcamento implements Serializable {
    
    @EmbeddedId
    private MaterialOrcamentoPk chComposta;
    
    @Column(name = "preco_venda")
    private double precoVenda;
    
    @Column(name = "quantidade")
    private int quantidade;
    
    public MaterialOrcamento() {
    }

    public MaterialOrcamento(MaterialOrcamentoPk chComposta, double precoVenda, int quantidade) {
        this.chComposta = chComposta;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
    }

    public MaterialOrcamentoPk getChComposta() {
        return chComposta;
    }

    public void setChComposta(MaterialOrcamentoPk chComposta) {
        this.chComposta = chComposta;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
