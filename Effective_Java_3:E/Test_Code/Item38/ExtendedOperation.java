public enum ExtendedOperation implements Operation {
    EXP("^") {
    public double apply(double x, double y) {return x ^ y};
    },
    REMAINDER("%") {
    public double apply(double x, double y) {return x % y};
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        reutnr symbol;
    }
}
