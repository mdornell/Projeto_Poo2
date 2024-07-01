package domain;

import java.io.Serializable;
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
    
}
