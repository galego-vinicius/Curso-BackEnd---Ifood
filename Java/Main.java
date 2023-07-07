package Java;

public class Main {
    public static void main(String[] args){
        Cachorro cachorro1 = new Cachorro("Vinicius", 25, 5.5, "nada"); //Define classe, variavel de referencia, cria novo objeto

        cachorro1.setNome("Vinicius");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);

        cachorro1.latir();
        System.out.println(cachorro1.pegar());

        System.out.println(cachorro1.interagir("carinho"));

    }
}

