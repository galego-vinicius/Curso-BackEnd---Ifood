package Java;

public class Gato extends Animais {
    static int numeroDeGatos;
     public Gato (String nome, int altura, double peso, String estadoDeEspirito) {
        super(nome, altura, peso, estadoDeEspirito);
    }
            @Override
        public void soar() {
            System.out.println("Miau");
        }


}

