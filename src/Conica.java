/*
        as embalagens cônicas usam a seguinte
        fórmula: (Pi*raio^2*altura)/3 e as que correspondem a um tronco de cone usam a
        formula (1/3 * Pi * altura * (raio_da_base^2 + raio_da_base * raio_do_tipo +
        raio_do_topo^2)).
 */
public class Conica extends Embalagem {

    private double raio;
    private double altura;
    private double volume;

    public Conica(String codigoRef, double custoUnit, double raio, double altura) {
        super(codigoRef, custoUnit);
        this.raio=raio;
        this.altura=altura;
        this.volume=Math.PI*raio*raio*altura*1.0/3;
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
