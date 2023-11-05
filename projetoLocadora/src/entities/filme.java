package entities;

public class filme extends item{

    private String diretor;
    private int duracao;

    public filme (categoria categoria) {
        super(categoria);
    }
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
