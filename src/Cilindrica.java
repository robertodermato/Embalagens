/*
        as embalagens cilíndricas usam a mesma lógica, só que a área da
        base é a área de um círculo (PI * raio ^2); as embalagens cônicas usam a seguinte
        fórmula: (Pi*raio^2*altura)/3 e as que correspondem a um tronco de cone usam a
        formula (1/3 * Pi * altura * (raio_da_base^2 + raio_da_base * raio_do_tipo +
        raio_do_topo^2)).
 */

public class Cilindrica extends Embalagem {

    private double raio;
    private double altura;
    private double volume;

    public Cilindrica(String codigoRef, double custoUnit, double raio, double altura) {
        super(codigoRef, custoUnit);
        this.raio=raio;
        this.altura=altura;
        volume = raio*Math.PI*raio*altura;
    }

    public double getRaio() {        return raio;    }

    public void setRaio(double raio) {        this.raio = raio;    }

    public double getAltura() {        return altura;    }

    public void setAltura(double altura) {        this.altura = altura;    }

    public double getVolume() {        return volume;    }

    @Override
    public String toString() {
        return super.toString() + " Volume: " + volume;
    }

}
