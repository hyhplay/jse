package api02.util.vector;

import java.util.Arrays;
import java.util.Vector;

/*
 * java.util.Arrays 의 메소드인
 * sort() 는 오름차순 정렬에 특화되었다.
 */
public class SortDemo {
	public static void main(String[] args) {
		
	}
}
class ArraysDemo{
	// Integer는 int 형외 Wrapper Class입니다.
	// 즉 기본형인 int 를 객체화 시킨 겁니다.
	// 벡터는 기본형을 담을 수 없기 때문에 int 형을
	// 담을 경우가 생기면 이처럼 wraper class 를 사용합니다.
	Vector<Integer> vec = new Vector<Integer>();
	
	public Vector<Integer> getAscSort1(int[] arr){
		/*
		 * 아래 로직은 오름차순 정렬 알고리즘인
		 * 스왑알고리즘입니다.
		 * 바깥쪽 for 문의 limit이 arr.length-1 인 것에 
		 * 주의하세요
		 */
		
		for(int i = 0;i<arr.length; i++){
			for(int j=0; j<arr.length;j++){
				if(arr[j]>arr[j+1]){
					int temp;
					temp = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		/*
		 * 아래 for문은 확장된  for문이라고 합니다.
		 * 인덱스를 디테일하게 정하지 않고
		 * 전체를 처리하는 경우는 일일이 시작과 limit 인덱스값을 
		 * 정하지 않고 아래 처럼 처리합니다.
		 */
		for(int k : arr){
			vec.add(k);
		}
		return vec;
	}
	public Vector<Integer> getAscSort2(int[] arr){
		Arrays.sort(arr);
		/*
		 * 위 쪽 스왑알고리즘을 단 한줄 sort()로 정리해버림.
		 */
		for(int k : arr){
			vec.add(k);
		}
		return vec;
	}
}