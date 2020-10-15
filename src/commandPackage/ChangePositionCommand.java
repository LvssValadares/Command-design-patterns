package commandPackage;

public class ChangePositionCommand implements ICommand{
	private Rectangle rectangle;
	private int newPositionX;
	private int previousPositionX;
	private int newPositionY;
	private int previousPositionY;
	public ChangePositionCommand(Rectangle rectangle, int positionX, int positionY) {
		this.rectangle = rectangle;
		this.previousPositionX = rectangle.getPositionX();
		this.previousPositionY = rectangle.getPositionY();
		this.newPositionX = positionX;
		this.newPositionY = positionY;
	}
	public void redo() {
		rectangle.setRectangle(newPositionX, newPositionY);
	}
	public void undo() {
		rectangle.setRectangle(previousPositionX, previousPositionY);
	}
	public String toString() {
		return "ChangePositionCommand[" + rectangle + "," + previousPositionX + "/" + previousPositionY + "->" + newPositionX + "/" + newPositionY + "]";
	}
}
