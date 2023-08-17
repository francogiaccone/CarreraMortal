package CarreraMortal;

public class Auto {
    
    //atributos
    private String color, patente;
    private double combustible = 50;
    private Rueda rueda1, rueda2, rueda3, rueda4;
    
    
    //constructor
    public Auto(String color, String patente, Rueda rueda1, Rueda rueda2, Rueda rueda3, Rueda rueda4) {
        this.color = color;
        this.patente = patente;
        this.rueda1 = rueda1;
        this.rueda2 = rueda2;
        this.rueda3 = rueda3;
        this.rueda4 = rueda4;
    }
    
    //metodos
    public void avanzar(int mts) {
        double consumo = mts * 0.1;
        
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("Avanzaste " + mts + " metros.");
        } else {
            System.out.println("No tienes suficiente combustible.");
        }
    }
    
    public void retroceder(int mts) {
        
        if (corroborarRuedas()) {
            double consumo = mts * 0.1;
        
            if (combustible >= consumo) {
                combustible -= consumo;
                System.out.println("Avanzaste " + mts + " metros.");
            } else {
                System.out.println("No tienes suficiente combustible.");
            }
        } else {
            System.out.println("Tienes al menos una rueda desinflada o pinchada");
        }
    }
    
    public void llenarTanque() {
        this.combustible = (double) 50;
        System.out.println("Tanque llenado.");
    }
    
    private boolean corroborarRuedas() {
        return rueda1.getPresion() >= 28 && rueda2.getPresion() >= 28 && rueda3.getPresion() >= 28 && rueda4.getPresion() >= 28;   
    }
}
