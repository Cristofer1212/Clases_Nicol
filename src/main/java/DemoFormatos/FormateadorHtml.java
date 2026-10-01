package DemoFormatos;

public class FormateadorHtml extends Formateador {

    private String plantillaHTML = """
            <html>
                <head>
                    <meta charset=\\"UTF-8\\">\s
                    <title>Data</title>\s
                </head>
                <body>
                    %s
                </body>
            </html>
            """;

    @Override
    public String formatear(String[][] data) {
        StringBuilder tablaHtml =
                new StringBuilder("<table border=\"1\">\n");

        for (int i = 0; i < data.length; i++) {
            tablaHtml.append("<tr>\n");
            for (int j = 0; j < data[i].length; j++) {
                if (i == 0) {
                    tablaHtml.append(
                            String.format("<th>%s</th>\n", data[i][j]));
                } else {
                    tablaHtml.append(
                            String.format("<td>%s</td>\n", data[i][j]));
                }
            }
            tablaHtml.append("</tr>");
        }

        tablaHtml.append("</table>\n");
        return String.format(plantillaHTML, tablaHtml);
    }

}
