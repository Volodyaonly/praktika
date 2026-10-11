package ru.mirea.lab7.math;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override

    public double modulus(double real, double imaginary) {
        return Math.hypot(real, imaginary);
    }
}
