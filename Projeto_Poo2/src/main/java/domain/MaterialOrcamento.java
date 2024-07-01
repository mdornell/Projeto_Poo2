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
}
