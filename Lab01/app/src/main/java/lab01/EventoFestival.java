package lab01;

/**
 * Contém a estrutura de implementação de um Evento festival.
 * 
 * @author José Paliares - 260634
 */

public class EventoFestival extends Evento {
    

    private String tema;
    private String patrocinador;

    /**
     * Construtor da classe EventoFestival herdando o construtor da
     * classe pai e adicionando outros atributos
     * @param tema o tema do Festival(ex. musica, gastronomia, cinema)
     * @param patrocinador o patrocinador principal do festival
     */
    public EventoFestival(String nome, Local local, double precoIngresso,
                        String tema, String patrocinador){
        super(nome, local, precoIngresso);
        this.tema = tema;
        this.patrocinador = patrocinador;
    }

    public String getTema(){
        return tema;
    }
    public String getPatrocinador(){
        return patrocinador;
    }
}
