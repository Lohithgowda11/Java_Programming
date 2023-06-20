package sample;

public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit type casting (widening)
        int numInt = 10;
        double numDouble = numInt; // Implicitly cast int to double
        System.out.println("Implicit Casting: int to double");
        System.out.println("numInt = " + numInt);
        System.out.println("numDouble = " + numDouble);

        // Explicit type casting (narrowing)
        double numDouble2 = 3.14;
        int numInt2 = (int) numDouble2; // Explicitly cast double to int
        System.out.println("\nExplicit Casting: double to int");
        System.out.println("numDouble2 = " + numDouble2);
        System.out.println("numInt2 = " + numInt2);
    }
}

