/*
 * Ingresso.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um Ingresso.
 * 
 * @author José Paliares - 260634
 */
public abstract class Ingresso {

    private Evento evento;
    private int codigo;

    /**
     * Construtor da classe Ingresso
     * @param evento o evento associado ao Ingresso
     * @param codigo o codigo associado ao Ingresso
     */
    public Ingresso(Evento evento, int codigo){
        this.evento = evento;
        this.codigo = codigo;
    }

    /**
     * Retorna o preço do Ingresso
     * @return o preço do Ingresso
     */
    public abstract double getPreco();
    
}
