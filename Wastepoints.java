class Wastepoints{
    public double calculateTotalWaste(double point1Waste, double point2Waste) {
        double point1waste = 0.0;
        double point2waste = 0.0;
        double totalWaste = point1Waste + point2Waste;
        return totalWaste;}
        public static void main(String[] args) {
            Wastepoints wastepoints = new Wastepoints();
            double point1Waste = 500.25;
            double point2Waste = 750.50;
            double totalWaste = wastepoints.calculateTotalWaste(point1Waste, point2Waste);
            System.out.println("Total Waste Collected: " + totalWaste + " kg");
        }
    }
