
public interface ModelInterface {
	
	public void initilize();
	
	public void notifyObservers();
	public void registerObservers(Observer o);
	public void removeObservers(Observer o);
	
}
