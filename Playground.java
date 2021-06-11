package com.company;
public class Playground {
    private String name;
    private String location;
    private float availableHours;
    private String size;
    private float pricePerHour;
    private double cancellationPeriod;
    private String feedback;
    private String status;

    public Playground()
    {
        name="";
        location="";
        availableHours= 0;
        size="";
        pricePerHour=0;
        cancellationPeriod=0;
        feedback="";
        status="";

    }
    public Playground(String name,String location,float availableHours,String size,float pricePerHour,float cancellationPeriod)
    {
        this.name=name;
        this.location=location;
        this.availableHours=availableHours;
        this.size=size;
        this.pricePerHour=pricePerHour;
        this.cancellationPeriod=cancellationPeriod;

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailableHours(float availableHours) {
        this.availableHours = availableHours;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void setCancellationPeriod(float cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getAvailableHours() {
        return availableHours;
    }

    public String getSize() {
        return size;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public double getCancellationPeriod() {
        return cancellationPeriod;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Playground{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", availableHours=" + availableHours +
                ", size='" + size + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", cancellationPeriod=" + cancellationPeriod +
                ", feedback='" + feedback + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
