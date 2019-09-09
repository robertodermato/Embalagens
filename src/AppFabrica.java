public class AppFabrica {

    public static void main (String args[]){

        Fabrica caixolandia = new Fabrica("Caixolândia");

        Embalagem caixa1 = new Caixa ("12",1.2,5,5,5);
        Embalagem caixa2 = new Caixa ("13",1.5,6,6,6);

        caixolandia.cadastrar(caixa1);
        caixolandia.cadastrar(caixa2);

        System.out.print (caixolandia);

    }
}
