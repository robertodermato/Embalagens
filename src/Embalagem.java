/*
        Uma fábrica de embalagens para bebidas armazena sobre cada modelo de embalagem
        que fabrica seu código de referência e custo unitário. O volume de líquido que cada
        uma pode armazenar varia conforme o modelo: embalagens do tipo caixa
        (paralelepípedo) tem seu volume calculado multiplicando-se a área da base (lado1 *
        lado2) pela altura; as embalagens cilíndricas usam a mesma lógica, só que a área da
        base é a área de um círculo (PI * raio ^2); as embalagens cônicas usam a seguinte
        fórmula: (Pi*raio^2*altura)/3 e as que correspondem a um tronco de cone usam a
        formula (1/3 * Pi * altura * (raio_da_base^2 + raio_da_base * raio_do_tipo +
        raio_do_topo^2)). Implemente uma hierarquia de classes que modele esta situação.
        Defina um método “toString” capaz de retorna uma string com o código do modelo, o
        modelo de embalagem (this.getClass().getName()), o custo unitário e o
        volume que armazena. Faça um exemplo de uso.
*/

public abstract class Embalagem {

    private String codigoRef;
    private double custoUnit;

    public Embalagem (String codigoRef, double custoUnit) {
        this.codigoRef = codigoRef;
        this.custoUnit = custoUnit;
    }

    public String getCodigoRef() {        return codigoRef;    }

    public void setCodigoRef(String codigoRef) {        this.codigoRef = codigoRef;    }

    public double getCustoUnit() {        return custoUnit;    }

    public void setCustoUnit(double custoUnit) {        this.custoUnit = custoUnit;    }

    @Override
    public String toString() {
        return "Código: " + codigoRef + " Custo: R$ " + custoUnit;
    }
}
