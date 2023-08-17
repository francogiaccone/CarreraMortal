package CarreraMortal;

public class CarreraMortal {

    public static void main(String[] args) {
        
        Rueda rueda1 = new Rueda("Pirelli", 28);
        Rueda rueda2 = new Rueda("Pirelli", 28);
        Rueda rueda3 = new Rueda("Pirelli", 28);
        Rueda rueda4 = new Rueda("Pirelli", 28);
        
        Auto auto1 = new Auto("Negro", "JYO488", rueda1, rueda2, rueda3, rueda4);
        
        rueda1.desinflar();
        System.out.println("Presion rueda1: " + rueda1.getPresion());
        
        rueda2.desinflar();
        rueda2.desinflar();
        System.out.println("Presion rueda2: " + rueda2.getPresion());
        
        auto1.avanzar(100);
        auto1.avanzar(500);
        
        auto1.llenarTanque();
        
        auto1.retroceder(500);
        
        rueda1.inflar();
        rueda2.inflar();
        
        auto1.retroceder(500);
    }
    
}
