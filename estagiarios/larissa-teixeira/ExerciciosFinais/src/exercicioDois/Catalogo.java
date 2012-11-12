
package exercicioDois;

public interface Catalogo{
    public Produto obterProduto(Integer codigo)throws Exception;
    public void exibirProdutos();
    public void cargaInicial();
    public void adicionarProduto(Produto produto);
}
