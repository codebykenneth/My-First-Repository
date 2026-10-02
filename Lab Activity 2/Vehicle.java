public class Vehicle {
    private static final int MIN_YEAR = 1886;
    private static final int MAX_YEAR = 2026;

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        if (isValidYear(year)) {
            this.year = year;
        } else {
            this.year = MAX_YEAR;
        }
    }

    private boolean isValidYear(int year) {
        return year >= MIN_YEAR && year <= MAX_YEAR;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean setYear(int year) {
        if (isValidYear(year)) {
            this.year = year;
            return true;
        }
        return false;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public int calculateAge() {
        return 2026 - year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }
}