package domain;

import java.io.Serializable;
import javax.persistence.*;


@Embeddable
public class MaterialOrcamentoPk implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orcamentoId")
    private Orcamento orcamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materialId")
    private Material material;

    public MaterialOrcamentoPk() {
    }
}
