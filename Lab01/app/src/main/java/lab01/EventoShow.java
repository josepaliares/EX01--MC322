package lab01;

/**
 * Contém a estrutura de implementação de um Evento show.
 * 
 * @author José Paliares - 260634
 */

public class EventoShow extends Evento {
    

    private String genero;
    private String artista;
    private int duracao;

    /**
     * Construtor da classe EventoShow herdando o construtor da
     * classe pai e adicionando outros atributos
     * @param genero o genero do Show(ex. rock, sertanejo)
     * @param artista o artista que vai fazer o show
     * @param duracao a duracao em horas do Show
     */
    public EventoShow(String nome, Local local, double precoIngresso, String genero, String artista, int duracao){
        super(nome, local, precoIngresso);
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getGenero(){
        return genero;
    }
    public int getDuracao(){
        return duracao;
    }
    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }

    @Override
    public void exibirDetalhes(){
        exibirInfosBasicas();
        System.out.println("Gênero musical do show: " + this.getGenero());
        System.out.println("Duração do show: " + this.getDuracao() + " horas\n");
    }
}
