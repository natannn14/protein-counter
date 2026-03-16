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

            JOptionPane.showMessageDialog(null, "Olá " + entradaNome
                    + "\nSua meta para o objetivo escolhido é \n"
                    + user.getMetaProteina() + " g de proteína\n"
                    + user.getMetaCarbo() + " g de carboidrato\n"
                    + user.getMetaGordura() + " g de gordura");

            double restanteProt = 0;
            double restanteCarbo = 0;
            double restanteGordura = 0;

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

                if (restanteProt < 0) {
                    mensagemResumo += String.format(" Proteína: Faltam %.2fg\n", restanteProt);
                } else if (restanteProt > 0) {
                    mensagemResumo += String.format (" Proteína: Faltam %2.fg\n " , restanteProt + "g\n");
                } else {
                    mensagemResumo += " Proteína: Meta atingida!\n";
                }

                if (restanteCarbo < 0) {
                    mensagemResumo += String.format (" Carboidrato: Superaste a meta em %2.fg\n" , Math.abs(restanteCarbo), "g\n");
                } else if (restanteCarbo > 0) {
                    mensagemResumo += " Carboidrato: Faltam " + restanteCarbo + "g\n";
                } else {
                    mensagemResumo += " Carboidrato: Meta atingida!\n";
                }

                if (restanteGordura < 0) {
                    mensagemResumo += " Gordura: Superaste a meta em " + Math.abs(restanteGordura) + "g\n";
                } else if (restanteGordura > 0) {
                    mensagemResumo += " Gordura: Faltam " + restanteGordura + "g\n";
                } else {
                    mensagemResumo += " Gordura: Meta atingida!\n";
                }

                JOptionPane.showMessageDialog(null, mensagemResumo);

            } while (restanteProt > 0|| restanteCarbo > 0 || restanteGordura > 0);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Insira apenas números!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Operação Cancelada pelo utilizador.");
        }
    }
}