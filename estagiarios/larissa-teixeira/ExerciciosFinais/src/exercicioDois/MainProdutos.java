
package exercicioDois;

import java.math.BigDecimal;

public class MainProdutos extends BuscaProdutos{

    public static void main(String[] args) throws Exception {
        Catalogo pesquisa = new BuscaProdutos();
        pesquisa.cargaInicial();
        Produto produto = new Produto(1233, " ", new BigDecimal("2.00"));
        Produto produto2 = new Produto(2134, " ", new BigDecimal("3.00"));
        pesquisa.adicionarProduto(produto);
        pesquisa.adicionarProduto(produto2);
        System.out.println("Produtos: ");
        pesquisa.exibirProdutos();
        System.out.println("Produto encontrado: ");
        Produto encontrado = pesquisa.obterProduto(3564);
        System.out.println(encontrado.toString());
    }
}
