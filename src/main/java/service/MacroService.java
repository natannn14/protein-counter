package main.java.service;

public class MacroService {

    public static String gerarMensagem(String nomeMacro, double restante) {

        if (restante > 0) {
            return String.format("%s: Faltam %.2fg para atingir a meta%n", nomeMacro, restante);

        } else if (restante < 0) {
            return String.format("%s: Meta superada em %.2fg%n", nomeMacro, Math.abs(restante));

        } else {
            return String.format("%s: Meta atingida!%n", nomeMacro);
        }
    }
}