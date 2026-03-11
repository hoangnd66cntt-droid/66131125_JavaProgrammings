package Bai7CONSTRUCTORvatinhdonggoi.Ex_Circle_1_1;

public public class vongtron {
	private double radius;
	private String color;
	public vongtron()
	{
		radius = 1.0;
		color = "red";
	}
	public vongtron(double radius)
	{
		this.radius = radius;
	}
	public vongtron(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String ToString()
	{
		String s = "Hinh tron co ban kinh " + radius + " va co mau " + color;
		return s;
	}
	public double getArea()
	{
		double area = radius * radius * Math.PI;
		return area;
	}
}
