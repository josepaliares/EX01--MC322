package lab01;

/**
 * Contém a estrutura de implementação de um Ingresso camarote.
 * 
 * @author José Paliares - 260634
 */

public class IngressoCamarote extends Ingresso{

    /**
     * Construtor da classe IngressoCamarote
     * utilizando o construtor da classe pai
     * @param evento o evento associado ao IngressoCamarote
     * @param codigo o codigo associado ao IngressoCamarote
     */
    public IngressoCamarote(Evento evento, int codigo){
        super(evento, codigo);
    }

    /**
     * Retorna o preço do ingresso camarote
     * @return o preço do ingresso camarote
    */
    @Override
    public double getPreco() {
        return getEvento().getPrecoIngresso() * 3; // Retorna o triplo do preço base do evento
    }
}
