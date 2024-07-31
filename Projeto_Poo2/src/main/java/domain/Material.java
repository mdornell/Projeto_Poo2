package domain;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Material implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "precoCompra")
    private double precoCompra;

    @Column(name = "qtdEstoque")
    private int qtdEstoque;

    @OneToMany(mappedBy = "chComposta.material", fetch = FetchType.LAZY)
    private List<MaterialOrcamento> material = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fornecedor")
    private Fornecedor fornecedor;

    public Material() {
    }

    

    public Material(int id, String nome, String descricao, double precoCompra, int qtdEstoque, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.qtdEstoque = qtdEstoque;
        this.fornecedor = fornecedor;
    }



    public Material(String nome, String descricao, double precoCompra, int qtdEstoque, Fornecedor fornecedor) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.qtdEstoque = qtdEstoque;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
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

    public Pessoa getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        
        this.fornecedor = fornecedor;
    }

    public Object[] toArray() throws ParseException {
        return new Object[]{this, this.descricao,this.precoCompra,this.qtdEstoque , this.fornecedor};
    }

    public Object[] toArray2() throws ParseException {
        return new Object[]{this, this.precoCompra};
    }

    @Override
    public String toString() {
        return nome;
    }

}
