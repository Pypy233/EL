
public class Controller implements ControllerInterface {
	Model model;
	View view;
	public Controller(Model model){
		this.model=model;
		view = new View(this,model);
		view.creatView();
		view.creatControls();
		model.initilize();
		check();
	}
	
	public void check(){
		int horizontalSame =0;
		int verticalSame =  0;
		int templeX = 0;
		int templeY = 0;
	  for(int i = model.getVertical() - 1 ; i >= 0;i--){
		  for(int j = 0; j < model.getHorizontal()-1; j++){
			  templeX = i ;
			  templeY = j;
			  // 检查竖直方向 自下而上
			  while(templeY<model.getHorizontal()-2){
				  if(model.getArray()[i][templeY]==model.getArray()[i][templeY+1]){
					  horizontalSame++;
				  }else{
					  break;
				  }
				  templeY++;
			  }
			  //检查水平方向 自上而下
			  while(templeX>0){
				  if(model.getArray()[templeX][j]==model.getArray()[templeX-1][j])
				  verticalSame++;
				  else{
					  break;
				 }
				  templeX--;
			  }
			  if(horizontalSame>=3){
				  removeHorizontally(i, j, horizontalSame);
				  i = i < model.getVertical()-2? i+2:model.getVertical()-1;
				  j = 0;
			  }
			  if(verticalSame>=3){
				  removeVertically(i, j, verticalSame);
				  i = i < model.getVertical()-2? i+2 : model.getVertical()-1;
				  j = 0;
			  }
			  verticalSame=0;
			  horizontalSame=0;
		  }
		  
	  }
	}
	public void removeVertically(int x,int y,int verticalSame){
		for(int i = 0 ; i < verticalSame;i++){
		model.getArray()[x-1-i][y]= 
		x-verticalSame-i >=0 ? model.getArray()[x-verticalSame-i][y] :(int)(Math.random()*model.getKind()+1) ;
		}
	}
	public void removeHorizontally(int x,int y, int horizontalSame){
		for(int i = x ; i >= 0 ; i --)
		for(int j = 0 ; j < horizontalSame ; j++){
			model.getArray()[i][j] = model.getArray()[i-1][j];
		}
		for(int j = 0 ; j < horizontalSame ; j++){
			model.getArray()[0][j] = (int)(Math.random()*model.getKind()+1);
		}
	}
	 
	public void moveRight(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUp(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upset() {
		// TODO Auto-generated method stub
		
	}

}
