package taxType;

public class VATaxType extends TaxType {
    public static double COEFFICIENT = 0.18;

    @Override
    public double calculateTaxFor(double amount) {
        return amount * COEFFICIENT;
    }
}