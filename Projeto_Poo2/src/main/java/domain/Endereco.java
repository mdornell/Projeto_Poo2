package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cep")
    private String cep;

    @Column(name = "rua")
    private String rua;

    @Column(name = "num")
    private int num;
    
    @Column(name = "referencia")
    private String referencia;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "endereco", fetch = FetchType.LAZY)
    private List<Pessoa> pessoas;

    public Endereco() {
    }

    public Endereco(String cep, String rua, int num,String referencia ,String bairro, String cidade, String estado) {
        this.cep = cep;
        this.rua = rua;
        this.num = num;
        this.referencia = referencia;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

}