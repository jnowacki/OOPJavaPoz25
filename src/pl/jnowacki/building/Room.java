package pl.jnowacki.building;

public class Room {

    public static String myStaticField = "q";

    double a;
    double b;
    double h;

    {
        System.out.println("Nowy obiekt jest tworzony");
    }

    static {
        System.out.println("Pierwszy obiekt klasy obiekt jest tworzony");
    }

    public Room(double a, double b) {
        this.a = a;
        this.b = b;

        this.h = 2.4;
    }

    public static void displaySth() {
        System.out.println(myStaticField);
    }

    public Room(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void displayProperties(){
        System.out.printf("Size: %.2f, volume: %.2f\n", calculateSize(), calculateVolume());
    }

    private double calculateSize() {
        return a * b;
    }

    private double calculateVolume() {
        return calculateSize() * h;
    }

    public static class MyNestedStaticClass {
        public String name = "asd";

        public void displ(){
            System.out.println(myStaticField);
            displaySth();
        }
    }
}
