package data;

public abstract class AbstractPosition{
	private int positionX;
	private int positionY;
	
	public AbstractPosition() {
		
	}
	
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
}
