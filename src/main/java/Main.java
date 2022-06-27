import taxType.*;

public class Main {

    public static void main(String[] args) throws AmountException {
        TaxService ONF = new TaxService();
        TaxService OMP = new TaxService();
        TaxService oTaxServ = new TaxService();

        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType pTaxType = new ProgressiveTaxType();
        IncomeTaxType iTaxType = new IncomeTaxType();

        Bill[] payments = new Bill[]{
                // new Bill(-5000000, iTaxType, oTaxServ),
                new Bill(324345, pTaxType, OMP),
                new Bill(43578989, vaTaxType, ONF)
        };

        for (Bill bill :
                payments) {
            System.out.println(bill.payTaxes());
        }
    }
}
