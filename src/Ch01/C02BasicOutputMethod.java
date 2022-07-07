package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		//System.out : 표준 출력 스트림(해석 : 표준출력장치(모니터)에 데이터 전달)
		
		//System.out.print() : 콘솔화면에 내용 출력
		//escape문자 사용을 통한 개행(줄바꿈)
		//escape : 탈출하다, 벗어나다
		//escape문자 : 기존의 문자용도를 벗어나 특정한 기능 수행에 사용되는 문자
		//\n : 줄바꿈(개행)
		//\t : tab 8칸 커서 이동
//		System.out.print("     *  \n");
//		System.out.print("    ***  \n");
//		System.out.print("   *****  \n");
//		System.out.print("  *******  \n");
		
		//System.out.pintf()
		//format : 형식,서식
		//서식 : 서류를 꾸미는 일정한 양식
		//%d  : 10진 정수 서식문자
		//%f : 실수 서식문자
		//%c : 한문자 서식문자
		//%s : 문자열 서식문자
//		System.out.printf("%d\n", 100);
//		System.out.printf("%d + %d = %d\n", 10,20,10+20);
//		System.out.printf("%c %c %c\n", 'A','B','C');
//		System.out.printf("%s %s %s\n","This is","String","Test");
//		System.out.printf("%d.%s : %d\n",1,"성적",100);
//		System.out.printf("성적 : %f\n",54.2);
//
//		System.out.printf("나의 이름은 %s입니다.\n", "김승은");
//		System.out.printf("나의 나이는 %d세 입니다.\n", 23);
//		System.out.printf("나의 성별은 %c입니다.\n", '여');
		
		//서식문자 정렬/자리수지정
		//%10d : 10칸 확보후 오른쪽정렬
		//%-10d : 10칸 확보후 왼쪽정렬
//		System.out.printf("%-10d%d\n",1234,5678);
//		System.out.printf("%f\n", 10.123456);
//		
//		//주의!
//		System.out.print("I say \"Hello?\"");
		
		//System.out.println()
		System.out.printf("%-10s %-10s %-10s %-10s \n","No","이름","나이","주소");
		System.out.printf("%-10d %-10s %-10d %-10s \n",1,"홍길동",20,"대구");
		System.out.printf("%-10d %-10s %-10d %-10s \n",2,"남길동",30,"서울");
		System.out.printf("%-10d %-10s %-10d %-10s \n",3,"서길동",40,"울산");
		System.out.printf("%-10d %-10s %-10d %-10s \n",4,"동길동",50,"김해");
	
		System.out.printf("%-10s %-10s %-10s %-10s \n","Code","Title","Publisher","Price");
		System.out.printf("%-10d %-10s %-10s %-10d \n",1010,"DoItJava","00미디어",29000);
		System.out.printf("%-10d %-10s %-10s %-10d \n",2020,"윤성우C","오렌지미디어",25000);
		
		System.out.print("     *  \n");
		System.out.print("    ***  \n");
		System.out.print("   *****  \n");
		System.out.print("  *******  \n");
		System.out.print("   *****  \n");
		System.out.print("    ***  \n");
		System.out.print("     *  \n");
		
	}

}
