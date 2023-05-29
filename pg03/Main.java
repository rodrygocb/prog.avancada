package pg03;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNome("feijão");
    
        Produto p2 = new Produto();
        p2.setNome("arroz");
    
        Cartaz cartaz = new Cartaz();
    
        ItemCartaz ic1 = new ItemCartaz();
        ic1.setProduto(p1);
        ic1.setPreco(5.0);

        ItemCartaz ic2 = new ItemCartaz();
        ic2.setProduto(p2);
        ic2.setPreco(4.5);

        cartaz.additem(ic1);
        cartaz.additem(ic2);

    
        System.out.println("Produto | Preço");

        List itens = cartaz.getItens();
        for (int i = 0; i < itens.size(); i++){
            ItemCartaz ic = (ItemCartaz)itens.get(i);
            
            System.out.print(ic.getProduto().getNome()+" | ");
            System.out.println(ic.getPreco());
        }
    }

    
}

