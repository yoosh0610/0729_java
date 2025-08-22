package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	// ☆☆☆☆X10
	// 변수(Variable)
	// 변수란 : 메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간

	// 변수의 특징

	// 1. 고유한 식별자를 가진다.
	// 2. 공간에 새로운 값을 대입해서 사용할 수 있다.
	// 3. 자료형이 정해져있다.
	// 4. 지역변수의 경우 메모리의 Stack영역에 올라간다.
	// 5. ***하나의 변수공간에는 하나의 값만 대입할수있다.***
	// 6. 초기화를 해야만 사용이 가능하다.
	// 7. 초기화는 한번만 가능하다.
	// 8. 자료형은 크기가 정해져있다.
	// 9. 자료형끼리의 변환이 가능하다.
	// 10. 선언된 Scope안에서만 사용이 가능하다.
	// 11. 변수끼리 연산도 가능하다.

	/*
	 * 배열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음 단, "같은 지료형의 값들"만 담을 수 있음 
	 * 동종모음(homogeneous collection)이라고도 함
	 * 
	 * 자바라는 *언어 자체에 내장된* "유일"한 자료구조 // 값(data)을 어떻게 저장할것인가에 대한 것
	 * 
	 * => 배열의 각 인덱스(index)에 실제 값이 담김 index는 '0'부터 시작한다.
	 */

	public void method1() {

		// 임의의 정수 5개를 선언하고 초기화를 진행해야지
		/*
		 * int num1 = 31; int num2 = 35; int num3 = 15; int num4 = 43; int num5 = 75;
		 * 
		 * int sum = num1 + num2 + num3 + num4 + num5;
		 * 
		 * for(int i= 1; i <= 5; i++) { num이라는 변수를 i번까지 선언 X sum += numi; }
		 * 
		 * System.out.println(sum);
		 */

		// 배열

		// 1. 배열 선언

		/*
		 * 변수 선언 방법
		 * 
		 * 자료형 변수식별자;
		 * 
		 * 배열선언 방법
		 * 
		 * 1) 자료형 배열시별자[]; 2) 자료형[] 배열식별자; ---> 요 방법을 사용할 것!!(다들 이걸 쓰기 때문)
		 */

		// 변수 선언!
		// int num;

		// 배열 선언!
		// int[] nums; // 배열식별자에 s 붙여서 복수형으로 사용

		// int[] nums = 0; // 자료형이 같지 않아서 사용X

		// 2. 배열 할당

		/*
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정 지정한 개수만큼 값이 들어갈 공간이 할당됨
		 * 
		 * [ 표현법 ]
		 * 
		 * int[] numbers; // 배열 선언 numbers = new int[5]; //할당
		 * 
		 * int[] arr = new int[5]; // 선언과 동시에 할당
		 * 
		 * 배열은 *참조 자료형*이다.(String과 같은) <- 주소값이 들어간다.
		 */

		// int [] nums = new int[2]; //배열 선언 및 할당

		// nums라는 정수형 배열을 선언하고 5칸 할당 받아보기
		int[] nums = new int[5];

		// 기본 자료형은 크기가 정해저 있지만 참조 자료형은 크기가 미지수([]안에 크기 지정)
		// 필요한 만큼 메모리 할당 받는것은 동적 할당

		// 3. 배열의 각 인덱스에 값 대입
		/*
		 * [ 표현법 ]
		 * 
		 * 배열식별자[인덱스(순서) 0부터 시작] = 값;
		 */

		nums[0] = 18;
		nums[1] = 61;
		nums[2] = 11;
		nums[3] = 13;
		nums[4] = 15;
		// 5칸 지정 받아서 (칸수-1)

		// System.out.println(nums); <-X 인덱스로 지정했으니 인덱스로 출력
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// 현시점에서 우리가 배열을 사용해서 얻을 수 있는 장점 : 반복문 사용 가능
	}

	public void methodA() {

		// 배열을 공부해보자

		// 1. 배열선언 및 할당

		int[] integers = new int[3]; // [0],[1],[2]
		double[] doubles = new double[2]; // [0],[1]
		// 기본 자료형 8개 다 사용 가능

		// 배열식별자.length : 배열의 크기(길이) => 정수
		System.out.println(integers.length);
		System.out.println(doubles.length);

		int i;

		// System.out.println(i); localvariable <-- 초기화를 진행하지 않으면 사용할수 없음
		i = 1;
		System.out.println(i);
		System.out.println(integers);
		System.out.println(integers[0]); // 값을 초기화 하지 않으면 0
		integers[0] = 1; // 배열 초기화 방법
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double => 변수 공간에 실제 값을
		 * 바로 담을 수 있음 : (지역)변수 참조 자료형 : boolean[], char[], byte[], ... String => 주소값을 담고
		 * 있는 변수 : 참조변수(레퍼런스)
		 */

		/*
		 * methodA 소환하면 메모리(RAM)에 stack영역에 methodA공간을 할당받음 배열같은 경우는 (stack영역 X) heap이라는
		 * 역역에 들어감 heap이라는 역역에 배열의 갯수([n])만큼 할당 원래 빈공간에 크기에 맞춰 만듬 배열의 경우는 크기에 맞춰 일렬로
		 * 만듬(주소가 정해짐) 배열 초기화 안하면 변수에 주소가 대입(변수의 값은 하나만 대입 가능하기 때문) 이것이 기본자료형과 참조자료형의 차이
		 * 배열에 값을 초기화 하기 위해서 인덱스까지 설정 후 대입 인트형 배열에는 기본적으로 0이 대입되어 있다.
		 */

		/*
		 * // 현실세계 // 인포, A강의장, B강의장, C강의장, 사무실 String[] KH정보교육원종로지원; //매소드 영역에 들어감(매소드
		 * 스코프에안에 설정되어서) KH정보교육원종로지원 = new String[5]; //왼쪽은 공간에 오른쪽은 값을 대입
		 * System.out.println("종로점 주소 : " + KH정보교육원종로지원); //변수명으로 대열의 주소값으로 이동
		 * 
		 * KH정보교육원종로지원[0] (변수명으로 대열의 주소값으로 이동) = "인포"; // 첫번째 공간에 값을 대입 KH정보교육원종로지원[1] =
		 * "A강의장"; // 두번째 공간에 값을 대입 KH정보교육원종로지원[2] = "B강의장"; // 세번째 공간에 값을 대입
		 * KH정보교육원종로지원[3] = "C강의장"; // 네번째 공간에 값을 대입 KH정보교육원종로지원[4] = "사무실"; // 다섯번째 공간에
		 * 값을 대입
		 * 
		 * // C강의장 출력 //System.out.println(KH정보교육원종로지원[3]); // 처음 공간주소에서 인덱스 n번째 공간까지 기입
		 * 
		 * // 전부 출력 System.out.println(KH정보교육원종로지원[0]);
		 * System.out.println(KH정보교육원종로지원[1]); System.out.println(KH정보교육원종로지원[2]);
		 * System.out.println(KH정보교육원종로지원[3]); System.out.println(KH정보교육원종로지원[4]); // 중복
		 * 중복 System.out.println("----- 반복문 -----"); for(int index = 0; index < 5;
		 * index++) { System.out.println(KH정보교육원종로지원[index]); }
		 */
		// stack은 밑에서 부터, heap은 위에서 부터 저장

		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2);

		int[] numbers1 = new int[3]; // 주소값이 대입
		int[] numbers2 = new int[3];
		System.out.println(numbers1 == numbers2); // 주소값이 같은지 비교

		// 참조자료형에서는 ==(동등비교 연산자) 사용시
		// 주소값을 비교하기 때문에 원하는 결과를 얻을 수 없음
		// 문자열.equals("비교할 문자열");

		// 해쉬코드 : 주소값을 10진수(int형태)형태로 나타낸 것
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
		// hashing(암호화의 한 종류) 해시값을 정수로 표현
	}

	public void lotto() {

		// 로또번호생성기 ver_0.2
		int[] lottoNumbers = new int[6]; // 0, 1, 2, 3, 4, 5
		/*
		 * lottoNumbers[0] = (int)(Math.random() * 45) + 1; lottoNumbers[1] =
		 * (int)(Math.random() * 45) + 1; lottoNumbers[2] = (int)(Math.random() * 45) +
		 * 1; lottoNumbers[3] = (int)(Math.random() * 45) + 1; lottoNumbers[4] =
		 * (int)(Math.random() * 45) + 1; lottoNumbers[5] = (int)(Math.random() * 45) +
		 * 1;
		 */
		// 중복 없애는 방법
		// 1. 중복되는 부분을 뺀다.
		// 2. 중복되지 않는 부분은 변수로 뺀다.
		// 감(빅데이터에 축척,경험)이 생기기 전에 풀어서 작성 후 중복 없애기
		// 배열에 들어가는 인덱스 => 요소(Elements)
		for (int i = 0; i < 6; i++) {
			lottoNumbers[i] = (int) (Math.random() * 45) + 1;
		}
		// Arrays.toString(배열식별자)
		System.out.println(Arrays.toString(lottoNumbers));
	}

	public void methodB() {

		// 5개의 요소를 담을 수 있는 String형 배열을 선언 및 할당하시오.
		// 동물 5총사

		// 1. 배열 선언 및 할당
		String[] animals = new String[5];

		// 2. 배열 인덱스에 동물 대입!
		animals[0] = "고양이";
		animals[1] = "사자";
		animals[2] = "강아지";
		animals[3] = "소";
		animals[4] = "돼지";
		// animals[5] = "토끼"; <-- 문법적으로는 문제가 없음 (사람이 하는 일이라 실수 할 수도 있음)

		// 콘솔창에 오류 뜨는것 (Stack Trace)
		// ArrayIndexOutOfBounds
		// 배열의 인덱스가 범위를 벗어남
		// at com.kh.array.Array.methodB(Array.java:260)
		// at com.kh.array.Run.main(Run.java:11)

		// 코드를 작성할때 생각을 많이 해야 함
		// 바이브코드(AI로 돌린) 기술부채(빌린 기술) => 이후 고칠수가 없음(몰라서)

		// 생각 안해도 괜찮은 것

		// 1. ;
		// 2. 어? 조건이다 => if
		// 3. 어? 합계다 => sum
	}

	public void methodC() {

		// 사용자에게 세 개의 정수를 입력받아서 입력받은 정수 중 최소값 구하기
		// 배열하려면 선언하고 할당해야

		// 현 시점에서 배열을 선택할 때의 기준
		// 1. 두개 이상의 같은 자료형의 값을 다룰 것
		// 2. 다룰 값의 개수가 명확하게 정해져 있을 것

		// 1) 사용자로부터 값을 입력받아서 배열의 각 인덱스에 대입
		Scanner sc = new Scanner(System.in); // 입력도구
		int[] nums = new int[3]; // 저장소

		// 배열은 물리적인 구조와 논리적인 구조가 동일하다.
		/*
		 * System.out.print("첫 번째 정수를 입력해주세요 > "); nums[0] = sc.nextInt();
		 * System.out.println("nums라는 배열의 0번째 인덱스에 대입된 값 : " + nums[0]);
		 * 
		 * System.out.print("두 번째 정수를 입력해 주세요 > "); nums[1] = sc.nextInt();
		 * System.out.println("nums라는 배열의 1번째 인덱스에 대입된 값 : " + nums[1]);
		 * 
		 * System.out.print("세 번째 정수를 입력해주세요 > "); nums[2] = sc.nextInt();
		 * System.out.println("nums라는 배열의 2번째 인덱스에 대입된 값 : " + nums[2]);
		 */
		for (int i = 0; i < 3 /* nums.length */; i++) {
			System.out.print("정수를 입력해주세요 > ");
			nums[i] = sc.nextInt();
			// System.out.println("nums라는 배열의 " + i + "번째 인덱스 값 : " + nums[i]);
		}
		System.out.println(Arrays.toString(nums));

		// 2. 해당 배열의 요소 중 가장 작은값 == 최소값을 출력하는 것이 목적

		int min = nums[0];
		/*
		 * if(min > nums[1]) { min = nums[1]; } if(min > nums[2]) { min = nums[2]; }
		 */ // ↓초기값 첫번째는 본인 자신이기 때문에 0이 아닌 1
		for (int i = 1; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("배열의 요소 중 가장 작은 값 : " + min);
	}

	public void methodD() {
		/*
		 * 한 번 할당받은 배열의 크기를 변경할 수 없음!
		 */ // ↓배열의 크기부분(변경X)
		String[] name = new String[3];

		name[0] = "유";
		name[1] = "성";
		name[2] = "현";
		System.out.println(Arrays.toString(name));
		name[2] = "찬";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());

		name = new String[4];
		name[3] = "굳";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());
		/*
		 * ???? hashCode()는 전제조건이 존재 hashCode()는 똑같은 행의 결과값은 같다.
		 */
		// 자바는 3세대로 구분
		// 1세대 - 초창기는 컴퓨터언어(이진수) -> 천공카드 사용
		// 2세대 - 기계어 어셈블리어(추상화)
		// 3세대 언어 : 현시대 주류언어(고급언어) <- 자바가 포함(C언어, 자바 등등)
		// 프로그램 언어(컴퓨터를 동작시키기 위한 언어)를 사용 (어려워짐)
		// 자바는 하드웨어나 운영체제에 존속되지 않는다.
		// JVM(자바가 만든 가상의 컴퓨터)가 호출을 받아 동작시킴 - 운영체제에 맞게 동작

		// R.C(레퍼런스 카운트,자신을 누군가 가르치는 수)는 1 -> 사라지지 않는다. 0이 되면 사라짐.
		// G.C(가비지 컬럭터) 아무도 가리키지 않는 자료를 삭제시킴.
		// ==> 자바의 특성중인 하나인 자동 메모리 관리
		// 자바가 주류 언어로 쓰이는 이유 중 하나
		// 안좋은 점 - G.C가 언제 작동될지 모름(개발자가 작동시킬수 없음) 규모가 크면 단점이 됨

		/*
		 * 연결이 끊긴 기존의 배열은 일정 시간이 지나면 G.C가 알아서 삭제해 준다. : 자동 메모리 관리 => 기존 참조하고 있던 연결이 끊기고
		 * 새로운 배열을 참조함 null값을 이용함
		 */

		// null : 아무것도 존재하지 않음을 의미하는 값
		// 빈 영역에 값이 없을수 없음. 무슨 값이든 들어가야함

		/*
		 * 기본값
		 * 
		 * 정수 = 0 실수 = 0.0 문자 = ' '
		 * 
		 * 참조자료형
		 * 
		 * 참조자료형에는 null이라는 잢이 들어가는데 주소값이 존재하는가 그렇지 않은가 구분 (참조값이 없음) NullPointer : null을
		 * 가리키는 것
		 */

		name = null; // 현재 연결고리를 끊고싶다.
		System.out.println(name);
		name[0] = "홍길동";
		// 가리키고 있는 대상이 null인데 주소가 없는데 어디 접근함??
	}

	public void methodE() {

		// 그래서 배열 어따씀?
		// 두개 이상의 같은 자료형의 값을 다룰때
		// 다룰 값의 개수가 명확하게 정해져 있을 때

		// 그래서 배열 보통 어케씀?
		int[] arr = new int[3]; // 0, 1, 2
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(Arrays.toString(arr));
		// 이렇게 잘 안씀

		// 배열 보통 선언과 동시에 요소를 대입해서 사용하곤 함
		int[] arr1 = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = { 100, 200, 300 };
		System.out.println(Arrays.toString(arr2));
		// 왜? -> 귀찮으니까(유동성,생상성)
	}

	/*
	 * 배열 복사
	 * 
	 * 1. 얕은 복사 ☆★☆★
	 * 
	 * 2. 깊은 복사
	 */
	// 1. 얕은 복사
	public void methodF() {
		// 얘가 중요함
		int[] origin = { 1, 2, 3, 4, 5 };
		// new int[5];
		// origin[0] = 1; origin[1] =2; ....
		System.out.println(Arrays.toString(origin));

		int[] copy = origin;
		System.out.println(Arrays.toString(copy));

		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		// stack영역에 copy라는 공간이 생겨 주소값을 대입(원본과 같은 주소값)
		// 원본 결과값이 바뀌면 주소값을 공유함으로 copy의 결과값도 바뀜

		// 얕은 복사 => 주소값을 대입하는 것 이기 때문에 가리키고 있는 대상이 같다.
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}

	// 2. 깊은 복사
	public void methodG() {

		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = new int[6];
		/*
		 * copy[0] = origin[0]; copy[1] = origin[1]; copy[2] = origin[2]; copy[3] =
		 * origin[3]; copy[4] = origin[4];
		 */
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}

		/*
		 * 배열의 깊은 복사의 경우 기본 배열의 크기보다 큰 배열로 복사하는 경우가 많음
		 */

		System.out.println(Arrays.toString(copy));
		
		int [] copy2 = new int[10];
		
		System.arraycopy(origin, 0, copy2, 0, 5);
		System.out.println(Arrays.toString(copy2));
		/*
		 * 네이밍컨벤션 == 첫 글자가 대문자 ==> 클래스 / 인터페이스
		 * arraycopy() ==> System클래스
		 * 
		 * System.arraycopy(원본 배열 식별자, 원본배열에서 복사를 시작할 인덱스,
		 * 					복사본 배열 식별자, 복사본 배열에서 복사가 시작될 인덱스,
		 * 					복사할 개수);
		 */
		// alt + ↑, ↓ (행 이동)
		// ctrl + alt + ↑, ↓ (행 복사)
		// ctrl + D (행 삭제)
		// ctrl + / (행 주석처리)
		// ctrl + shift + F (코드정리)
		
		// Arrays클래스에서 제공하는 copyOf()
		System.out.println(Arrays.toString(origin));
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		System.out.println(Arrays.toString(copy3));
		
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
		
		
	}

}
