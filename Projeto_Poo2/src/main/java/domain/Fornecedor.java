package domain;

import javax.persistence.*;

@Entity
public class Fornecedor extends Pessoa {

    @Column(name = "cnpj")
    private String cnpj;

    public Fornecedor(Long idFornecedor, String cnpj, int idPessoa, String nome, String celular, String email, Endereco endereco) {
        super(idPessoa, nome, celular, email, endereco);
        this.cnpj = cnpj;
    }

    public Fornecedor(String cnpj, String nome, String celular, String email, Endereco endereco) {
        super(nome, celular, email, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
