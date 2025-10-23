package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 2;
        int num = -1;
        checkLessOrGreaterEqual(n1, n2);
        checkMultiply(n1, n2);
        checkPositiveNegative(num);

    }

    //TODO ↓
    // Si el valor es menor, tiene que devolver el siguiente mensaje: X es menor que Y
    // Si el valor es mayor o igual, tiene que devolver el siguiente mensaje: X es mayor o igual que Y
    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if (n1 < n2) {
            System.out.println("1.- X es menor que Y");
        } else {
            System.out.println("1.- X es mayor o igual que Y");
        }

    }

    //TODO ↓
    // Si es múltiplo, tiene que devolver el siguiente mensaje: X es multiplo de Y
    // Si no es múltiplo, tiene que devolver el siguiente mensaje: X no es multiplo de Y
    public static void checkMultiply(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.println("2. X es multiplo de Y");
        } else {
            System.out.println("2. X no es multiplo de Y");
        }

    }

    //TODO ↓
    // Si es negativo, tiene que devolver el siguiente mensaje: X es negativo.
    // Si es positivo o cero, tiene que devolver el siguiente mensaje: X es positivo.
    public static void checkPositiveNegative(int num) {
        if (num < 0) {
            System.out.println("3. X es negativo.");
        } else {
            System.out.println("3. X es positivo. ");
        }

    }
}
