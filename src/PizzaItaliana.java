import java.util.List;

public class PizzaItaliana extends Pizza {
        private String salsa;
        private int tiempoEnHorno;

        public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
            super(nombre, precio, ingredientes);
            this.salsa = salsa;
            this.tiempoEnHorno = tiempoEnHorno;
        }

        @Override
        public void prepare()
        {
            super.prepare();
            System.out.println("Agregando la salsa de " + salsa);
            System.out.println("La pizza está en el horno durante " + tiempoEnHorno + " minutos.");
        }

        @Override
        public String toString() {
            return super.toString() + "\nSalsa: " + salsa + "\nTiempo en horno: " + tiempoEnHorno + " minutos";
        }

        public String getSalsa() {
            return salsa;
        }

        public int getTiempoEnHorno() {
            return tiempoEnHorno;
        }
}

