package main.java.model;

public class Refeicao {
    private double gramaProt;
    private double gramaCarbo;
    private double gramaGordura;
    private String nome;

    public Refeicao (String nome, double gramaProt, double gramaCarbo, double gramaGordura) {
        if (nome == null || nome.equals("")) {
            throw new IllegalArgumentException("Nome de refeição invalido");
        }
        this.nome = nome;
        this.gramaProt = validarMacro(gramaProt);
        this.gramaCarbo = validarMacro(gramaCarbo);
        this.gramaGordura = validarMacro(gramaGordura);
    }
    public String toString() {
        return "A sua refeição" + nome +"\n"
                + "\ntem " + gramaProt + "g de Proteína\n"
                + gramaCarbo + "g de Carboidrato\n"
                + gramaGordura + "g de Gordura\n" ;
    }

    public double getProt() {
        return this.gramaProt;
    }

    public double getCarbo() {
        return this.gramaCarbo;
    }

    public double getGordura() {
        return this.gramaGordura;
    }

    public String getNome() {
        return this.nome;
    }

    public double getCaloriasTotais() {
        return (this.gramaProt * 4) + (this.gramaCarbo * 4) + (this.gramaGordura * 9);
    }
    private double validarMacro(double quantMacro) {
        if (quantMacro >= 0) {
            return quantMacro;
        } else throw new IllegalArgumentException("Aviso: MacroNutriente negativo");
    }
}