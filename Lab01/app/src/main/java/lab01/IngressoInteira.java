package lab01;

/**
 * Contém a estrutura de implementação de um Ingresso inteira.
 * 
 * @author José Paliares - 260634
 */

public class IngressoInteira extends Ingresso{

    /**
     * Construtor da classe IngressoInteira
     * utilizando o construtor da classe pai
     * @param evento o evento associado ao IngressoInteira
     * @param codigo o codigo associado ao IngressoInteira
     */
    public IngressoInteira(Evento evento, int codigo){
        super(evento, codigo);
    }

    /**
     * Retorna o preço do ingresso inteira
     * @return o preço do ingresso inteira
    */
    @Override
    public double getPreco() {
        return getEvento().getPrecoIngresso(); // Retorna o preço base do evento
    }
}
