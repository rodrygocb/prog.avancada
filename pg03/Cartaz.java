package pg03;


import java.util.List;
import java.util.ArrayList;

public class Cartaz {
    

    /**
     *
     */
    List itensCartaz = new ArrayList();
    
    public void additem(ItemCartaz ic){
        itensCartaz.add(ic);
    }

    public List getItens(){
        return this.itensCartaz;
    }
}
 
