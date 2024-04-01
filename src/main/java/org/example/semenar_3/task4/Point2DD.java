package org.example.semenar_3.task4;

import java.util.Objects;

public class Point2DD {
    private int x;
    private int y;

    public Point2DD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point2DD)) return false;
        Point2DD point2DD = (Point2DD) o;
        return x == point2DD.x && y == point2DD.y;
    }

    @Override
    public String toString() {
        return String.format("Координаты ячейки с ошибкой = (%s; %s)", x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
