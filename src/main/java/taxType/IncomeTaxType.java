package taxType;

public class IncomeTaxType extends TaxType {

    public static double COEFFICIENT = 0.13;

    @Override
    public double calculateTaxFor(double amount) {
        return amount * COEFFICIENT;
    }
}
