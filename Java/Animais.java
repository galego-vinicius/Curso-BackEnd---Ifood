package Java;

public abstract class Animais {
    protected String nome;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    
     public Animais(String nome, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    void comer(){}
    void dormir (){}

    public abstract void soar();
    
}
