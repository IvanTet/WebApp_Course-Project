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
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.XAxis == ((Dot) o).XAxis &&
                this.YAxis == ((Dot) o).YAxis;
    }

    @Override
    public int hashCode(){
        return Objects.hash(XAxis, YAxis);
    }

    @Override
    public String toString(){
        return "(" + XAxis + ' ' + YAxis + ")";
    }

}
