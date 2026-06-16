package app.model;

import app.enums.Porte;
import app.enums.TipoTracao;

/**
 * // HERANCA
 * Subclasse especializada que estende a estrutura abstrata de Maquina,
 * adicionando ferramentas de braco hidraulico e cacamba para operacoes em terra.
 */
public class Escavadeira extends Maquina {
    private double capacidadeCacambaM3;
    private double alcanceMetros;

    public Escavadeira(String nome, double pesoToneladas, int anoFabricacao, TipoTracao tipoTracao, Porte porte, double capacidadeCacambaM3, double alcanceMetros) {
        super(nome, pesoToneladas, anoFabricacao, tipoTracao, porte);
        this.capacidadeCacambaM3 = capacidadeCacambaM3;
        this.alcanceMetros = alcanceMetros;
    }

    @Override
    public void operar() {
        System.out.println("A escavadeira " + getNome() + " iniciou o ciclo de escavacao e remocao de terra.");
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Capacidade da Cacamba: " + this.capacidadeCacambaM3 + " m3");
        System.out.println("Alcance Maximo: " + this.alcanceMetros + " metros");
    }

    // // OVERLOAD
    public void operar(int horas) {
        double consumoEstimado = horas * 15.5;
        System.out.println("Trabalhando por " + horas + " horas. Consumo projetado de diesel: " + consumoEstimado + " litros.");
    }

    public double getCapacidadeCacambaM3() { return capacidadeCacambaM3; }
    public double getAlcanceMetros() { return alcanceMetros; }
}