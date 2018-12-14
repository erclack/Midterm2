package Shape;

public class Rectangle extends Shape{
	private int iWidth;
	private int iLength;
	public Rectangle(int width, int length) {
		
	}
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		return iLength*iWidth;
	}
	public double perimeter() {
		return 2*(iLength+iWidth);
	}
	
}
