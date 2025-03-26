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

    /**
    * Retorna a quantia de atos na peça de teatro 
     * @return a quantia de atos na peça de teatro
     */
    public int getAtos(){
        return atos;
    }
    
    /**
     * Retorna o diretor responsável pela peça
     * @return o diretor responsável pela peça
     */
    public String getDiretor(){
        return diretor;
    }

    /**
     * Exibe os detalhes presentes em uma peça de teatro
     */
    @Override
    public void exibirDetalhes(){
        exibirInfosBasicas();
        System.out.println("Total de atos: " + this.getAtos());
        System.out.println("Diretor da peça: " + this.getDiretor() + "\n");
    }
}
