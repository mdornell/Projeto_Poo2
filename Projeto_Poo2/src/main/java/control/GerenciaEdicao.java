package control;

import java.util.ArrayList;
import java.util.List;

import domain.*;


public class GerenciaEdicao {
    private Pessoa pessoaSelecionada;
    private Orcamento orcamentoSelecionado;
    private List<Material> materialSelecionado;

    GerenciaEdicao(){
        this.pessoaSelecionada = null;
        this.orcamentoSelecionado = null;
        this.materialSelecionado = new ArrayList<Material>();
    }
    //---------------------------------------------------------
    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }
    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }
    public Orcamento getOrcamentoSelecionado() {
        return orcamentoSelecionado;
    }
    public void setOrcamentoSelecionado(Orcamento orcamentoSelecionado) {
        this.orcamentoSelecionado = orcamentoSelecionado;
    }
    public List<Material> getMaterialSelecionado() {
        return materialSelecionado;
    }
    public void addMaterialSelecionado(Material materialSelecionado) {
        this.materialSelecionado.add(materialSelecionado);
    }
    
}
