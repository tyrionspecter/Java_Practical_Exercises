
public class Pe2_1_power4 {
	
	public Pe2_1_power4(int y) {
		
		int n;
		float x=y;
		while(1>0) {
			if(x==1) {
				n=0;
				break;
			}
			else if(x<1) {
				n=1;
				break;
			}
			else {
				x=x/4;
			}
		}
		if(n==0)
			System.out.println("yes it is a power of 4");
		else
			System.out.println("No it is not a power of 4");
		
		
	}

}
