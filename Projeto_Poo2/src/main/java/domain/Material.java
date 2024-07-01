package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Material implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "precoCompra")
    private double precoCompra;

    @Column(name = "qtdEstoque")
    private int qtdEstoque;

    @OneToMany(mappedBy = "chComposta.material", fetch = FetchType.LAZY)
    private List<MaterialOrcamento> material = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fornecedorId")
    private Fornecedor fornecedor;

    public Material() {
    }

}
