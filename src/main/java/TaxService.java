class TaxService {

    public static final String TEXT_FOR_OUT = "Уплачен налог в размере ";

    public String payOut(double taxAmount) {
        return TEXT_FOR_OUT + taxAmount;
    }
}
