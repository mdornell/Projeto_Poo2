/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int idPessoa;

    @Column(name = "nome")
    private String nome;

    @Column(name = "celular")
    private String celular;

    @Column(name = "email")
    private String email;

    @Transient
//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Pessoa(String nome, String celular, String email, Endereco endereco) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
    }
    
    public Pessoa(int idPessoa, String nome, String celular, String email, Endereco endereco) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
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

}
