public class trabajoejemplo {
        String orderNumber;
        String furnitureType;
        double price;

        public trabajoejemplo(String orderNumber, String furnitureType, double price) {
            this.orderNumber = orderNumber;
            this.furnitureType = furnitureType;
            this.price = price;
        }

        public void showInfo() {
            System.out.println("Orden No.: " + orderNumber);
            System.out.println("Mueble: " + furnitureType);
            System.out.println("Precio: $" + price);
            System.out.println("--------------------------------");
        }
    }

