
public interface ControllerInterface {
	/**
	 * 某处的方块试图向右交换<br/>
	 * @param 其坐标x,y
	 */
	public void moveRight(int x,int y);
	/**
	 * 某处的方块试图向左交换
	 */
	public void moveLeft(int x, int y);
	/**
	 * 某处的方块向左交换
	 */
	public void moveUp(int x,int y);
	/**
	 * 某处的方块试图向下交换 
	 */
	public void moveDown(int x,int y);
	/**
	 * 当检测到无法消除时，调用该方法
	 */
	public void upset();
}
