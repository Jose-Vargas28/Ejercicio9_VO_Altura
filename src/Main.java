import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio9_Bala bala = new Ejercicio9_Bala();

        //Incializar en 0
        double altura = 0;
        double vo = 0;
        

        // Solicitar y validar la alturan

        boolean alturaValida = false;
        while (!alturaValida) {
            try {
                System.out.println("Ingrese la altura desde la cual se dispara la bala (en metros): ");
                altura = scanner.nextDouble();
                if (altura <= 0) {
                    throw new Exception("La altura debe ser mayor a 0 y no puede ser negativa");
                }
                alturaValida = true;
            } catch (Exception e) {
                System.out.println("Error de syntaxys: " + e.getMessage());
                scanner.nextLine();
            }
        }
        bala.setAltura(altura);

        // Solicitar y validar la vo (velocidad inicial)
        boolean velocidadValida = false;
        while (!velocidadValida) {
            try {
                System.out.println("Ingrese la velocidad inicial de la bala (en m/s): ");
                vo = scanner.nextDouble();
                if (vo < 0) {
                    throw new Exception("La velocidad inicial no puede ser negativa.");
                }
                velocidadValida = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
        bala.setVo(vo);

        // Calcular y mostrar el tiempo de vuelo
        try {
            double tiempo = bala.TiempoVuelo();
            System.out.printf("El tiempo en que la bala choca con el suelo es de: %.2f segundos.%n", tiempo);
        } catch (Exception e) {
            System.out.println("Error de sintaxys: " + e.getMessage());
        } finally {
            scanner.close();}
    }
}
