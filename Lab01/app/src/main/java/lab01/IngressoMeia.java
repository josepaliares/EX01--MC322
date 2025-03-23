package lab01;

/**
 * Contém a estrutura de implementação de um Ingresso meia.
 * 
 * @author José Paliares - 260634
 */

public class IngressoMeia extends Ingresso{

    /**
     * Construtor da classe IngressoMeia
     * utilizando o construtor da classe pai
     * @param evento o evento associado ao IngressoMeia
     * @param codigo o codigo associado ao IngressoMeia
     */
    public IngressoMeia(Evento evento, int codigo){
        super(evento, codigo);
    }

    /**
     * Retorna o preço do ingresso meia
     * @return o preço do ingresso meia
    */
    @Override
    public double getPreco() {
        return getEvento().getPrecoIngresso() / 2; // Retorna metade do preço base do evento
    }
}
