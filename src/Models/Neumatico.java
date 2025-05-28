package Models;

public class Neumatico extends ComponenteVehicular {
    int tamano;
    double presion;
    
    public Neumatico(String codigo, String fabricante, int tamano, double presion) {
        super(codigo, fabricante);
        this.tamano = tamano;
        this.presion = presion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño: " + tamano + " pulgadas");
        System.out.println("Presión: " + presion + " PSI");
    }

    public void verificarPresion() {
        if (presion >= 30 && presion <= 35) {
            System.out.println("Presión óptima.");
        } else {
            System.out.println("Presión fuera del rango recomendado.");
        }
    }
}
