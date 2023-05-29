package pg04;

public class Blocolista {

    public Blocolista prox;
    public String elemento;

    public void add(String elemento) {
        Blocolista bl = new Blocolista();
        bl.elemento = elemento;
        bl.prox = this.prox;
        this.prox = bl;
    }

    public String getElemento(int i) {
        Blocolista aux = this.prox;
        int c = 0;
        while (aux != null) {
            if (c == i) {
                return aux.elemento;
            }
            aux = aux.prox;
            c++;
        }
        return null;
    }






    public static void main(String[] args) {
        Blocolista bl = new Blocolista();
        bl.add("elemento 1");
        bl.add("elemento 2");
        bl.add("elemento 3");
        System.out.println(bl.getElemento(1));
    }

}
