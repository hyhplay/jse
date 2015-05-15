package comm04.array;

public class No04_MultiDimArrayDemo {
		public static void main(String[] args) {
			String[][] names = {
					{"Mr.","Ms.","Mrs."},
					{"Smith","Johns","Alex"}};
			
			System.out.println(names[0][0] + names[1][0]); //Mr.Smith.
			System.out.println(names[0][2] + names[1][2]); //Mrs.Alex.
		}
}