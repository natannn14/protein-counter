package main.java.model;

import java.util.ArrayList;
import java.util.List;

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
    private List<Refeicao> historicoRefeicoes;

    public Usuario (String nome, double peso, double altura) {
        if (nome == null || nome.equals("")) {
            throw new IllegalArgumentException("Nome Invalido");
        }
        this.nome = nome;
        this.peso = validarMedidas(peso);
        this.altura = validarMedidas(altura);
        this.historicoRefeicoes = new ArrayList<>();
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
    public List<Refeicao> getHistoricoRefeicoes(){
        return this.historicoRefeicoes;
    }
    public void setPeso(double novoPeso){
            this.peso = validarMedidas(novoPeso);
    }
    public void setAltura (double novaAltura) {
            this.altura = validarMedidas(novaAltura);
    }
    public void setMetaProteina (double novaMetaProteina) {
            this.metaProteina = validarMeta(novaMetaProteina, 1.8 * peso, 2.5 * peso);
        }
    public void setMetaCarbo (double novaMetaCarbo){
            this.metaCarbo = validarMeta(novaMetaCarbo, 1.5 * peso, 6.5 * peso);
    }
    public void setMetaGordura (double novaMetaGordura) {
            this.metaGordura = validarMeta(novaMetaGordura, 0.7 * peso, 1.1 * peso);
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
                throw new IllegalArgumentException("Aviso: Objetivo Inválida");
        }
    }
    public void adicionarRefeicao(Refeicao refeicao) {
        this.protConsumida += refeicao.getProt();
        this.carboConsumido += refeicao.getCarbo();
        this.gorduraConsumida += refeicao.getGordura();
        this.historicoRefeicoes.add(refeicao);
    }
    private double validarMedidas(double medidas){
        if (medidas > 0) {
            return medidas;
        } else throw new IllegalArgumentException("Aviso: Medida Inválida");
    }
    private double validarMeta(double valor, double min, double max){
        if (valor >= min && valor <= max){
            return valor;
        } else throw new IllegalArgumentException("Meta não recomendada");
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
