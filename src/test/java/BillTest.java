import org.junit.jupiter.api.*;
import taxType.IncomeTaxType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BillTest {

    @Test
    public void testPayTaxes_And_TaxService_validArgs_success() throws AmountException {
        final double amount = 100;
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        incomeTaxType.calculateTaxFor(amount);
        TaxService taxService = new TaxService();
        Bill bill = new Bill(amount, incomeTaxType, taxService);

        final String expected = TaxService.TEXT_FOR_OUT + incomeTaxType.calculateTaxFor(amount);
        final String result = bill.payTaxes();

        assertThat(result, result.equals(expected));
    }

    @Test
    public void testPayTaxes_invalidArgs() {
        final double amount = -100;
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        incomeTaxType.calculateTaxFor(amount);
        TaxService taxService = new TaxService();
        assertThrows(AmountException.class, () -> new Bill(amount, incomeTaxType, taxService));
    }
}
