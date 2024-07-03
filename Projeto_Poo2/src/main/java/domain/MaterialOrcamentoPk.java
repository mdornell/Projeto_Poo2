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

    public MaterialOrcamentoPk(Orcamento orcamento, Material material) {
        this.orcamento = orcamento;
        this.material = material;
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
