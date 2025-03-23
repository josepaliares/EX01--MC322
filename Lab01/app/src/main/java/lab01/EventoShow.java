package lab01;

/**
 * Contém a estrutura de implementação de um Evento show.
 * 
 * @author José Paliares - 260634
 */

public class EventoShow extends Evento {
    

    private String genero;
    private int duracao;

    /**
     * Construtor da classe EventoShow herdando o construtor da
     * classe pai e adicionando outros atributos
     * @param genero o genero do Show(ex. rock, sertanejo)
     * @param duracao a duracao em horas do Show
     */
    public EventoShow(String nome, Local local, double precoIngresso,
                        String genero, int duracao){
        super(nome, local, precoIngresso);
        this.genero = genero;
        this.duracao = duracao;
    }
}
