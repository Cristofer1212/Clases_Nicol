package Clases_Y_Objetos.DemoFormatos;

public class PruebaFormatos {

    public static void main(String[] args) {
        String rutaArchivo = "contactos.csv";
        String rutaDestino = "contactos.html";
        String rutaDestinoXML = "contactos.xml";

        try {
            String contenidoArchivo = GestorArchivoTexto.leer(rutaArchivo);
            String[][] data = ParseadorContenido.parsear(contenidoArchivo);

            String html = new FormateadorHtml().formatear(data);
            GestorArchivoTexto.guardar(rutaDestino, html);

            String xml = new FormateadorXML().formatear(data);
            GestorArchivoTexto.guardar(rutaDestinoXML, xml);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }


}
