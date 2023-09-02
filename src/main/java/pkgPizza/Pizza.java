package pkgPizza;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList<>();

    // Construcutor.

    public Pizza (String name, double price, Topping... toppings){
        this.name = name;
        this.price = price;
        for (Topping to : toppings){
            this.toppings.add(to);
        }
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public void removeTopping(int index){
        this.toppings.remove(index);
    }

    @Override
    public String toString(){
        return "Pizza:"+name+"price="+price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void prepare(){
        System.out.println("Preparando la pizza....."+name);
        System.out.println("Agregando chunches...");
        for (Topping topping: toppings){
            System.out.println("- "+topping.getNombre());

            try {
                Thread.sleep(1000);
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("TIN, la pizza está lista");
    }

    public void calcularTotal(){
        double preciototal = 0;
        if (toppings != null){
            for ( Topping ingrediente : toppings){

                preciototal += ingrediente.getPrecio();
            }
            preciototal = preciototal + price;
            if (preciototal > 0)
            {
                System.out.println("El total a pagar es: "+preciototal);
            }
        }
    }
}

