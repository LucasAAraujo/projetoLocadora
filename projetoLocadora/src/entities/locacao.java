package entities;

import java.util.ArrayList;
import java.util.Date;

public class locacao {

    private int id;
    private double valor;
    private Date data;
    private ArrayList<itemLocacao> itensLocacao;
    private cliente cliente;
    private usuario usuario;

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<itemLocacao> getItensLocacao() {
        return itensLocacao;
    }

    public void setItensLocacao(ArrayList<itemLocacao> itensLocacao) {
        this.itensLocacao = itensLocacao;
    }

    public entities.cliente getCliente() {
        return cliente;
    }

    public void setCliente(entities.cliente cliente) {
        this.cliente = cliente;
    }

    public entities.usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(entities.usuario usuario) {
        this.usuario = usuario;
    }
}
