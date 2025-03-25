/*
 * App.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação da aplicação.
 * 
 * @author José Paliares - 260634
 */
public class App {

    /**
     * Aplicação principal
     * @param args
     */
    public static void main(String[] args) {


        // DEMONSTRAÇÃO CÓDIGO PRELIMINAR
        
        Local local = new Local("Allianz Parque", 300);
        Usuario usuario = new Usuario("Gabriel", "gabriel@gmail.com");

        // Dados sobre evento
        System.out.println("Local: " + local.getNome());
        System.out.println("Nome do usuário: " + usuario.getNome());

        // DEMONSTRAÇÃO PASSO 1

        // DEMONSTRAÇÃO PASSO 2

        // Reaproveitei o local do exemplo de cima
        EventoEsporte evento1 = new EventoEsporte("Final paulistao - jogo 1", local, 
                                                150, "Futebol", "Palmeiras", "Corinthians");
        System.out.println("Evento 1: " + evento1.getNome());
        System.out.println("Local: " + local.getNome());
        System.out.println("Capacidade: " + local.getCapacidade());
        System.out.println("Preço do ingresso base: " + evento1.getPrecoIngresso());
        System.out.println("Esporte: " + evento1.getTipoEsporte());
        System.out.println("Equipe da casa: " + evento1.getEquipe1());
        System.out.println("Equipe visitante: " + evento1.getEquipe2());

        Local localFestival = new Local("Parque da Expoflora", 500);
        EventoFestival evento2 = nem EventoFestival("Expoflora", localFestival, 50, "Flores", "Cia Verde");

        Local localShow = new Local("Gate 22", 100);
        EventoShow evento3 = new EventoShow("SUBMUNDO808", localShow, 80, "Eletronica", 6);

        Local localTeatro = new Local("Teatro Amazonas", 200);
        EventoTeatro = new EventoTeatro("Opera Carmen", localFestival, 50, "Luca Salsi", 4);







        // DEMONSTRAÇÃO PASSO 3



        // DEMONSTRAÇÃO PASSO 4



        // DEMONSTRAÇÃO PASSO 5
    }
}
