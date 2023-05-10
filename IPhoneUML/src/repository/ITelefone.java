package repository;

public interface ITelefone {
    public final int numero = 123456789;

    public void ligar_para(int numeroDestino);
    public void receberligacao();
    public void desligarLigacao();
    public void correioVoz();
}
