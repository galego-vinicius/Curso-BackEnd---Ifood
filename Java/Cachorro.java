package Java;

public class Cachorro {
    //Atributos
    private String nome;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    //CONSTRUTORES
        public Cachorro(){}
        public Cachorro(String nome, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }
//_______________________________________________________________________________________________
    // GETTERS E SETTERS

        public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

        public String getNome() {
        return nome;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
//_______________________________________________________________________________________________


        public void comer(){} 

        public void latir(){
            System.out.println("Au Au");
        }

        public String pegar(){
            return "Bolinha";
        }

        public String interagir(String acao){

            switch (acao){
                case "carinho": this.estadoDeEspirito = "Feliz"; break;
                case "nada": this.estadoDeEspirito = "neutro"; break;
                default: this.estadoDeEspirito = "Bravo"; break;
            }
            return estadoDeEspirito;


           /* if (acao.equals("carinho")){
                this.estadoDeEspirito = "Feliz";
            }else{
                this.estadoDeEspirito = "neutro";
            }
            return estadoDeEspirito; */ 
        }
}
