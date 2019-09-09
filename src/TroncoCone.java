/*
        tronco de cone usam a
        formula (1/3 * Pi * altura * (raio_da_base^2 + raio_da_base * raio_do_tipo +
        raio_do_topo^2)).
 */
public class TroncoCone extends Embalagem {

    private double altura;
    private double raioBase;
    private double raioTopo;
    private double volume;


    public TroncoCone(String codigoRef, double custoUnit, double raioBase, double raioTopo, double altura) {
        super(codigoRef, custoUnit);
        this.altura=altura;
        this.raioBase=raioBase;
        this.raioTopo=raioTopo;
        this.volume=Math.PI*altura*(1.0/3)*(raioBase*raioBase + raioBase*raioTopo + raioTopo*raioTopo);
    }

    public double getAltura() {        return altura;    }

    public void setAltura(double altura) {        this.altura = altura;    }

    public double getRaioBase() {        return raioBase;    }

    public void setRaioBase(double raioBase) {        this.raioBase = raioBase;    }

    public double getRaioTopo() {        return raioTopo;    }

    public void setRaioTopo(double raioTopo) {        this.raioTopo = raioTopo;    }

    public double getVolume() {        return volume;    }

    @Override
    public String toString() {
        return super.toString() + " Volume: " + volume;
    }
}
