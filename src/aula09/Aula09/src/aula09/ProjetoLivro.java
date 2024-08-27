package aula09;
public class ProjetoLivro{
    public static void main(String[]args){
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];
    p[0] = new Pessoa("Ediel",32,"Masculino");
    p[1] = new Pessoa("Beatriz",18,"Feminino");

    l[0] = new Livro("GPT: A totalidade","OpenAI",300,p[0]);
    l[1] = new Livro("Excel básico ao avançado","Guanabara",150,p[1]);
    l[2] = new Livro ("Como parar de ser prolixo","Paulo Abadie",9500,p[0]);

    l[0].abrir();
    l[0].folhear(25);
    l[0].avançarPag();
    System.out.println(l[0].detalhes());
    }
}
