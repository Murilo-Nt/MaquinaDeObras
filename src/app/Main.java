package app;

import app.enums.Porte;
import app.enums.TipoTracao;
import app.model.Escavadeira;

/**
 * CLASSE PRINCIPAL
 * Orquestra o ponto de entrada do programa, realiza os testes de chamadas
 * de metodos obrigatorios e faz analises relacionais entre as instancias criadas.
 */
public class Main {
    public static void main(String[] args) {
        Escavadeira m1 = new Escavadeira("Escavadeira Hidraulica X1", 22.5, 2021, TipoTracao.ESTEIRA, Porte.MEDIO, 1.2, 8.5);
        Escavadeira m2 = new Escavadeira("Mini Escavadeira Urbana", 4.8, 2023, TipoTracao.RODAS, Porte.PEQUENO, 0.4, 4.2);

        System.out.println("==================================================");
        System.out.println("           EXECUTANDO TESTES: MAQUINA 1           ");
        System.out.println("==================================================");
        m1.ligarSistemas();
        m1.exibirFicha();
        m1.operar();
        m1.operar(8);

        System.out.println("\n==================================================");
        System.out.println("           EXECUTANDO TESTES: MAQUINA 2           ");
        System.out.println("==================================================");
        m2.ligarSistemas();
        m2.exibirFicha();
        m2.operar();
        m2.operar(4);

        System.out.println("\n==================================================");
        System.out.println("               LOGICA DE COMPARACAO               ");
        System.out.println("==================================================");
        if (m1.getPesoToneladas() > m2.getPesoToneladas()) {
            System.out.println("Resultado: O equipamento '" + m1.getNome() + "' e mais pesado e robusto que '" + m2.getNome() + "'.");
        } else if (m2.getPesoToneladas() > m1.getPesoToneladas()) {
            System.out.println("Resultado: O equipamento '" + m2.getNome() + "' e mais pesado e robusto que '" + m1.getNome() + "'.");
        } else {
            System.out.println("Resultado: Ambos os equipamentos operam na mesma faixa exata de peso.");
        }
        System.out.println("==================================================");
    }
}