import java.util.Scanner;

public class PacienteTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        String nome = entrada.nextLine();
        System.out.print("Entre com a quantidade de amostras coletadas: ");
        int tam = entrada.nextInt();
        Paciente p;
        p = new Paciente(nome, tam);

        double[] x = new double[tam];

        for (int i = 0; i < tam; i++) {
            System.out.printf("Insira o resultado do teste %d: ", i + 1);
            x[i] = entrada.nextDouble();
        }

        p.setResultado(x);

        System.out.println("############### RELATÓRIO FINAL ###############");
        System.out.printf("Resultado médio: %.2f %n", p.Media());
        System.out.printf("Diagnóstico: %s ", p.Diagnostico());

    }
}