package entities;

public class item {

    public item(categoria categoria) {
        this.categoria = categoria;
    }

    private int id;
    private String titulo;
    private String descricao;
    private double preco;
    private int numeroDias;
    private categoria categoria;
}
