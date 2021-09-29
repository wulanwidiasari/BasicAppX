package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight() {
        this.gram = gram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setOunce(double gram) {
        this.gram = gram * 28.3495231;
    }

    public void setPound(double gram) {
        this.gram = gram * 453.59237;
    }

    public double getGram() {
        return this.gram;
    }

    public double getOunce() {
        return this.gram / 28.3495231;
    }

    public double getPound() {
        return this.gram / 453.59237;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "Grm":
                setGram(value);
                break;
            case "Onc":
                setOunce(value);
                break;
            case "Pnd":
                setPound(value);
                break;
        }

        switch (convUnit) {
            case "Grm":
                value = getGram();
                break;
            case "Onc":
                value = getOunce();
                break;
            case "Pnd":
                value = getPound();
                break;
        }
        return value;
    }
}
