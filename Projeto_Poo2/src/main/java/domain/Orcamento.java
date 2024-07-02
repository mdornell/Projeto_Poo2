package domain;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Orcamento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "metrosQuad")
    private double metrosQuad;
    
    @Column(name = "valor")
    private double valor;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clienteId")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipoServicoId")
    private TipoServico tipoServico;
    
    @OneToMany(mappedBy = "chComposta.orcamento", fetch = FetchType.EAGER)
    private List<MaterialOrcamento> materialOrcamentos = new ArrayList<>();

    public Orcamento() {
    }

    public Orcamento(String descricao, double metrosQuad, double valor, Cliente cliente, TipoServico tipoServico,
            List<MaterialOrcamento> materialOrcamentos) {
        this.descricao = descricao;
        this.metrosQuad = metrosQuad;
        this.valor = valor;
        this.cliente = cliente;
        this.tipoServico = tipoServico;
        this.materialOrcamentos = materialOrcamentos;
    }

    public int getId() {
        return id;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public List<MaterialOrcamento> getMaterialOrcamentos() {
        return materialOrcamentos;
    }

    public void setMaterialOrcamentos(List<MaterialOrcamento> materialOrcamentos) {
        this.materialOrcamentos = materialOrcamentos;
    }

    public Object[] toArray() throws ParseException {
        return new Object[]{this, this.cliente, this.valor};
    }

    @Override
    public String toString() {
        return this.descricao;
    }

    

    
}
