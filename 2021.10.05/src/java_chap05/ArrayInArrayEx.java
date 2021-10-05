package java_chap05;

public class ArrayInArrayEx {

	public static void main(String[] args) {
//		2차원 배열 선언 방식
//		console창 보면 
//		mathScores[0][0] = 0, mathScores[0][1] = 0 이렇게 나와있는데 [2][3]이걸 10의자리까지 나타내준걸로 생각하면 쉬움 [3]는 1의자리까지 나누어 준거
		int[][] mathScores = new int[2][3];
		
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
		
		System.out.println();
		
//		2차원 배열 선언 방식
//		외부 배열의 크기는 2로 고정, 내부 배열의 크기는 모름
		int[][] englishScores = new int[2][];
		
//		외부 배열의 0번 인덱스에 요소로 새 1차원 배열 선언(배열의 크기는 2로 선언)
		englishScores[0] = new int[2];
		
//		외부 배열의 1번 인덱스에 요소로 새 1차원 배열 선언 (배열의 크기는 3으로 선언)
		englishScores[1] = new int[3];
		
//		2차원 배열의 각 요소의 크기가 다른 이유는 결국 외부 배열의 요소는 1차원 배열이고, 배열은 참조 타입의 변수
//		참조 타입 변수는 결국 힙 메모리 영역의 주소를 저장하고 있으므로 2차원 배열의 요소로 힙 메모리 영역의 주호가 저장되는 형태임
		
//		외부 배열의 크기는 2
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("engleshScores[" + i + "] = " + englishScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = { {95, 80} , {92, 96, 80} };
		
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("englishScores[" + i + "] = " + javaScores[i][j]);
			}
		}
		
	}

}
