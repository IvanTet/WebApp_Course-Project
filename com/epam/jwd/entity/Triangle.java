package com.epam.jwd.entity;

import java.util.Objects;

public class Triangle {
    private Dot dot1, dot2, dot3;

    public Triangle(Dot dot1, Dot dot2, Dot dot3) {
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.dot3 = dot3;
    }

    public Dot getDot(int index) {
        switch (index) {
            case 1:
                return this.dot1;
            case 2:
                return this.dot2;
            case 3:
                return this.dot3;
            default:
                System.out.println("wrong index");
                Dot dot0 = new Dot(0, 0);
                return dot0;
        }
    }

    public void changeDot(int oldDotNum, Dot newDot) {
        switch (oldDotNum) {
            case 1:
                this.dot1 = newDot;
            case 2:
                this.dot2 = newDot;
            case 3:
                this.dot3 = newDot;
            default:
                System.out.println("wrong index");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(this.dot1, ((Triangle) o).dot1) &&
                Objects.equals(this.dot2, ((Triangle) o).dot2) &&
                Objects.equals(this.dot3, ((Triangle) o).dot3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dot1, dot2, dot3);
    }

    @Override
    public String toString() {
        return "(" +
               dot1.getXAxis() + ' ' + dot1.getYAxis() + ", " +
                dot2.getXAxis() + ' ' + dot2.getYAxis() + ", " +
                dot3.getXAxis() + ' ' + dot3.getYAxis() + ", " +
                ")";
    }
}
