package api01.lang.string;
/*
 * endWith("s") : s로 끝나는 지를 체크
 */
public class EndWithDemo {
		public static void main(String[] args) {
			System.out.println(
					"Hell.txt".endsWith("txt") ? 
							"txt 파일입니다.": "txt 파일이 아닙니다."
					);
			
			
		}
}