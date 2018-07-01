package BoundedWildcards;

public class Main {

	public static void main(String[] args) {
		
		
		TwoD  twoD[]={
				new TwoD(0, 0),
				new TwoD(7, 9),
				new TwoD(18, 4),
				new TwoD(-1, -23),
				};
		Coords<TwoD> tdlocs=new Coords<>(twoD);
		
		System.out.println("contents of tdloc");
		
		BoundedWildcard.showxy(tdlocs);
		//BoundedWildcard.showxyz(tdlocs); //not a threeD
		//BoundedWildcard.showall(tdlocs); //not a fourDD


		
		FourD  fourD[]={
				new FourD(0, 0,0,0),
				new FourD(7, 9,5,8),
				new FourD(18, 4,4,2),
				new FourD(-1, -23,6,9),
				};
		Coords<FourD> tdlocs1=new Coords<>(fourD);
		
		System.out.println("contents of tdloc");
		
		BoundedWildcard.showxy(tdlocs1);
		BoundedWildcard.showxyz(tdlocs1);

		BoundedWildcard.showall(tdlocs1);

		
	}

}
