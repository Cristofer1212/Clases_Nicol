package Clases_Y_Objetos.Clases_Wrapper;

public class ClassWrapperInteger {
    public static void main(String[] args) {


        // Ejemplos con Integer


        int number = Integer.parseInt("123"); // número = 123
        System.out.println("El valor de 'number' es: " + number);

        int wrapper = Integer.valueOf("123"); //
        System.out.println("El valor de 'wrapper' es: " + wrapper);

        String texto = Integer.toString(123); // texto = '123'
        System.out.println("El valor de 'texto' es: " + texto);


        int result = Integer.compare(20,10); // reuslto = -1 (10 < 20)
        System.out.println("El valor de 'result' es: " + result);

        int max = Integer.max(10,20);
        System.out.println("El valor de 'max' es: " + max);





    }
}
