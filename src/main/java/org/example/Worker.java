package org.example;

public class Worker {
    private String name;
    private int salary;
    private long passportId;
    private int phoneNumber;
    private byte cabinet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getPassportId() {
        return passportId;
    }

    public void setPassportId(long passportId) {
        this.passportId = passportId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public byte getCabinet() {
        return cabinet;
    }

    public void setCabinet(byte cabinet) {
        this.cabinet = cabinet;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", passportId=" + passportId +
                ", phoneNumber=" + phoneNumber +
                ", cabinet=" + cabinet +
                '}';
    }
}
