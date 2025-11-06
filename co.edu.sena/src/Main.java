public class Main {
    public static void main(String[] args) {
        trabajoejemplo orden1 = new trabajoejemplo ("ORD-001", "Mesa de comedor", 850000);
        trabajoejemplo orden2 = new trabajoejemplo ("ORD-002", "Biblioteca", 1200000);
        trabajoejemplo orden3 = new trabajoejemplo ("ORD-003", "Cama King Size", 950000);

        orden1.showInfo();
        orden2.showInfo();
        orden3.showInfo();
    }
}