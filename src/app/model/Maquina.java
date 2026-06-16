package app.model;

import app.enums.Porte;
import app.enums.TipoTracao;

/**
 * // CLASSE ABSTRATA
 * Serve como base conceitual para construcao de qualquer maquinario de construcao.
 * Centraliza os atributos fundamentais comuns e obriga a extensao de operacao.
 */
public abstract class Maquina {
    private String nome;
    private double pesoToneladas;
    private int anoFabricacao;
    private TipoTracao tipoTracao;
    private Porte porte;

    public Maquina(String nome, double pesoToneladas, int anoFabricacao, TipoTracao tipoTracao, Porte porte) {
        this.nome = nome;
        this.pesoToneladas = pesoToneladas;
        this.anoFabricacao = anoFabricacao;
        this.tipoTracao = tipoTracao;
        this.porte = porte;
    }

    public abstract void operar();

    public void ligarSistemas() {
        System.out.println("Sistemas hidraulicos e motor de " + this.nome + " foram ativados com sucesso.");
    }

    public void exibirFicha() {
        System.out.println("--- FICHA DA MAQUINA ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: " + this.pesoToneladas + "t");
        System.out.println("Ano: " + this.anoFabricacao);
        System.out.println("Tracao: " + this.tipoTracao);
        System.out.println("Porte: " + this.porte.getCodigo() + " (" + this.porte.getNomeExibicao() + ")");
    }

    public String getNome() { return nome; }
    public double getPesoToneladas() { return pesoToneladas; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public TipoTracao getTipoTracao() { return tipoTracao; }
    public Porte getPorte() { return porte; }
}