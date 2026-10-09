package Clases_Y_Objetos.HouseExample;

public class House {
    private int door;
    private int window;
    private double size;

    public House(int door, int window, double size){
        this.door= door;
        this.window=window;
        this.size= size;
    }

    public void abrirPuerta(){
        System.out.println("Puertas abiertas " + door);
    }

    public double calcularArea(){
       return size*window;
    }
    //abrir puerta y calcular area
    //door (puerta), window (ventana), size (tamaño)

    public int getDoor(){
        return door;
    }

    public int getWindow(){
        return window;
    }

    public double getSize(){
        return size;
    }

    public void setDoor (int door){
       if (door<0){
           System.err.println("La puerta no puede ser negativa.");
       }
        this.door=door;
    }

    public void setWindow (int window){
        this.window=window;
    }

    public void setSize(double size){
        this.size=size;
    }



}