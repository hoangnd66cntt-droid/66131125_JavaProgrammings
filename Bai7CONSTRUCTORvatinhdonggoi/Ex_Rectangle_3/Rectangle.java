package Bai7CONSTRUCTORvatinhdonggoi.Ex_Rectangle_3;
public class Rectangle {
	private float length;
	private float width;
	public Rectangle()
	{
		length = 1.0f;
		width = 1.0f;
	}
	public Rectangle(float length, float width)
	{
		this.length = length;
		this.width = width;
	}
	public float getLength()
	{
		return this.length;
	}
	public float getWidth()
	{
		return this.width;
	}
	public void setLength(float length)
	{
		this.length = length;
	}
	public void setWidth(float width)
	{
		this.width = width;
	}
	public double getArea()
	{
		return length * width;
	}
	public double getPerimeter()
	{
		return  2 * (length + width);
	}
	public String toString()
	{
		String res = "Rectangle[length=" + length + ",width=" + width + "]";
		return res;
	}
}