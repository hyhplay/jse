package comm04.array;

public class GugudanVO {
	public void calc(){ 
		int dan = 0, gob = 0;
		for (gob = 1; gob < 10; gob++) {
			for (dan = 2; dan < 6; dan++) {
				System.out.print(dan + "*" + gob + "=" + dan * gob + "\t");
				if (dan == 5) {
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n");
		for (gob = 1; gob < 10; gob++) {
			for (dan = 6; dan < 10; dan++) {
				System.out.print(dan + "*" + gob + "=" + dan * gob + "\t");
				if (dan == 9) {
					System.out.print("\n");
				}
			}
		}
	  }
}
