package BoundedWildcards;

public class BoundedWildcard {
	
	
	static  void showxy(Coords<?> c){
		System.out.println(" X Y coordinates :");
		for (int i = 0; i < c.obj.length; i++) {
			
			System.out.println(c.obj[i].x + ""+c.obj[i].y);
		}
	}
	
	
	static  void showxyz(Coords<? extends ThreeD> c){
		System.out.println(" X Y coordinates :");
		for (int i = 0; i < c.obj.length; i++) {
			
			System.out.println(c.obj[i].x +" "+c.obj[i].y+" "+c.obj[i].z);

		}
	}
	
	static  void showall(Coords<? extends FourD> c){
		System.out.println(" X Y coordinates :");
		for (int i = 0; i < c.obj.length; i++) {
			System.out.println(c.obj[i].x+ " "+c.obj[i].y +" "+c.obj[i].z+ " "+c.obj[i].t);
		}
	}

}
