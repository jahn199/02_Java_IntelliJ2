package com.kh;
/*
 * package = 자바 파일이 작성된 폴더들을 나열해놓은 이름
 * 폴더명을 작성할 경우 .은 폴더 안에 폴더로 들어간다는 의미이기 때문에
 * com c.o.m .으로 구분지어서 작성 X
 * c.o.m -> c라는 폴더 안에 o라는 폴더 안에 m 이라는 폴더에 만들겠다는 표기
 * */
public class VariableEx1 {

	public static void main(String[] args) {
		// 변수 : 메모리에 값을 저장하기 위한 공간 (JS = let, var)
		// 			저장되는 값이 변할 수 있기 때문에 변수라는 명을 사용
		// 프로젝트 하나하는데 왜이렇게 변수가 많은지.. 와 같은 변수

		// 자료형(data type)
		// - 변수 또는 값의 크기와 형식

		/* ***** 자바 기본 자료형(Java Primitive Types) *****
		 * Primitive = 가장 기초적인
		 * Java Primitive Types = 자바에서 기본으로 제공하는 타입
		 *
		 * [논리형] - 맞는지 틀린지 유무
		 * boolean (1byte) - true / false *기본값 false*
		 *
		 * [정수형] - 숫자
		 * byte	   (1byte)     숫자뒤에 b  B
		 * short   (2byte)     숫자뒤에 sh
		 * int     (4byte)     *정수 기본형태 제일 많이 사용*
		 * long    (8byte)     숫자뒤에 L  l
		 *
		 * [실수형] - 숫자뒤에 소수점으로 실수 표현 가능
		 * float   (4byte)    숫자 뒤에 f 를 붙여줘야함
		 * double  (8byte)     *실수 기본형태*
		 *
		 * [문자형] - 문자로된 형태
		 * char    (2byte)    문자 하나, 문자 양옆에 '' 붙여줌
		 * */

		/* ***** 기본 자료형이 아닌 자바에서 제공하는 객체 *****
		 * [참조형]
		 * String  -문자열로된 형태
		 * 			메모리 길이 측정 X
		 * 			저장하는 변수는 객체 대신 주소를 저장하기 때문에 참조형으로 불림
		 * 			표기법 문자들 양 옆에 "" 붙여줌
		 * */

		// 변수 선언 : 메모리에 공간을 할당하기 위해 선언
		// 보라색으로 바뀌는 단어는 예약어
		boolean 진실혹은거짓 = true; // 진실혹은거짓이라는 변수명 1byte true가 저장
		System.out.println("진실 혹은 거짓은 =>" + 진실혹은거짓);

		double 실수1번;  //메모리에 double 저장 공간 8byte 할당하고
		// 그 공간을 실수1번 으로 부르겠다.

		// 값 대입 : 변수에 값을 집어넣는 것
		//			이미 값이 있는 변수에 대입하면 -> 덮어쓰기가 된 것
		진실혹은거짓 = false;

		String 문자열1번 = "만들어진 객체로 예약어처럼 많이 사용";
		String 문자열2번 = "필수로 맨 앞 S는 대문자 표기 보라색으로 글자색 변화 x";

		System.out.println("변수명에 노란색 밑줄은 변수명을 선언하고 "
				+ " 아래에서 사용하지 않은 변수명이라는 표기");

		/*
		 * boolean이나 char String 단독으로
		 * 예약어가 존재하기 때문에 상관없음
		 *
		 * 예약어(자료형,참조형)  변수명 = 리터럴;
		 * [정수형]
		 * 정수형 기본적으로 리터럴이 int로 설정
		 * int(4byte) 안에서 int 보다 byte 크기가 작은 short나 byte로 리터럴 변경할 경우
		 * 자동으로 타입 변환이 일어나고, 값이 해당 타입의 범위를 초과하면 오류가 발생
		 *
		 * 예 )
		 * byte -128 ~ 127
		 *
		 * byte  변수명   = int
		 * byte 바이트1번 = 123; //가능
		 * byte 바이트2번 = 1234; //불가능 강제형변환을 사용하면 가능
		 *
		 * long    변수명 = int
		 * long    롱1번 = 10000000000; //불가능 강제형변환을 사용하면 가능
		 * int는 위에서 작성한 숫자 범위를 초과하기 때문에 초과하는 숫자를 담기 위해서는 뒤에 L이나 l을 붙여줘야함
		 *
		 * long    변수명 = long
		 * long    롱2번 = 10000000000L; //long 사용 long 리터럴은 L 필수로 뒤에 와야함
		 *
		 *
		 * [실수형]
		 * 실수형 리터럴 기본적으로 double 타입으로 설정됨
		 * 왜냐하면 float은 대략 소수점아래 7번째자리까지만 표기 가능
		 *
		 * 나머지 8자리부터 버리기 때문에 안전하게 가져올 수 있도록 double 기본으로 사용
		 * 소수점아래 소수들을 나타낼 때 8자리 이상이 아닌 경우
		 * 숫자 뒤에 f를 붙여서 절반공간의 크기만 사용하겠다 표기
		 *
		 * 자료형   변수명 = 리터럴
		 * double  변수명 = double
		 * double 더블1번 = 3.14;
		 *
		 * float  플롯1번 = 3.14F;// 대소문자 상관없이 f를 붙여줌
		 * 플롯1번의 공간의 크기를 float으로 주고 실수 뒤에 f를 붙여주지 않으면
		 * 실수는 기본리터럴 형인 double로 인식이 되어
		 * 공간보다 큰 메모리가 온다고 컴퓨터는 인식을 하고 오류를 발생하기 때문에
		 * 앞에 예약어를 float으로 작성했다면 소수 뒤에에는 f를 붙여주는 것
		 *
		 * L이나 f같은 리터럴 표기법은
		 * 컴퓨터가 자료형을 구분하기 위한 기호일뿐
		 * 출력시 보여지지 않는다.
		 *
		 */

		char 문자1번 = '가'; //숫자로 44032 이름으로 저장
		char 문자2번 = 'a'; //숫자로     97 이름으로 저장
		//char 문자3번 = "A"; char 문자에는 반드시 '' 감싸기!

		float 소수1번 = 3.14f;//Type mismatch: cannot convert from double to float
		System.out.println(문자1번 + 문자2번 + 소수1번);
		// 44032 + 97 + 3.14 = 44132.14 (모두 더한 값이 출력)
		System.out.println(문자1번);
		System.out.println(문자2번);
		System.out.println(소수1번);
	}

}








