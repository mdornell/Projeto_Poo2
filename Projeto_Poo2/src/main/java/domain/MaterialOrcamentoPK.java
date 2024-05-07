/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Marco
 */
@Embeddable
public class MaterialOrcamentoPK implements Serializable {
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orcamento_id")
//    @Transient
    private Orcamento orcamento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "material_id")
//    @Transient
    private Material material;

    public MaterialOrcamentoPK(Orcamento orcamento, Material material) {
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

