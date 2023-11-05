package testes;

import entities.categoria;
import persistencia.CategoriaDAO;

public class TesteCategoria {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        categoria categoria = new categoria();
        categoria.setNome("Ação");
        categoria.setTipo('F');

        CategoriaDAO.inserir(categoria);
        //categoria.setId(1);
        //System.out.println(CategoriaDAO.alterar(categoria));

        //System.out.println(CategoriaDAO.excluir(2));
        //System.out.println(CategoriaDAO.listar());
    }
}
