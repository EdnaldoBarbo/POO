package aula09;
    //criação de classe pessoa
public class Pessoa{
    //definição dos atributos
    private String nome;
    private int idade;
    private String sexo;
    //metodos 
    public void fazerAniversario(){
        this.idade++;
    }
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
    return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade(){
    return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
  
}
