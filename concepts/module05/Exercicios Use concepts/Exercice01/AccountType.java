package org.example.ex01;

public enum AccountType {
    CHECKING_ACCOUNT("Checking Account", 0.02),
    SAVING_ACCOUNT("Saving Account", 0.05),
    SALARY_ACCOUNT("Salary Account", 0.01);

    private final String label;
    private final double interestRate;

    AccountType(String label, double interestRate) {
        this.label = label;
        this.interestRate = interestRate;
    }
    public String getLabel() {
        return label;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return label + " (" + (interestRate * 100) + "%)";
    }

}
