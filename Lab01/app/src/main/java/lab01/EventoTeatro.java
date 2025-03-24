package lab01;

/**
 * Contém a estrutura de implementação de um Evento de teatro.
 * 
 * @author José Paliares - 260634
 */

public class EventoTeatro extends Evento {
    

    private String diretor;
    private int atos;

    /**
     * Construtor da classe EventoTeatro herdando o construtor da
     * classe pai e adicionando outros atributos
     * @param diretor o diretor da peça de teatro
     * @param atos a quantidade de atos que a peça tem
     */
    public EventoTeatro(String nome, Local local, double precoIngresso,
                        String diretor, int atos){
        super(nome, local, precoIngresso);
        this.diretor = diretor;
        this.atos = atos;
    }

    public int getAtos(){
        return atos;
    }
    
    public String getDiretor(){
        return diretor;
    }
}
