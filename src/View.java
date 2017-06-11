import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements Observer,ActionListener{
	ModelInterface model;
	ControllerInterface controller;
	public View(ControllerInterface controller,ModelInterface model){
		this.model = model;
		this.controller = controller;
		model.registerObservers(this);
	}
	/*
	 * 在这里创建所有的Swing组件
	 */
	public void creatView(){
		
	}
	/*
	 * 在这里实现所有控制。
	 */
	public void creatControls(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
