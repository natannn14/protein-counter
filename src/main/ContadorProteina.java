package main;
import model.MacroService;
import model.Usuario;
import model.Refeicao;

import javax.swing.JOptionPane;

public class ContadorProteina {
    public static void main(String[] args) {

        String entradaNome = JOptionPane.showInputDialog(null, "Qual seu nome ?");
        String entradaPeso = JOptionPane.showInputDialog(null, "Qual seu peso ?");
        String entradaAltura = JOptionPane.showInputDialog(null, "Qual sua altura ?");

        try {
            double seuPeso = Double.parseDouble(entradaPeso);
            double suaAltura = Double.parseDouble(entradaAltura);

            Usuario user = new Usuario(entradaNome, seuPeso, suaAltura);

            String menu = "Escolha seu objetivo\n" +
                    "1 - Cutting Agressivo\n" +
                    "2 - Cutting Moderado\n" +
                    "3 - Cutting Leve\n" +
                    "4 - Manutenção\n" +
                    "5 - Bulking Leve\n" +
                    "6 - Bulking Moderado\n" +
                    "7 - Bulking Agressivo";
            String entradaOpcao = JOptionPane.showInputDialog(null, menu);
            int opcao = Integer.parseInt(entradaOpcao);

            user.definirMetaObjetivo(opcao);

            String mensagemMeta = String.format (
                    "Olá %s!\nSua meta diária é:\n\n" +
                    " Proteína: %.1fg\n" +
                    " Carboidrato: %.1fg\n" +
                    " Gordura: %.1fg\n" +
                    " Calorias: %.0f kcal",
                    entradaNome,
                    user.getMetaProteina(),
                    user.getMetaCarbo(),
                    user.getMetaGordura(),
                    user.getMetaCaloriasTotais());

            JOptionPane.showMessageDialog(null, mensagemMeta);

            double restanteProt = 0;
            double restanteCarbo = 0;
            double restanteGordura = 0;
            int resposta;

            do {
                String nomeRefeicao = JOptionPane.showInputDialog(null, "Qual o nome da refeição? (ex: Almoço)");

                String novaRefeicaoP = JOptionPane.showInputDialog(null, "Diga a proteina (g) ingerida na refeição:");
                double maisProteina = Double.parseDouble(novaRefeicaoP);

                String novaRefeicaoC = JOptionPane.showInputDialog(null, "Diga o carboidrato (g) ingerido na refeição:");
                double maisCarbo = Double.parseDouble(novaRefeicaoC);

                String novaRefeicaoG = JOptionPane.showInputDialog(null, "Diga a gordura (g) ingerida na refeição:");
                double maisGordura = Double.parseDouble(novaRefeicaoG);

                Refeicao refeicaoAtual = new Refeicao(nomeRefeicao, maisProteina, maisCarbo, maisGordura);

                user.adicionarRefeicao(refeicaoAtual);

            restanteProt = user.getRestanteProteina();
            restanteCarbo = user.getRestanteCarbo();
            restanteGordura = user.getRestanteGordura();

                String mensagemResumo = "RESUMO DOS MACROS\n\n";
                mensagemResumo += MacroService.gerarMensagem("Proteína", restanteProt);
                mensagemResumo += MacroService.gerarMensagem("Carboidrato", restanteCarbo);
                mensagemResumo += MacroService.gerarMensagem("Gordura", restanteGordura);

                JOptionPane.showMessageDialog(null, mensagemResumo);
                resposta = JOptionPane.showConfirmDialog(null, "Deseja registrar outra refeição ?",
                        "Registro de Refeições",
                        JOptionPane.YES_NO_OPTION);

            } while (resposta == JOptionPane.YES_OPTION);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Insira apenas números!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Operação Cancelada pelo utilizador.");
        }
    }
}