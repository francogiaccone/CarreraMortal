package CarreraMortal;

public class Rueda {
    
    //atributos
    private String marca;
    private double presion;
    
    //constructor
    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }
    
    //getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    
    //metodos
    public void inflar() {
        this.presion = (double) 28;
        System.out.println("Rueda inflada.");
    }
    
    public void pinchar() {
        this.presion = (double) 0;
        System.out.println("Rueda pinchada.");
    }
    
    public void desinflar() {
        if (presion <= 0) {
            System.out.println("La rueda ya no tiene presion.");
        } else {
            this.presion -= 0.5;
            System.out.println("Desinflaste la rueda.");
        }
    }
    
    
}
