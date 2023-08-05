package atividade1;
import javax.swing.JOptionPane;
/**
 *
 * @author zabel
 */
public class Atividade1 {

    public static void main(String[] args) {
        Rota r = new Rota();
        r.planejarDia();
    }

public static class Rota {

    public void planejarDia() {
        // Leitura da quantidade de rotas
        int quantidadeRotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de rotas:"));

        // Variável para armazenar o total de km percorridos
        double totalKm = 0;

        // Leitura das km de cada ônibus e cálculo do total de km
        for (int i = 0; i < quantidadeRotas; i++) {
            double kmOnibus = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos km a rota fez: " + (i + 1) + ":"));
            totalKm += kmOnibus;
        }

        // Leitura do valor do litro do óleo diesel
        double valorLitroDiesel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro do óleo diesel:"));

        // Cálculo da quantidade necessária de combustível
        double consumoMedioKmPorLitro = 2.5;
        double litrosNecessarios = totalKm / consumoMedioKmPorLitro;

        // Cálculo do valor total a ser desembolsado pela empresa
        double valorTotalCombustivel = litrosNecessarios * valorLitroDiesel;

        // Exibição dos resultados
        JOptionPane.showMessageDialog(null,
                "Total de km: " + totalKm +
                "\nLitros de combustível necessários: " + litrosNecessarios +
                "\nValor a ser desembolsado: R$" + valorTotalCombustivel);
    }
}
}
