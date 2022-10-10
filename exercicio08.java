import java.util.Scanner;

public class exercicio08 {
    public static void main (String [] args) {
        double valorGanhoPorHora, numeroDeHorasTrabalhadas, totalSalario;
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o valor que voce ganha por hora e o numero de horas trabalhadas no mês");
        valorGanhoPorHora = ler.nextDouble();
        numeroDeHorasTrabalhadas = ler.nextDouble();
        totalSalario = numeroDeHorasTrabalhadas * valorGanhoPorHora;
        System.out.println("Valor total do salario no mes e " + totalSalario);
}

}
