package data;

public class Corner extends AbstractPosition {
	private boolean cornerPoint;
	private boolean isCorner;
	
	public boolean isCornerPoint() {
		return cornerPoint;
	}
	public void setCornerPoint(boolean cornerPoint) {
		this.cornerPoint = cornerPoint;
	}
	public boolean isCorner() {
		return isCorner;
	}
	public void setCorner(boolean isCorner) {
		this.isCorner = isCorner;
	}
}
