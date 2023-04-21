public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("1234ABCD", "Ford", 2010, 5000.00);
        SecondHandVehicle secondHandVehicle = new SecondHandVehicle("5678cvb", "Toyota", 2010, 8000.00, 2);

        System.out.println("Vehicle Registration Number: " + vehicle.getRegNo());
        System.out.println("Vehicle Make: " + vehicle.getMake());
        System.out.println("Vehicle Year of Manufacture: " + vehicle.getYearOfManufacture());
        System.out.println("Vehicle Value: " + vehicle.getValue());
        System.out.println("Vehicle Age: " + vehicle.calculateAge(2023));

        System.out.println("Second Hand Vehicle Registration Number: " + secondHandVehicle.getRegNo());
        System.out.println("Second Hand Vehicle Make: " + secondHandVehicle.getMake());
        System.out.println("Second Hand Vehicle Year of Manufacture: " + secondHandVehicle.getYearOfManufacture());
        System.out.println("Second Hand Vehicle Value: " + secondHandVehicle.getValue());
        System.out.println("Second Hand Vehicle Age: " + secondHandVehicle.calculateAge(2023));
        System.out.println("Second Hand Vehicle Number of Owners: " + secondHandVehicle.getNumberOfOwners());
        System.out.println("Second Hand Vehicle Has Multiple Owners? " + secondHandVehicle.hasMultipleOwners());

    }
}