package Clase_String;

public class ExampleString {

    public static void main(String[] args) {


        String name = "Nicol";
        String name2 = "Cristofer";

        String nameDesord =  "CrIsToFER";


        System.out.println(nameDesord.toLowerCase());





        Person person = new Person("Cristofer", "Azaña");
        System.out.println(person);

        Person person2 = new Person("Nicol", "Mariluz");
        System.out.println(person2);


        int cantdad = "hola".length(); //


        // '  JAVA       '  --> 'java'
        String texto = " java  ".trim();
        System.out.println(texto);

        // ["A","B","C"]
        String[] partes = "A,B,C".split(",");











    }







}
