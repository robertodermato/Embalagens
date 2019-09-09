public class AppFabrica {

    public static void main (String args[]){

        Fabrica caixolandia = new Fabrica("Caixolândia");

        Embalagem caixa1 = new Caixa ("12",1.2,5,5,5);
        Embalagem caixa2 = new Caixa ("13",1.5,6,6,6);
        Embalagem conica1 = new Conica("21", 2, 2, 3);
        Embalagem cilindrica1 = new Cilindrica("31", 4, 4, 4);
        Embalagem troncoCone1 = new TroncoCone("41", 5, 3, 2,5);

        caixolandia.cadastrar(caixa1);
        caixolandia.cadastrar(caixa2);
        caixolandia.cadastrar(conica1);
        caixolandia.cadastrar(cilindrica1);
        caixolandia.cadastrar(troncoCone1);

        System.out.print (caixolandia);

    }
}
