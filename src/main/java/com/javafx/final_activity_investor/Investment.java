package com.javafx.final_activity_investor;

public class Investment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int phone;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    private float investmentAmount;

    public float getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(float investmentAmount) {
        this.investmentAmount = investmentAmount;
    }


    public Investment(String name, String address, int phone, float investmentAmount) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.investmentAmount = investmentAmount;
    }

    public double getAmount() {
        double investmentAmount = getInvestmentAmount();
        double tenPercent = investmentAmount * 0.1;
        double totalAmount = investmentAmount + tenPercent;
        return totalAmount;
    }


}

//package com.javafx.table_demo; public class Student {
//    private String name;
//
//    public String getCourse() {
//        return course;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }
//
//    private String course;
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    private int year;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Student(String name, String course, int year) {
//        this.name = name;
//        this.course = course;
//        this.year = year;
//    }
//}