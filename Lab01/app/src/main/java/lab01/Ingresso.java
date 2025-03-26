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

    /**
     * Construtor da classe Ingresso
     * @param evento o evento associado ao Ingresso
     */
    public Ingresso(Evento evento){
        this.evento = evento;
    }

    public Evento getEvento(){
        return this.evento;
    }
    /**
     * Retorna o preço do Ingresso
     * @return o preço do Ingresso
     */
    public abstract double getPreco();
    
}
