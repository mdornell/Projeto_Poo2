package domain;

import java.io.Serializable;
import java.text.ParseException;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "celular")
    private String celular;

    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "enderecoId")
    private Endereco endereco;

    public Pessoa() {
    }
    
    public Pessoa(String nome, String celular, String email, Endereco endereco) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
    }

    public Pessoa(int id, String nome, String celular, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public Object toArray() throws ParseException {
        return this;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
