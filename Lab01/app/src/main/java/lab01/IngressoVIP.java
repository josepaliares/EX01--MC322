package lab01;

/**
 * Contém a estrutura de implementação de um Ingresso vip.
 * 
 * @author José Paliares - 260634
 */

public class IngressoVIP extends Ingresso{

    /**
     * Construtor da classe IngressoVIP
     * utilizando o construtor da classe pai
     * @param evento o evento associado ao IngressoVIP
     * @param codigo o codigo associado ao IngressoVIP
     */
    public IngressoVIP(Evento evento, int codigo){
        super(evento, codigo);
    }

    /**
     * Retorna o preço do ingresso vip
     * @return o preço do ingresso vip
    */
    @Override
    public double getPreco() {
        return getEvento().getPrecoIngresso() * 2; // Retorna o dobro do preço base do evento
    }
}
