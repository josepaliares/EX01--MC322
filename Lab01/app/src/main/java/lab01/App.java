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
        Usuario usuario = new Usuario("Gabriel", "gabriel@gmail.com", 20, false);

        // Dados sobre evento
        System.out.println("Local: " + local.getNome());
        System.out.println("Nome do usuário: " + usuario.getNome());

        // DEMONSTRAÇÃO PASSO 1

        Local localExemplo1 = new Local("Campinas Hall", 100);
        Evento eventoExemplo1 = new Evento("Entorta Bixo", localExemplo1, 50);

        IngressoMeia meiaExemplo = new IngressoMeia(eventoExemplo1, 0);
        IngressoInteira inteiraExemplo = new IngressoInteira(eventoExemplo1, 1);
        IngressoVIP vipExemplo = new IngressoVIP(eventoExemplo1, 2);
        IngressoCamarote camaroteExemplo = new IngressoCamarote(eventoExemplo1, 3);

        System.out.println("Preço dos ingressos para o evento: " + eventoExemplo1.getNome());
        System.out.println("Meia: " + meiaExemplo.getPreco());
        System.out.println("Inteira: " + inteiraExemplo.getPreco());
        System.out.println("VIP: " + vipExemplo.getPreco());
        System.out.println("Camarote: " + CamaroteExemplo.getPreco());

        // DEMONSTRAÇÃO PASSO 2

        Local localExemplo2 = local; // Foi no Allianz Parque
        EventoEsporte eventoExemplo2 = new EventoEsporte("Final paulistão - jogo 1", localExemplo2, 120, "Futebol", "Palmeiras", "Corinthians");
        eventoExemplo2.exibirDetalhes();

        Local localExemplo3 = new Local("Parque da Expoflora", 300);
        EventoFestival eventoExemplo3 = new EventoFestival("Expoflora", local, 50, "Flores", "CiaVerde");
        eventoExemplo3.exibirDetalhes();

        Local localExemplo4 = new Local("Gate 22", 50);
        EventoShow eventoExemplo4 = new EventoShow("SUBMUNDO808", local, 80, "Rock", 6);
        eventoExemplo4.exibirDetalhes();

        Local localExemplo5 = new Local("National Theatre - London", 100);
        EventoTeatro eventoExemplo5 = new EventoTeatro("Peter Pan", local, 100, 2, "Julian Ovendon");
        eventoExemplo5.exibirDetalhes();

        // DEMONSTRAÇÃO PASSO 3

        Usuario usuario1 = new Usuario("Arthur", "a@gmail.com", 15, false);
        Usuario usuario2 = new Usuario("Bruno", "b@gmail.com", 20, true);
        Usuario usuario3 = new Usuario("Caio", "c@gmail.com", 18, false);
        Usuario usuario4 = new Usuario("Daniel", "d@gmail.com", 12, false);

        eventoExemplo1.adicionarIngresso(meiaExemplo, usuario3);
        eventoExemplo1.adicionarIngresso(meiaExemplo, usuario4);
        eventoExemplo1.adicionarIngresso(inteiraExemplo, usuario3);
        eventoExemplo1.adicionarIngresso(vipExemplo, usuario3);
        eventoExemplo1.adicionarIngresso(vipExemplo, usuario2);
        eventoExemplo1.adicionarIngresso(camaroteExemplo, usuario1);

        faturamentoExemplo1 = eventoExemplo1.calcularFaturamento();
        System.out.println("Faturamento do " + eventoExemplo1.getNome() + ": R$" + String.format("%.2f", faturamentoExemplo1));

        // DEMONSTRAÇÃO PASSO 4



        // DEMONSTRAÇÃO PASSO 5
    }
}
