package model;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHours;

    public Employee() {}

    public Employee(Integer hours, String name, Double valuePerHours) {
        this.hours = hours;
        this.name = name;
        this.valuePerHours = valuePerHours;
    }

    public Double payment() {
        return hours * valuePerHours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }
}
