package commandPackage;

public class ChangeColorCommand implements ICommand{
	private Rectangle rectangle;
	private String previousColor;
	private String newColor;
	public ChangeColorCommand(Rectangle rectangle,String newColor) {
		this.rectangle = rectangle;
		this.previousColor = rectangle.getColor();
		this.newColor = newColor;
	}
	public void redo() {
		rectangle.setColor(newColor);
	}
	public void undo() {
		rectangle.setColor(previousColor);
	}
	public String toString() {
		return "ChangeColorCommand[" + rectangle + "," + previousColor + "->" + newColor + "]";
	}	
}
