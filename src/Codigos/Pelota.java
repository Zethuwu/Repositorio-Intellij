package Codigos;

public class Pelota {

    public String color;
    private String tamano;
    protected String material;

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void impresion(){
        System.out.println("Hola a todos");
    }
}
