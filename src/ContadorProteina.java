import javax.swing.JOptionPane;
public class ContadorProteina {
    public static void main(String[] args) {
        String entradaPeso = JOptionPane.showInputDialog(null,
                "Qual seu peso ?");
        try {
            double seuPeso = Double.parseDouble(entradaPeso);
            double metaProteina = seuPeso * 2;
            double restanteDiario = metaProteina;
            JOptionPane.showMessageDialog(null,
                    "Sua meta de proteína diária é " + metaProteina);
            do {
                String novaRefeicao = JOptionPane.showInputDialog(null,
                        "Quanto de proteína você consumiu agora ?");
                double maisProteina = Double.parseDouble(novaRefeicao);
                restanteDiario = restanteDiario - maisProteina;
                if (restanteDiario < 0) {
                    JOptionPane.showMessageDialog(null,
                            "Parabéns! Você superou a meta em: " + Math.abs(restanteDiario));
                } else if (restanteDiario > 0) {
                    JOptionPane.showMessageDialog(null,
                            "Ainda faltam: " + restanteDiario + "g");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Parabéns! meta atingida com precisão");
                }

            } while (restanteDiario > 0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Insira apenas números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,
                    "Operação Cancelada");

        }
    }
}
