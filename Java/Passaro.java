package Java;

public class Passaro extends Animais {
    static int numeroDePassaros;
     public Passaro(String nome, int altura, double peso, String estadoDeEspirito) {
        super(nome, altura, peso, estadoDeEspirito);

    }
            @Override
        public void soar() {
            System.out.println("Piu Piu");
        }
}
