import org.junit.jupiter.api.Test;
import taxType.IncomeTaxType;
import taxType.ProgressiveTaxType;
import taxType.VATaxType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;

public class TaxTypesTest {

    @Test
    public void vaTaxType_test() {
        double amount = 100;
        double expected = amount * VATaxType.COEFFICIENT;

        VATaxType taxType = new VATaxType();
        double res = taxType.calculateTaxFor(amount);

        assertThat(res, allOf(equalTo(expected)));
    }

    @Test
    public void incomeTaxType_test() {
        double amount = 100;
        double expected = amount * IncomeTaxType.COEFFICIENT;
//        double expected = amount * 14;

        IncomeTaxType taxType = new IncomeTaxType();
        double res = taxType.calculateTaxFor(amount);

        assertThat(res, allOf(equalTo(expected)));

    }

    @Test
    public void progressiveTaxType_test() {
        double amount = 100;
        double expected = amount * ProgressiveTaxType.COEFFICIENT;

        ProgressiveTaxType taxType = new ProgressiveTaxType();
        double res = taxType.calculateTaxFor(amount);

        assertThat(res, allOf(equalTo(expected)));
    }
}
