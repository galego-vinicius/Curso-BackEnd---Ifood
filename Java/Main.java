package Java;

public class Main {
    public static void main(String[] args){
        Cachorro cachorro1 = new Cachorro("Vinicius", 25, 5.5, "Não Tosado"); //Define classe, variavel de referencia, cria novo objeto
        Gato gato1 = new Gato("Helber", 20, 5.5, "Não Tosado");
        Passaro passaro1 = new Passaro("Frajola", 10, 2.0, "Não Tosado") ;

        PetShop petshop = new PetShop();
        petshop.tosar(passaro1);
        System.out.println(gato1.getEstadoDeEspirito());
        System.out.println(passaro1.getEstadoDeEspirito());
         System.out.println(cachorro1.getEstadoDeEspirito());


    }
}

