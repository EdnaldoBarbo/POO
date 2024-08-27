package heranca2;
public class Heranca2 {
public static void main(String[] args) {
            Aluno a1 = new Aluno();
            a1.setNome("Claudio");
            a1.setMatr(1111);
            a1.setCurso("Artes");
            a1.setIdade(16);
            a1.setSexo("Masculino");
            a1.pagarMensalidade();
            Bolsista b1 = new Bolsista();
            b1.setMatr(1112);
            b1.setNome("Athur");
            b1.setBolsa(Float.parseFloat("12.0f"));
            b1.setSexo("Masculino");
            b1.pagarMensalidade();
}
}
