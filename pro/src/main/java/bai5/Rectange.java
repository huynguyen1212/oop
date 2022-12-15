/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author nguyenquanghuy
 */
public class Rectange {

    private double width, height;
    private String color;

    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public double findPerimeter() {
        return (this.height + this.width) * 2;
    }
    
        public double findArea() {
        return (this.height * this.width);
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color.substring(0, 1).toUpperCase() + color.substring(1, color.length()).toLowerCase();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
}
