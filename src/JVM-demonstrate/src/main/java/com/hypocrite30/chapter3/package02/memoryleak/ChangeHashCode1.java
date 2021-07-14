package com.hypocrite30.chapter3.package02.memoryleak;

import java.util.HashSet;

/**
 * @Description: 演示内存泄漏
 * @Author: Hypocrite30
 * @Date: 2021/7/14 22:43
 */

public class ChangeHashCode1 {
    public static void main(String[] args) {
        HashSet<Point> hs = new HashSet<Point>();
        Point cc = new Point();
        cc.setX(10);  // hashCode = 41
        hs.add(cc);

        cc.setX(20);  // hashCode = 51  此行为导致了内存的泄漏

        System.out.println("hs.remove = " + hs.remove(cc));  // false
        hs.add(cc);
        System.out.println("hs.size = " + hs.size());  // size = 2

        System.out.println(hs);  // [Point{x=20}, Point{x=20}]
    }

}

class Point {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        if (x != other.x) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + '}';
    }
}
