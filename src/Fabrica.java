import java.util.ArrayList;

public class Fabrica {

    private ArrayList<Embalagem> estoque;
    private String nome;

    public Fabrica(String nome) {
        this.nome = nome;
        estoque = new ArrayList<Embalagem>();
    }

    public void cadastrar (Embalagem emb){
        estoque.add(emb);
    }

    public String getNome() {        return nome;    }

    public void setNome(String nome) {        this.nome = nome;    }

    @Override
    public String toString() {
        String est="";

        for (Embalagem emb: estoque){
            est = est + (emb.getClass().getName()) + " - " + emb + "\n";
        }

        return "Fábrica: " + nome + "\nEstoque:\n" + est;
    }
}
