/*
* Evento.java
* 
* Material usado na disciplina MC322 - Programação orientada a objetos.
*/
package lab01;

import java.util.List;
import java.util.ArrayList;


/**
 * Contém a estrutura de implementação de um Evento.
 * 
 * @author José Paliares - 260634
 */
public abstract class Evento {
    private String nome;
    private Local local;
    private double precoIngresso;
    private List<Ingresso> ingressosVendidos;

    /**
     * Construtor da classe Evento
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     * @param precoIngresso o preco do Ingresso
     */
    public Evento(String nome, Local local, double precoIngresso){
        this.nome = nome;
        this.local = local;
        this.precoIngresso = precoIngresso;
        this.ingressosVendidos = new ArrayList<>();
    }

    /**
     * Retorna o nome do Evento
     * @return o nome do Evento
     */
    public String getNome(){
        return nome;
    }

    public double getCapacidade(){
        return this.local.getCapacidade();
    }

    /**
     * Altera o nome do Evento para `nome` 
     * @param nome o novo nome do Evento
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Exibe as informações básicas do evento
     */
    public void exibirInfosBasicas(){
        System.out.println("Nome do evento: " + this.getNome());
        System.out.println("Local do evento: " + this.local.getNome());
    }

    /**
     * Método abstrato para exibir os detalhes de cada evento variando
     * com o tipo do evento (Ex. esporte, teatro, etc)
     */
    public abstract void exibirDetalhes();

    /**
     * Retorna o preço do ingresso do Evento
     * @return o precoIngresso do Evento
     */
    public double getPrecoIngresso(){
        return precoIngresso;
    }

    /**
     * Altera o precoIngresso do Evento para `precoIngresso` 
     * @param precoIngresso o novo precoIngresso do Evento
     */
    public void setPrecoIngresso(double precoIngresso){
        this.precoIngresso = precoIngresso;
    }

    /**
     * Retorna a lista de ingressos vendidos
     * @return a lista de ingressos vendidos
     */
    public List<Ingresso> getIngressosVendidos(){
        return ingressosVendidos;
    }

    /**
     * Simula uma compra de ingresso e atribui o ingresso a um usuário
     * caso a compra for válida
     * @param ingresso o ingresso a ser comprado
     * @param usuario o usuário que vai comprar
     */
    public void adicionarIngresso(Ingresso ingresso, Usuario usuario) {

        if (ingresso instanceof IngressoMeia) {
            if (usuario.getIdade() >= 18) {
                System.out.println("Usuário não pode comprar ingresso meia!");
                return;
            }
        } else if (ingresso instanceof IngressoVIP) {
            if (!usuario.ehVip()) {
                System.out.println("Usuário precisa ser VIP para comprar este ingresso!");
                return;
            }
        }
        
        ingressosVendidos.add(ingresso);
        usuario.setIngresso(ingresso);
        System.out.println("Ingresso comprado com sucesso!");
    }
    /**
     * Retorna a soma do preço dos ingressos presentes na lista de ingressos
     * @return a soma do preço dos ingressos presentes na lista de ingressos
     */
    public double calcularFaturamento() {
        double faturamento = 0.0;
        for (Ingresso ingresso : ingressosVendidos) {
            faturamento += ingresso.getPreco();
        }
        return faturamento;
    }


}
