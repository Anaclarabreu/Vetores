public class VetorBoolean {
    public static void main(String[] args) {
        boolean[] respostas = { true, false, true, true };
        System.out.println("=== Vetor de Boolean ===");
        for (int i = 0; i < respostas.length; i++) {
            System.out.println("Resposta " + (i + 1) + ": " + respostas[i]);
        }
    }
}