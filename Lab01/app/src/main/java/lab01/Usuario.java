/*
 * Usuario.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */
import java.util.List;
import java.util.ArrayList;

package lab01;

/**
 * Contém a estrutura de implementação de um Usuario.
 * 
 * @author José Paliares - 260634
 */
public class Usuario {

    private String nome;
    private String email;
    private int idade;
    private boolean vip;
    private List<Ingresso> ingressos;

    /**
     * Construtor da classe Usuario
     * @param nome o nome do usuário
     * @param email o email do usuário
     * @param idade a idade do usuario
     * @param ehvip se o usuário é vip ou não
     */
    public Usuario(String nome, String email, int idade, boolean vip){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.vip = vip;
        this.ingressos = new ArrayList<>();
    }

    /**
     * Retorna o nome do usuário
     * @return o nome do usupario
     */
    public String getNome(){
        return nome;
    }

    /**
     * Retorna a idade do usuário
     * @return a idade do usupario
     */
    public int getIdade(){
        return idade;
    }

    /**
     * Retorna se o usuário é vip
     * @return se o usuário é vip
     */
    public boolean ehVip(){
        return vip;
    }

    /**
     * Altera o nome do usuário para `nome` 
     * @param nome o novo nome do usuário
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void adicionarIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }

}
