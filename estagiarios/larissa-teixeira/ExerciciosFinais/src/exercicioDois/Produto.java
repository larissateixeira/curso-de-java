/*2 - Crie um pacote produtos. Dentro dele crie a classe Produto com os atributos
 * codigo (Integer), descricao (String) e preco (BigDecimal). Crie para ela os
 * métodos equals e hashCode (baseados no codigo), e faça com que implemente
 * Comparable<Produto> baseando o compareTo na descrição. Sobrescreva também o
 * método toString. Crie uma classe BuscaProdutos com um atributo TreeSet de
 * produtos e com os métodos obterProduto(Integer codigo), exibirProdutos() e
 * cargaInicial(). O método carga inicial será chamado para inicializar o treeset
 * com alguns produtos. Crie uma exceção chamada ProdutoNaoEncontradoException que
 * será lançada quando obterProduto não encontrar o produto referente ao código
 * informado. Crie um método main para testar tudo que foi feito.*/

package exercicioDois;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    Integer codigo;
    String descricao;
    BigDecimal preco;
    
    Produto(){}

    public Produto(int codigo, String descricao, BigDecimal preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
    @Override
    public boolean equals(Object code) {
        if (code == null) {
            return false;
        }
        if (getClass() != code.getClass()) {
            return false;
        }
        final Produto other = (Produto) code;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public int hashCode(){
        int hash;
        hash = 17 * (codigo != null ? codigo.hashCode() : 0);
        hash += 17 * (preco != null ? preco.hashCode() : 0);
        hash += 17 * (descricao != null ? descricao.hashCode() : 0);
        return hash;
    }
    
    @Override
    public String toString(){
        return codigo + " " + descricao + " " + preco;
    }

    @Override
    public int compareTo(Produto produto) {
                 if (produto.codigo == null) {
            return -1;
        }
        if (this.codigo < produto.codigo) {
            return -1;
        }
        if (this.codigo > produto.codigo) {
            return 1;
        }
        return 0;   }
    
    
}
