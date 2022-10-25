package com.example.practice.java_inheritance_prac;

public class VIPCustomer extends Customer {

    private String agentId;

    double discountRatio;


    public VIPCustomer() {

        customerLevel = "VIP";
        bonusRatio = 0.05;
        discountRatio = 0.01;
    }

    public String getAgentId() {
        return agentId;
    }
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

}
