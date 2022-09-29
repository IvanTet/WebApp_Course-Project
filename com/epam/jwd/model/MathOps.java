package com.epam.jwd.model;

import com.epam.jwd.entity.Dot;
import com.epam.jwd.entity.Triangle;

public class MathOps {

    public static double getDistance(Dot dot1, Dot dot2) {
        double distance;
        double X1 = dot1.getXAxis();
        double X2 = dot2.getXAxis();
        double Y1 = dot1.getYAxis();
        double Y2 = dot2.getYAxis();

        distance = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));

        return distance;
    }

    public static double GetPerimeter(Triangle triangle) {
        double perimeter = getDistance(triangle.getDot(1), triangle.getDot(2)) +
                getDistance(triangle.getDot(2), triangle.getDot(3)) +
                getDistance(triangle.getDot(3), triangle.getDot(1));
        return perimeter;
    }

    public static double GetSquare(Triangle triangle) {
        double halfPerimeter = GetPerimeter(triangle);
        double square;
        double aEdge = getDistance(triangle.getDot(1), triangle.getDot(2));
        double bEdge = getDistance(triangle.getDot(2), triangle.getDot(3));
        double cEdge = getDistance(triangle.getDot(3), triangle.getDot(1));
        square = Math.sqrt((halfPerimeter * (halfPerimeter - aEdge) * (halfPerimeter -bEdge)* (halfPerimeter-cEdge)));
        return square;
    }

}