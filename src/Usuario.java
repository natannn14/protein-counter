public class Usuario {
    private String nome;
    private double peso;
    private double altura;
    private double metaProteina;
    private double metaCarbo;
    private double metaGordura;
    private double protConsumida = 0;
    private double carboConsumido = 0;
    private double gorduraConsumida = 0;

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
    public double getMetaCarbo(){
        return this.metaCarbo;
    }
    public double getMetaGordura(){
        return this.metaGordura;
    }
    public double getMetaCaloriasTotais(){
        return (metaProteina * 4) + (metaCarbo * 4) + (metaGordura * 9);
    }
    public void setPeso(double novoPeso){
        if (novoPeso > 0) {
            this.peso = novoPeso;
        } else {
            System.out.println("Erro: seu peso deve ser maior que zero");
        }

    }
    public void setAltura (double novaAltura) {
        if (novaAltura > 0) {
            this.altura = novaAltura;
        } else {
            System.out.println("Erro: sua altura deve ser maior que zero");
        }
    }
    public void setMetaProteina (double novaMetaProteina) {
        if (novaMetaProteina >= 1.8 * peso && novaMetaProteina <= 2.5 * peso) {
            this.metaProteina = novaMetaProteina;
        } else {
            System.out.println("A quantia está fora da faixa recomendada");
        }
    }
    public void setMetaCarbo (double novaMetaCarbo){
        if (novaMetaCarbo >= 1.5 * peso && novaMetaCarbo <= 6.5 * peso) {
            this.metaCarbo = novaMetaCarbo;
        } else {
            System.out.println("A quantia está fora da faixa recomendada");
        }
    }
    public void setMetaGordura (double novaMetaGordura) {
        if (novaMetaGordura >= 0.7 * peso && novaMetaGordura <= 1.1 * peso) {
            this.metaGordura = novaMetaGordura;
        } else {
            System.out.println("A quantia está fora da faixa recomendada");
        }
    }
    public void definirMetaObjetivo (int opcao) {
        switch (opcao) {
            case 1: //cut agressivo
                this.metaProteina = this.peso * 2.5;
                this.metaCarbo = this.peso * 1.5;
                this.metaGordura = this.peso * 0.7;
                break;
            case 2: //cut moderado
                this.metaProteina = this.peso * 2.2;
                this.metaCarbo = this.peso * 2.5;
                this.metaGordura= this.peso * 0.8;
                break;
            case 3: //cut leve
                this.metaProteina = this.peso * 2.0;
                this.metaCarbo = this.peso * 3.0;
                this.metaGordura = this.peso * 0.9;
                break;
            case 4: //manutenção
                this.metaProteina = this.peso * 1.8;
                this.metaCarbo = this.peso * 3.5;
                this.metaGordura = this.peso * 0.9;
                break;
            case 5: //bulk leve
                this.metaProteina = this.peso * 1.8;
                this.metaCarbo = this.peso * 4.5;
                this.metaGordura = this.peso * 0.9;
                break;
            case 6: //bulk moderado
                this.metaProteina = this.peso * 1.9;
                this.metaCarbo = this.peso * 5.5;
                this.metaGordura = this.peso * 1.0;
                break;
            case 7: //bulk agressivo
                this.metaProteina = this.peso * 2.0;
                this.metaCarbo = this.peso * 6.5;
                this.metaGordura = this.peso * 1.1;
                break;
            default:
                System.out.println("Opção de objetivo inválida!");
        }
    }
    public void adicionarRefeicao(Refeicao refeicao) {
        this.protConsumida += refeicao.getProt();
        this.carboConsumido += refeicao.getCarbo();
        this.gorduraConsumida += refeicao.getGordura();
    }
    public double getRestanteProteina() {
        return this.metaProteina - this.protConsumida;
    }
    public double getRestanteCarbo() {
        return this.metaCarbo - this.carboConsumido;
    }
    public double getRestanteGordura() {
        return this.metaGordura - this.gorduraConsumida;
    }
}
