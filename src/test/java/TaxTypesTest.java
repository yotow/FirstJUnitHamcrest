import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taxType.IncomeTaxType;
import taxType.ProgressiveTaxType;
import taxType.VATaxType;

public class TaxTypesTest {

    @Test
    public void vaTaxType_test() {
        double amount = 100;
        double expected = amount * VATaxType.COEFFICIENT;

        VATaxType taxType = new VATaxType();

        Assertions.assertEquals(taxType.calculateTaxFor(amount), expected);
    }

    @Test
    public void incomeTaxType_test() {
        double amount = 100;
        double expected = amount * IncomeTaxType.COEFFICIENT;
//        double expected = amount * 14;

        IncomeTaxType taxType = new IncomeTaxType();

        Assertions.assertEquals(taxType.calculateTaxFor(amount), expected);
    }

    @Test
    public void progressiveTaxType_test() {
        double amount = 100;
        double expected = amount * ProgressiveTaxType.COEFFICIENT;

        ProgressiveTaxType taxType = new ProgressiveTaxType();

        Assertions.assertEquals(taxType.calculateTaxFor(amount), expected);
    }

}
