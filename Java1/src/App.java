import java.io.InputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos a ver cuantos kilometros ha recorrido el tren.");
        System.out.println("Para esto primero te preguntaré algunos valores:");
        System.out.print("Km recorridos: ");
        double km = scan.nextDouble();
        scan.nextLine(); 
        System.out.print("Horas necesarias: ");
        int horas = scan.nextInt();
        scan.nextLine();
        System.out.print("Minutos necesarios: ");
        int minutos = scan.nextInt();
        scan.nextLine();

        double horasminutos = horas; 
        horasminutos += ((double) minutos/60);
        double velocidad = km / horasminutos;
        System.out.println(String.format("El tren viajaba a %s km/h", velocidad));

    }
}
