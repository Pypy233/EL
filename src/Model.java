import java.util.ArrayList;

public class Model implements ModelInterface {
	private	int[][] array;
	private	int vertical;
	private	int horizontal;
	private int kind = 5;
	ArrayList<Observer> observers = new ArrayList<Observer>();
    /*
     * 初始化数组，使其不会出现未移动便可以消除的情况。
     * @see ModelInterface#initilize()
     */
	@Override
	public void initilize() {
		// TODO Auto-generated method stub
		
		array = new int[vertical][horizontal];
		//进行随机数赋值
		for(int i = 0 ; i < vertical; i++)
			for(int j = 0 ; j < horizontal; j++){
				array[i][j] = (int)Math.random()*kind + 1;
			}
	}
	
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
	 for(Observer o : observers){
		 o.update();
	  }
	}

	@Override
	public void registerObservers(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObservers(Observer o) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(o);
		if(index >= 0)
			observers.remove(index);
	}

	public void setArray(int[][] array){
		this.array = array;
	}
	public int[][] getArray(){
		return array;
	}
	public void setKind(int kind){
		this.kind = kind;
	}
	public int getKind(){
		return kind;
	}
	public int getVertical(){
		return vertical;
	}
	public void setVertical(int vertical){
	this.vertical= vertical;
	}
	public int getHorizontal(){
		return horizontal; 		
	}
	public void setHorizontal(int horizontal){
		this.horizontal = horizontal;
	}
}
