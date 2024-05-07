package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Material implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaterial;

    @Column
    private String descricao;

    @Column
    private double pecoCompra;

    @Column
    private int qtdEstoque;
    
    @OneToMany(mappedBy = "chComposta.material", fetch = FetchType.LAZY)
     private List<MaterialOrcamento> material = new ArrayList<>();
    
    @Transient
//    @OneToMany(mappedBy = "material", fetch = FetchType.EAGER)
    private Fornecedor fornecedor;

    public Material(int idMaterial, String descricao, double pecoCompra, int qtdEstoque, Fornecedor fornecedor) {
        this.idMaterial = idMaterial;
        this.descricao = descricao;
        this.pecoCompra = pecoCompra;
        this.qtdEstoque = qtdEstoque;
        this.fornecedor = fornecedor;
    }

    public Material(String descricao, double pecoCompra, int qtdEstoque, Fornecedor fornecedor) {
        this.descricao = descricao;
        this.pecoCompra = pecoCompra;
        this.qtdEstoque = qtdEstoque;
        this.fornecedor = fornecedor;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
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

    public List<MaterialOrcamento> getMaterial() {
        return material;
    }

    public void setMaterial(List<MaterialOrcamento> material) {
        this.material = material;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    

}
