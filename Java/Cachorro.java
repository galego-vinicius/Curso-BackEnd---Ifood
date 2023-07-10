package Java;

public class Cachorro extends Animais {
    //Atributos
    static int numeroDeCachorro;

//_______________________________________________________________________________________________
    //CONSTRUTORES
        public Cachorro(String nome, int altura, double peso, String estadoDeEspirito) { 
            super(nome, altura, peso, estadoDeEspirito);


        numeroDeCachorro ++;
    }

//_______________________________________________________________________________________________
 // FUNÇÕES

        public String pegar(){
            return "Bolinha";
        }

        @Override
        public String toString() {
            return "Cachorro [nome=" + nome + "]";
        }

        @Override
        public void soar() {
            System.out.println("Au Au");
        }

        


        // public String interagir(String acao){

        //     switch (acao){
        //         case "carinho": this.estadoDeEspirito = "Feliz"; break;
        //         case "nada": this.estadoDeEspirito = "neutro"; break;
        //         default: this.estadoDeEspirito = "Bravo"; break;
        //     }
        //     return estadoDeEspirito;

        // OU

           /* if (acao.equals("carinho")){
                this.estadoDeEspirito = "Feliz";
            }else{
                this.estadoDeEspirito = "neutro";
            }
            return estadoDeEspirito; */ 
        //}
        
}
