package commandPackage;

public class Rectangle {
	public String color;
	private int positionX;
	private int positionY;
	public Rectangle(String color,int positionX,int positionY) {
		this.color = color;
		this.positionX = positionX;
		this.positionY= positionY;
	}
	public void setRectangle(int positionX,int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public int getPositionX() {
		return positionX;
	}
	public int getPositionY() {
		return positionY;
	}
}