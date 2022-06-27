package taxType;

public class ProgressiveTaxType extends TaxType {
    public static double COEFFICIENT = 0.15;

    @Override
    public double calculateTaxFor(double amount) {
        return amount * COEFFICIENT;
    }
}
