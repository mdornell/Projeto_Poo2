package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class TipoServico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "valor")
    private double valor;
    
    @OneToMany(mappedBy = "tipoServico", fetch = FetchType.EAGER)
    private List<Orcamento> orcamentos;

    public TipoServico() {
    }
    
}
