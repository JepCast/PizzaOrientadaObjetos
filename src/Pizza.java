import java.util.ArrayList;
import java.util.List;


public class Pizza {

    private String namePizza;
    private double price;
    private List<String> ingredients;
    //Scanner scanner = new Scanner(System.in);

    public Pizza(String namePizza, double price, List<String> ingredients) {
        this.namePizza = namePizza;
        this.price = price;
        this.ingredients = ingredients;
    }

    public void prepare() {
        System.out.println("La pizza " + namePizza + " se prepara con los siguientes ingredientes: ");
        System.out.println(ingredients);
        //System.out.println("Presiona Enter para confirmar que la pizza y sus ingredientes son correctos.");
        //scanner.nextLine();
    }

    @Override
    public String toString() {
        System.out.println("\nAhora de acuerdo a tu orden, se preparará la siguiente pizza: ");
        return "Has ordenado una pizza: " + namePizza + "\nCon un precio de: " + price + "\nY con los siguientes ingredientes:\n" + ingredients + "]";
   }

    public String getName() {
        return namePizza;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }


    public static void main(String[] args) {
            List<String> ingredientesPizzaHawaiana = new ArrayList<>();
            ingredientesPizzaHawaiana.add("Queso");
            ingredientesPizzaHawaiana.add("Tomate");
            ingredientesPizzaHawaiana.add("Cebolla");
            ingredientesPizzaHawaiana.add("Piña");
            ingredientesPizzaHawaiana.add("Jamón");
            ingredientesPizzaHawaiana.add("Masa");


            Pizza HawaianaPizza = new Pizza("Hawaiana", 50.00, ingredientesPizzaHawaiana);
            HawaianaPizza.prepare();
            System.out.println(HawaianaPizza);

            List<String> ingredientesPizzaItaliana = new ArrayList<>();
            ingredientesPizzaItaliana.add("Masa");
            ingredientesPizzaItaliana.add("Queso");
            ingredientesPizzaItaliana.add("Tomate");
            ingredientesPizzaItaliana.add("Pepperoni");

            PizzaItaliana miPizzaItaliana = new PizzaItaliana("Pepperoni Especial", 40.00, ingredientesPizzaItaliana, "tomate", 15);
            miPizzaItaliana.prepare();
            System.out.println(miPizzaItaliana);

            System.out.println("\nAgregando ingredientes extra, al gusto a la pizza");
            Topping PimientaTopping = new Topping("Pimienta");
            PimientaTopping.agregar(miPizzaItaliana);
            Topping chileTopping = new Topping("chile");
            chileTopping.agregar(miPizzaItaliana);
            Topping cebollaTopping = new Topping("cebolla");
            cebollaTopping.agregar(miPizzaItaliana);

        }

    }



