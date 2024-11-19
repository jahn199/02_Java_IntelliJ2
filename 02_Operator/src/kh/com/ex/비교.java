public 비교 {

    /*
    .equals()
    String으로 비교한 문자열의 내용(값)이 같은지 비교하는 기능
    문자열의 값이 동일하면 true 반환

    ==
    두 객체가 같은 메모리 주소를 참조하고 있는지 비교
    두 문자열 객체가 같은 메모리에 저장되어 있지 않다면
    값이 같더라도 false를 반환할 수 있음

    택배상자 택배내용물

    값(Value) : 문자열의 실제 내용
              택배 상자 안에 들어 있는 진짜 물건
              예를 들어 "안녕" 문자열은 택배 상자 안의 편지 우리가 찾는 물건

         메모리(Memory Address) : 객체의 위치
              택배 상자가 놓여 있는 집 주소
              우리가 변수에 값을 저장하면 컴퓨터는 그 값을 메모리에 저장하고,
              저장된 위치를 기억

    ==과 .equals()의 차이
    ==는 택배상자(메모리 주소)를 비교
         두 변수가 가리키고 있는 메모리 주소가 같으면 true
         *같은 상자* 가리키고 있는지 확인

         .equals()는 두 변수의 실제 값이 같은지를 확인
                 * 상자 안에 든 물건이 같은가 *

                 **객체 : 어떤 물체

    .equalsIgnoreCase()
    대소문자를 구분하지 않고 문자열을 비교하는 메서드
    사용 예제 : 사용자가 yes, YES, YeS를 입력해도 동일하게 처리할 때 사용

    String a = "Hello";
    String b = "hello";

    //대소문자 구분없이 문자열이 일치하는지를 비교하는 것
    a.equalsIgnoreCase(b); //true
    b.equalsIgnoreCase("hi"); //false

    .equals() .equalsIgnoreCase() 차이
    .equals() = 문자열 내용이 대소문자까지 정확히 일치해야함
                 아이디 비밀번호 확인할 때 사용
    .equalsIgnoreCase() = 문자열 내용이 대소문자 구분 없이 일치로 간주
                          일정한 응답표기를 각자 다른 표현으로 진행할 때
     */
}