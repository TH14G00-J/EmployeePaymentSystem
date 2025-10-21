package model;

public class OutsourceEmployee extends Employee{
    private Double additionalCharge;

    public OutsourceEmployee() {}

    public OutsourceEmployee(Integer hours, String name, Double valuePerHours, Double additionalCharge) {
        super(hours, name, valuePerHours);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 110 / 100;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
