public class Paciente {

    private String nome;
    private double[] exames;

    public Paciente(String nomeP, int tam) {
        nome = nomeP;
        exames = new double[tam];
    }

    public String getNome() {
        return nome;
    }

    public void setResultado(double[] resul) {
        exames = resul;
    }

    public String getResultado(int numAmostra) {
        int aux = numAmostra - 1;
        if (exames[aux] < 140) {
            return "Glicemia normal.";
        } else if (exames[aux] <= 199) {
            return "Risco de diabetes.";
        } else {
            return "Diabetes Mellitus.";
        }
    }

    public double Media() {
        int tam = exames.length;
        double soma = 0;
        for (int i = 0; i < tam; i++) {
            soma += exames[i];
        }

        return (soma / tam);
    }

    public String Diagnostico() {
        if (Media() < 140) {
            return "Glicemia normal.";
        } else if (Media() <= 199) {
            return "Risco de diabetes.";
        } else {
            return "Diabetes Mellitus.";
        }
    }
}