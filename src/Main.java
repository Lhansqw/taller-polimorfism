public class Main {
    public static void main(String[] args) {

        System.out.println("=== Generando campo magnético: Iniciando sistema de publicaciones ===");

        // 1. Induciendo datos en un Libro
        Libro libroFisica = new Libro(450, 2026, "Principios de Electromagnetismo", 55.90);

        // 2. Transmitiendo frecuencia a un Disco
        Disco discoSonidos = new Disco(45.5f, "Ondas de Radio de Júpiter", 18.50);

        // 3. Proyectando espectro visible en un Video con polaridad de idioma definida
        Video videoDocumental = new Video(1.5f, Idioma.ESPANOL, "La vida de Nikola Tesla", 22.00);

        // Midiendo la salida de voltaje (imprimiendo los objetos)
        System.out.println("\n--- Lecturas del Amperímetro (Datos de los objetos) ---");
        System.out.println(libroFisica.toString());
        System.out.println(discoSonidos.toString());
        System.out.println(videoDocumental.toString());

        // Modificando la carga de un objeto en tiempo de ejecución
        System.out.println("\n--- Alterando la resistencia (Modificando el precio del disco) ---");
        discoSonidos.setPrecio(15.00);
        System.out.println("Nueva lectura del Disco: " + discoSonidos.toString());
    }
}