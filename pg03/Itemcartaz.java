package pg03;


public class ItemCartaz {
    double preco; 
    Produto produto;

    public void setProduto(Produto produto) {
        this.produto = produto;
        }
    
    public Produto getProduto() {
        return this.produto;
        }  

    public void setPreco(Double preco) {
        this.preco = preco;
        }
        
    public Double getPreco() {
        return this.preco;
        }  
}
