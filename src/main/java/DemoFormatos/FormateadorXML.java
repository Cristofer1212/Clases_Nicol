package DemoFormatos;

public class FormateadorXML extends Formateador {

    private String plantillaXML = """ 
      <?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?> 
      <contactos> 
          %s 
      </contactos>""";

    @Override
    public String formatear(String[][] data) {
        // optimización
        StringBuilder tablaXML = new StringBuilder();
        for (int i = 1; i < data.length; i++) {
            tablaXML.append("<contacto>");
            for (int j = 0; j < data[i].length; j++) {
                tablaXML.append(String.format("<%s>%s</%s>\n",
                        data[0][j], data[i][j], data[0][j]));
            }
            tablaXML.append("</contacto>\n");
        }

        return String.format(plantillaXML, tablaXML);
    }


}
