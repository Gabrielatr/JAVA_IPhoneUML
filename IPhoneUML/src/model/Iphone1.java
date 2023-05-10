package model;

import repository.IPhone;

public class Iphone1 extends IPhone {

    /* Construtores */

    @Override
    public int getAno() {
        return super.getAno();
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public void setAno(int ano) {
        super.setAno(ano);
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    /* Métodos */

    /*Ligação*/
    @Override
    public void ligar_para(int numeroDestino) {
        super.ligar_para(numeroDestino);
    }

    @Override
    public void receberligacao() {
        super.receberligacao();
    }

    @Override
    public void desligarLigacao() {
        super.desligarLigacao();
    }

    /*web*/

    @Override
    public void RequisicaoSite(String URL) {
        super.RequisicaoSite(URL);
    }

    @Override
    public void atualizarPagina() {
        super.atualizarPagina();
    }

    @Override
    public void adicionarAba() {
        super.adicionarAba();
    }

    @Override
    public void FecharSite() {
        super.FecharSite();
    }

    /*Musica*/

    @Override
    public void selecionarMusica(String nome) {
        super.selecionarMusica(nome);
    }

    @Override
    public void Pausar() {
        super.Pausar();
    }

    @Override
    public void Desligar() {
        super.Desligar();
    }

}
