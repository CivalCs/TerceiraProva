package br.senac.pi.diskpizza.domain;

/**
 * Created by Aluno on 17/12/2015.
 */
public class Produto {

    private int id;
    private String nome;
   // private int idade;

    public Produto(){}

    public Produto(int id, String nome /*int idade*/){
        this.id = id;
        this.nome = nome;
       // this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  /*  public int getIdade() {
        return idade;
    }*/

   /* public void setIdade(int idade) {
        this.idade = idade;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
