public class Refeicao {
    private double quantProt;
    private double quantCarb;
    private double quantGordura;
    private String nome;

    public Refeicao (String nome, double quantProt, double quantCarb, double quantGordura) {
        this.nome = nome;
        this.quantProt = quantProt;
        this.quantCarb = quantCarb;
        this.quantGordura = quantGordura;
    }
    public double getProt() {
        return this.quantProt;
    }
    public double getCarbo() {
        return this.quantCarb;
    }
    public double getGordura() {
        return this.quantGordura;
    }
    public String getNome() {
        return this.nome;
    }
    public double getCaloriasTotais() {
        return (this.quantProt * 4) + (this.quantCarb * 4) + (this.quantGordura * 9);
    }
}
