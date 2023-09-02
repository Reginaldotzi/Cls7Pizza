package pkgPizza;

import java.util.ArrayList;

public class Topping {
    private String nombre;

    private double precio;

    private ArrayList<String> ingredientes = new ArrayList<>();


    public void agregarIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }

    //constructor
    public Topping(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public String toString(){
        return "Topping{ nombre: "+nombre+"Ingredientes: "+ingredientes;
    }


    //Getters and setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

}
