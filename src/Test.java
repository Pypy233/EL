
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		ControllerInterface controller  = new Controller(model);
         int[][] array = model.getArray();
         for(int i = 0 ; i < 8 ; i++)
        	 for(int j = 0 ; j < 8 ; j++){
        		array[i][j] =(int) (Math.random()*5+1);
        	 }
         for(int i = 0 ; i < 8 ; i++){
        	 for(int j = 0 ; j < 8 ; j++){
        	  System.out.print(array[i][j]+" ");	 
        	 }
        	 System.out.println();
         }
	}

}
