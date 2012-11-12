/*Crie uma classe BuscaProdutos com um atributo TreeSet de
 * produtos e com os métodos obterProduto(Integer codigo), exibirProdutos() e
 * cargaInicial(). O método carga inicial será chamado para inicializar o treeset
 * com alguns produtos. Crie uma exceção chamada ProdutoNaoEncontradoException que
 * será lançada quando obterProduto não encontrar o produto referente ao código
 * informado. Crie um método main para testar tudo que foi feito.*/
package exercicioDois;

import java.util.Iterator;
import java.util.TreeSet;

public class BuscaProdutos implements Catalogo{
    TreeSet <Produto> catalogo;

    @Override
    public void adicionarProduto(Produto produto){
        catalogo.add(produto);
    }
    
    
    @Override
    public Produto obterProduto(Integer codigo)throws Exception{
        if(catalogo.isEmpty())
            throw new ProdutoNaoEncontradoException();
        
        Iterator<Produto> produto = catalogo.iterator();
        while(produto.hasNext()){
            if(produto.next().codigo.equals(codigo))
                return produto.next();
            if(!produto.hasNext()){
                throw new ProdutoNaoEncontradoException();
            }
        }
        throw new ProdutoNaoEncontradoException();
    }
    @Override
    public void exibirProdutos(){
        System.out.println(catalogo);
    }
    
    @Override
    public void cargaInicial(){
        this.catalogo = new TreeSet<>();
    }
    
    
}
