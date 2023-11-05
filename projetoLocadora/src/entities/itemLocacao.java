package entities;

public class itemLocacao {

    private int id;
    private double valor;
    filme filme;
    jogo jogo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public filme getFilme() {
        return filme;
    }

    public void setFilme(filme filme) {
        this.filme = filme;
    }

    public jogo getJogo() {
        return jogo;
    }

    public void setJogo(jogo jogo) {
        this.jogo = jogo;
    }
}
