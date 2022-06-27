import taxType.*;

class Bill {
    private final double amount;
    private final TaxType taxType;
    private final TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) throws AmountException {
        if (amount < 0) throw new AmountException("Зарплата не может быть меньше 0");
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public String payTaxes() {
        // посчитать размер налога исходя из TaxType
        double taxAmount = taxType.calculateTaxFor(amount);
        return taxService.payOut(taxAmount);
    }
}
