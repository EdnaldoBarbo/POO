package heranca2;
public class Bolsista extends Aluno{
    private Float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando a bolsa de " + this.nome);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + "é bolsista. Pagamento facilitado.");
    }
    public Float getBolsa() {
    return bolsa;
}
    public void setBolsa(Float bolsa) {
    this.bolsa = bolsa;
}
}
