public class FinancialCalculations {

    // Simple Interest
    public static double fvSimple(double pv, double r, int n) {
        return (1 + r * n) * pv;
    }

    public static double pvSimple(double fv, double r, int n) {
        return fv / (1 + r * n);
    }

    public static double rSimple(double pv, double fv, int n) {
        return (fv / pv - 1) / n;
    }

    // Compound Interest
    public static double fvCompound(double pv, double r, int n) {
        return pv * Math.pow((1 + r), n);
    }

    public static double pvCompound(double fv, double r, int n) {
        return fv / Math.pow((1 + r), n);
    }

    public static double rCompound(double pv, double fv, int n) {
        return Math.pow((fv / pv), (1.0 / n)) - 1;
    }

    // Periodic Interest
    public static double fvInterval(double pv, double r, int n, int m) {
        return pv * Math.pow((1 + r / m), (m * n));
    }

    public static double pvInterval(double fv, double r, int n, int m) {
        return fv / Math.pow((1 + r / m), (m * n));
    }

    public static double rInterval(double pv, double fv, int n, int m) {
        return (Math.pow((fv / pv), (1.0 / (m * n))) - 1) * m;
    }

    // Continuous Interest
    public static double fvContinuous(double pv, double r, int n) {
        return pv * Math.exp(r * n);
    }

    public static double pvContinuous(double fv, double r, int n) {
        return fv / Math.exp(r * n);
    }

    public static double rContinuous(double pv, double fv, int n) {
        return Math.log(fv / pv) / n;
    }

    // Interest with Periodic Deposit
    public static double fvWithDeposit(double r, int n, int m, double a) {
        return (a / (r / m)) * (Math.pow((1 + r / m), (m * n)) - 1);
    }

    public static double pvWithDeposit(double r, int n, int m, double a) {
        return (a / (r / m)) * (1 - 1 / Math.pow((1 + r / m), (m * n)));
    }
}
