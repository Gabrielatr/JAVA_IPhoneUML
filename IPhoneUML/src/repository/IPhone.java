package repository;

import java.util.Scanner;

public abstract class IPhone implements ITelefone, INavegadorWeb, IMusica {
    public String modelo;
    public int ano;

    /* Construtores */

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /* Métodos */

    /** Telefone **/

    @Override
    public void ligar_para(int numeroDestino){
        System.out.println("Ligação do número " + ITelefone.numero + " para " + numeroDestino);
    }

    @Override
    public void receberligacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Telefone tocando...");
        System.out.println("[pressione enter para receber a ligação]");
        System.out.println("[insira qualquer tecla para ignorar]");
        
        if(sc.nextLine().isEmpty())
        {
            System.out.println("Ligação atendida");
            desligarLigacao();
        }else{
            System.out.println("Ligação perdida");
            correioVoz();
        }

        sc.close();
    }

    @Override
    public void desligarLigacao(){
        System.out.println("Ligação encerrada");
    }

    @Override
    public void correioVoz() {
        System.out.println("Correio de Voz...");
    }

    /** Web **/

    @Override
    public void RequisicaoSite(String URL) {
        System.out.println("Página carregada! Bem vindo ao site " + URL);
    }

    @Override
    public void FecharSite() {
        System.out.println("Site fechado");
    }

    /** Musica **/

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Música selecionada: " + nomeMusica);
    }

    @Override
    public void tocarMusica() {
        System.out.println("Musica tocando");
    }

    @Override
    public void Pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void Desligar() {
        System.out.println("Música desligada");
    }

}
