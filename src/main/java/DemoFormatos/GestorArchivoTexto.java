package DemoFormatos;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

// Leer y Escribir
public class GestorArchivoTexto {

    public static String leer(String rutaArchivo) {
        try{
            return Files.readString(Path.of(rutaArchivo), StandardCharsets.ISO_8859_1);
        } catch (IOException ex) {
            System.out.println("Detalle: " + ex.getMessage());
            return null;
        }

    }


    public static boolean guardar(String rutaArchivo, String texto) {
        try {
            Files.writeString(Path.of(rutaArchivo), texto);
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }


}
