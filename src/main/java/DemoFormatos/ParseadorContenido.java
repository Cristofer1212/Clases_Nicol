package DemoFormatos;



// Convertir csv --> matrices
public class ParseadorContenido {


    public static String[][] parsear(String contenidoCSV) {
        String[] lineas = contenidoCSV.split("\r\n");
        String cabecera = lineas[0];
        String[] columnas = cabecera.split(",");
        String[][] data = new String[lineas.length][columnas.length];
        for (int fila = 0; fila < lineas.length; fila++) {
            String[] campos = lineas[fila].split(",");
            System.arraycopy(campos, 0, data[fila],
                    0, columnas.length);
        }
        return data;
    }
}
