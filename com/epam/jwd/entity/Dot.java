package com.epam.jwd.entity;

import java.util.Objects;

public class Dot {
    protected double XAxis, YAxis;

    public Dot(double XAxis, double YAxis) {
        this.XAxis = XAxis;
        this.YAxis = YAxis;
    }

    public double getXAxis() {
        return XAxis;
    }

    public double getYAxis() {
        return YAxis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dot dot = (Dot) o;

        if (Double.compare(dot.XAxis, XAxis) != 0) return false;
        return Double.compare(dot.YAxis, YAxis) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(XAxis);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(YAxis);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString(){
        return "(" + XAxis + ' ' + YAxis + ")";
    }

}
