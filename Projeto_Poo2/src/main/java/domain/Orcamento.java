package domain;

public class Orcamento {
    private String descricao;
    private double metrosQuad;
    private double valor;
    private TipoServico servico;
    
    public Orcamento(String descricao, double metrosQuad, double valor, TipoServico servico) {
        this.descricao = descricao;
        this.metrosQuad = metrosQuad;
        this.valor = valor;
        this.servico = servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getMetrosQuad() {
        return metrosQuad;
    }

    public void setMetrosQuad(double metrosQuad) {
        this.metrosQuad = metrosQuad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoServico getServico() {
        return servico;
    }

    public void setServico(TipoServico servico) {
        this.servico = servico;
    }
    
    

    
}
