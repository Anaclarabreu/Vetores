public class VetorInt {
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30, 40, 50 };

        System.out.println("=== Vetor de int ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicao " + i + ":" + numeros[i]);
        }
    }
}