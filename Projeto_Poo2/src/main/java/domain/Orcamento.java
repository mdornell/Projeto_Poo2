package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Orcamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrcamento;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "metros_quad")
    private double metrosQuad;

    @Column(name = "valor")
    private double valor;

    //@Transient
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_servico_id")
    private TipoServico servico;

//    @Transient
    @OneToMany(mappedBy = "chComposta.orcamento", fetch = FetchType.EAGER)
    private List<MaterialOrcamento> materialOrcamentos = new ArrayList<>();

    public Orcamento(int idOrcamento, String descricao, double metrosQuad, double valor, TipoServico servico) {
        this.idOrcamento = idOrcamento;
        this.descricao = descricao;
        this.metrosQuad = metrosQuad;
        this.valor = valor;
        this.servico = servico;
    }

    public Orcamento(String descricao, double metrosQuad, double valor, TipoServico servico) {
        this.descricao = descricao;
        this.metrosQuad = metrosQuad;
        this.valor = valor;
        this.servico = servico;
    }

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getMetrosQuad() {
        return metrosQuad;
    }

    public void setMetrosQuad(double metrosQuad) {
        this.metrosQuad = metrosQuad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoServico getServico() {
        return servico;
    }

    public void setServico(TipoServico servico) {
        this.servico = servico;
    }

    public List<MaterialOrcamento> getMaterialOrcamentos() {
        return materialOrcamentos;
    }

    public void setMaterialOrcamentos(List<MaterialOrcamento> materialOrcamentos) {
        this.materialOrcamentos = materialOrcamentos;
    }

    
    
}
