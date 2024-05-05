package domain;


import java.io.Serializable;
import javax.persistence.*;


@Entity
public class TipoServico implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoServico;
    
    @Column (name="descricaoTipoServico")
    private String descricao;
    
    @Column (name = "valorTipoServico")
    private double valor;

    public TipoServico() {
    }

    public TipoServico(int idTipoServico, String descricao, double valor) {
        this.idTipoServico = idTipoServico;
        this.descricao = descricao;
        this.valor = valor;
    }

    public TipoServico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public int getIdTipoServico() {
        return idTipoServico;
    }

    public void setIdTipoServico(int idTipoServico) {
        this.idTipoServico = idTipoServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    

    
}
