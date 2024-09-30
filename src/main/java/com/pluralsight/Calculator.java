package com.pluralsight;

class Calculator{

   public static void main(String[] args){
     // Invoking or calling a method (static)
     Calculator calculator = new Calculator();
     calculator.addInstance(1,2);
     addStatic(3,4);


   }

public void addInstance(int num1, int num2){
    System.out.println(num1 + num2);
}

public static void addStatic(int num1, int num2){
    System.out.println(num1 + num2);

}
// Static add
// static subtract
// Static multiplication
// Static division


    public static int addStatic(int num1, int num2) {
        System.out.println(num1 + num2)
       int sum = add(num1:45, num2:89)
    }

    public static int subtraction(int num3, int num4) {
        return num3 - num4;
    }

    public static int multiply(int num5, int num6) {
       return num5 * num6
        multiply(num5:50, num6:90)
    }

    public static int divide(int num7, int num8) {
       return num7 / num8
               divide(num7:60, num8:2)
    }


// Receive two inputs (ints)
// Return a single number (int, double)

// Extras
// Static Mod
// Three inputs


}