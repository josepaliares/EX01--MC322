package lab01;

/**
 * Contém a estrutura de implementação de um Evento de esporte.
 * 
 * @author José Paliares - 260634
 */

public class EventoEsporte extends Evento {
    

    private String tipoEsporte;
    private String equipe1;
    private String equipe2;

    /**
     * Construtor da classe EventoEsporte herdando o construtor da
     * classe pai e adicionando outros atributos
     * @param tipo o tipo de esporte do Evento(ex. futebol, volei)
     * @param equipe1 a equipe da casa que vai competir no evento
     * @param equipe2 o equipe visitante que vai competir no evento
     */
    public EventoEsporte(String nome, Local local, double precoIngresso, String tipoEsporte,
                        String equipe1, String equipe2){
        super(nome, local, precoIngresso);
        this.tipoEsporte = tipoEsporte;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }
}
