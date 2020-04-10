
public class iter2 {

	public static void main(String[] args) {
		
		//image1.png , image2.png , image5.png 을 번갈아가면서 4번 출력
		//총  12번 반복되니까 12
		//3가지 니까 %3
		//
		
				//출발점
				int idx = 0;
				//종료점
				while(idx < 12){
					System.out.println("image" + ( idx%3 ) + "png");
					
				    idx = idx + 1;
				}
		

	}

}
