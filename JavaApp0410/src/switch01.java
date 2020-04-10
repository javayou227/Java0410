
public class switch01 {

	public static void main(String[] args) {

		final String KOREA = "1";
		final String CHINA = "2";
		final String JAPAN = "3";
		// 키보드 입력 개체 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("메뉴 입력(1-한식 , 2-중식 , 3-일식) : ");
		// 메뉴 입력받기
		String menu = sc.nextLine();

		switch (menu) {
		case KOREA:
			System.out.println("한식");
			break;
		case CHINA:
			System.out.println("중식");
			break;
		case JAPAN:
			System.out.println("일식");
			break;
		default:
			System.out.println("메뉴를 정확히 입력하시오.");
		}

		sc.close();

	}

}
