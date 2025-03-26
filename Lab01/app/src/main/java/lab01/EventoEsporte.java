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

    /**
     * Retorna o tipo de esporte do evento
     * @return o tipo de esporte do evento
     */
    public String getTipoEsporte(){
        return tipoEsporte;
    }

    /**
     * Retorna a equipe da casa no evento de esporte
     * @return a equipe da casa no evento de esporte
     */
    public String getEquipe1(){
        return equipe1;
    }

    /**
     * Retorna a equipe visitante no evento de esporte
     * @return a equipe visitante no evento de esporte
     */
    public String getEquipe2(){
        return equipe2;
    }

    /**
     * Exibe os detalhes presentes em um evento de esportes
     */
    @Override
    public void exibirDetalhes(){
        exibirInfosBasicas();
        System.out.println("Esporte: " + this.getTipoEsporte());
        System.out.println(this.getEquipe1() + " vs " + this.getEquipe2() + "\n");
    }
}
