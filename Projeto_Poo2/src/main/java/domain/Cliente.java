package domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Cliente extends Pessoa {
    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "rg")
    private String rg;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Orcamento> orcamentos;

    public Cliente() {
    }

}
