public class VetorDouble {
    public static void main(String[] args) {
        double[] notas = { 7.5, 8.0, 6.9, 9.6 };

        System.out.println("=== Vetor de Double===");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " : " + notas[i]);
        }
    }
}