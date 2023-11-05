package entities;

public class jogo extends item{

    private int memoria;
    private int tipo;

    public jogo(categoria categoria){
        super(categoria);
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
