public class Topping {

        private String nameTopping;

        public Topping(String name) {
            this.nameTopping = name;
        }

        public void agregar(Pizza pizza) {
            pizza.getIngredients().add(nameTopping);
            System.out.println("Se agregó el " + nameTopping + " a la pizza " + pizza.getName());
        }
}


