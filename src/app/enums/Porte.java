package app.enums;

/**
 * // ENUM
 * Classe do tipo Enum Completo.
 * Armazena constantes onde cada uma possui um codigo e uma descricao detalhada do porte.
 */
public enum Porte {
    PEQUENO("P", "Ate 10 toneladas"),
    MEDIO("M", "De 10 a 25 toneladas"),
    GRANDE("G", "Acima de 25 toneladas");

    private final String codigo;
    private final String nomeExibicao;

    private Porte(String codigo, String nomeExibicao) {
        this.codigo = codigo;
        this.nomeExibicao = nomeExibicao;
    }

    public String getNomeExibicao() { 
        return this.nomeExibicao; 
    }

    public String getCodigo() { 
        return this.codigo; 
    }
}