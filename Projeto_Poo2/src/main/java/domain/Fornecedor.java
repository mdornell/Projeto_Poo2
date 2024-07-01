package domain;

import java.util.List;
import javax.persistence.*;

@Entity
public class Fornecedor extends Pessoa {
    
    @Column(name = "cnpj")
    private String cnpj;

    @OneToMany(mappedBy = "fornecedor", fetch = FetchType.EAGER)
    private List<Material> materiais;

    public Fornecedor() {
    }
}
