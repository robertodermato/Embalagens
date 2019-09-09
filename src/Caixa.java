/*
 embalagens do tipo caixa (paralelepípedo) tem seu volume
 calculado multiplicando-se a área da base (lado1 * lado2) pela altura;
 */

public class Caixa extends Embalagem {

    private double lado1;
    private double lado2;
    private double volume;
    private double base;

    public Caixa(String codigoRef, double custoUnit, double lado1, double lado2, double base) {
        super(codigoRef, custoUnit);
        this.lado1=lado1;
        this.lado2=lado2;
        this.base=base;
        volume = base*lado1*lado2;
    }

    public double getLado1() {        return lado1;    }

    public void setLado1(double lado1) {        this.lado1 = lado1;    }

    public double getLado2() {        return lado2;    }

    public void setLado2(double lado2) {        this.lado2 = lado2;    }

    public double getBase() {        return base;    }

    public void setBase(double base) {        this.base = base;    }

    public double getVolume() {        return volume;    }

    @Override
    public String toString() {
        return super.toString() + " Volume:" + volume;
    }
}
