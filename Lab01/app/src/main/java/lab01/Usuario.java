/*
 * Usuario.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */
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
    private Ingresso ingresso;

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
    }

    /**
     * Retorna o nome do usuário
     * @return o nome do usuário
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Retorna o email do usuário
     * @return o email do usuário
     */
    public String getEmail(){
        return email;
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
    
    /**
     * Retorna o ingresso que o usuário comprou
     * @return o ingresso que o usuário comprou
     */
    public Ingresso getIngresso() {
        return ingresso;
    }

    /**
     * Atribui um ingresso ao usuário
     * @param ingresso o ingresso a ser atribuído
     */
    public void setIngresso(Ingresso ingresso){
        this.ingresso = ingresso;
    }

}
