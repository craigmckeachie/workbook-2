package com.pluralsight;

public class Customer {
    private int id;
    private String name;
    private float outStandingBalance;

    public Customer(int id, String name, float outStandingBalance) {
        this.id = id;
        this.name = name;
        this.outStandingBalance = outStandingBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getOutStandingBalance() {
        return outStandingBalance;
    }

    public void setOutStandingBalance(float outStandingBalance) {
        this.outStandingBalance = outStandingBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", outStandingBalance=" + outStandingBalance +
                '}';
    }
}
