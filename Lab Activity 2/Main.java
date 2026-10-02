public class Main {
    public static void main(String[] args) {
      
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2015);
        Vehicle v2 = new Vehicle("Ford", "Mustang", 1965);
        Vehicle v3 = new Vehicle("Honda", "Civic", 1998);

        Vehicle[] vehicles = {v1, v2, v3};

        System.out.println("=== Original methods and getters ===");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("Age: " + v.calculateAge());
            System.out.println("Vintage: " + v.isVintage());
            System.out.println("Getters -> " + v.getBrand() + " " + v.getModel() + " " + v.getYear());
            System.out.println();
        }

        System.out.println("=== setYear tests on " + v1.getBrand() + " " + v1.getModel() + " ===");
        boolean result = v1.setYear(2000);
        System.out.println("setYear(2000) returned " + result + "; year = " + v1.getYear()
                + "; age = " + v1.calculateAge() + "; vintage = " + v1.isVintage());

        result = v1.setYear(1885);
        System.out.println("setYear(1885) returned " + result + "; year = " + v1.getYear());

        result = v1.setYear(2027);
        System.out.println("setYear(2027) returned " + result + "; year = " + v1.getYear());

        System.out.println();
        System.out.println("=== Constructor validation ===");
        Vehicle low = new Vehicle("Test", "TooOld", 1885);
        System.out.println("New vehicle with year 1885 -> initial year = " + low.getYear());

        Vehicle high = new Vehicle("Test", "TooNew", 2027);
        System.out.println("New vehicle with year 2027 -> initial year = " + high.getYear());
    }
}
