package Clases_Y_Objetos.HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House h1 = new House(4,7,20);
        h1.setDoor(-6);
        h1.abrirPuerta();

        double area = h1.calcularArea();
        System.out.println(area);

        ;
    }

}
