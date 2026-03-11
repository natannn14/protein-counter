public class Usuario {
    private String nome;
    private double peso;
    private double altura;
    private double metaProteina;

    public Usuario (String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getMetaProteina(){
        return this.metaProteina;
    }
    public void setPeso(double novoPeso){
        if (novoPeso > 0) {
            this.peso = novoPeso;
        } else {
            System.out.println("Erro: seu peso deve ser maior que zero");
        }

    }
    public void setAltura (double novaAltura) {
        this.altura = novaAltura;
    }
    public void setMetaProteina (double novaMetaProteina) {
        if (novaMetaProteina > 2.4 * peso) {
            System.out.println("Essa meta pode ser prejudicial a saúde");
        } else {
            this.metaProteina = novaMetaProteina;
        }
    }
    public double calcularSugestaoMeta (double fator) {
        return this.peso * fator;
    }
}
