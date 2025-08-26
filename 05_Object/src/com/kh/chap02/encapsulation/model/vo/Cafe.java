package com.kh.chap02.encapsulation.model.vo;

// VO(Value Object)X
// 필드부, 생성자부, 메소드부
public class Cafe {

	// 필드(Field)부
	/*
	 * 객체가 가질 수 있는 속성
	 * 
	 * 정보(Data)를 담는 부분
	 * 
	 * 필드 == 맴버변수
	 * 
	 * 접근제한자 자료형 필드식별자;
	 */
	private String name;
	private String address;
	private int signatureMenuPrice;

	// 생성자(Constructor)부
	// 메서드(Method)부
	/*
	 * 기능(method)를 구현하는 부분(대상의 기능들) VO는 값과 관련된 메서드가 들어가야 함 
	 * 접근제한자 (예약어(static 있을수도 있고 없을수도 있고)) 
	 * 반황형 메소드식별자(매개변수(파라미트)) { 메소드 호출 시 실행할코드; }
	 * 
	 * 접근제한자 : 호출할 수 있는 범위를 제한할 수 있음 
	 * 반환형 : void => return 할 때 돌려줄 값이 없음 반환 시 결과 값의 자료형을 명시해준다. 
	 * 매개변수 : 메소드 호출 시 전달 값을 받아주는 변수 메소드 범위에서만 사용 가능. 생략 가능
	 */

	public void open() {
		dishWash();
		cleanig();
		windowCleanig();
	}

	private void dishWash() {
		System.out.println("깨끗하게 빡빡!!");
	}

	private void cleanig() {
		System.out.println("청소도 빡빡!!");
	}

	private void windowCleanig() {
		System.out.println("유리도 빡빡!!");
	}
	// 묶어 놓으면(캡슐화) 유지보수때 아작, 보안적으로 허술
	// 외부에서 와서 변경할수도

	// 캡슐화
	// 접근제한자(public)를 private으로 수정
	// private 외부에서는 접근X
	// 내부의 오류를 외부에서 알수 없음
	// 내부에 생성되면 외부에서 작업을 해줘야 하는데 캡슐화하면 내부에서만 생성 가능
	// 외부에 노출하는게 최대한 적을수록 좋다

	// 데이터를 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * DTO(데이터 오브젝트) -> setter를 만들어 줌 VO -> 일반적으로 Setter메소드를 구현하지 않음
	 * 
	 * DTO는 2달뒤에 배울건데 DTO학습 전까지만 VO클래스에 setter를 구현해서 사용
	 * 
	 * setter만들기 규칙
	 * 
	 * 1. setter메소드는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public을 이용 
	 * 2. set필드명으로 식별자를 작성하며 낙타봉표기법(CamelCase)을 꼭 지키도록 한다
	 * 3. (예외사항) 우리는 당분간 항상 모든 필드에 대해서 setter를 구현합니다
	 */

	// 고유메뉴의 가격정보를 기록 및 수정할 수 있는 메소드
	// signaturePrice // 매개변수
	public void setSignatureMenuPrice(int signatureMenuPrice) {
		// 매개변수 이름은 똑같이 써준다
		// System.out.println("setter에서 전달받은 정수 값 : " + signaturePrice);

		signatureMenuPrice = signatureMenuPrice;
		// 메소드가 호출되면서 stick에 공간이 형성되면서 자신의 영역에 값을 저장
		// 자기 자신이 생겨난 heap영역의 주소를 알아야 대입할수있다.
		// Scope안에서는 해당 영역안에 있는 지역변수에 대한 우선권이 있음
		// System.out.println("내주소가 뭐지 ? > " + this);
		// this : 해당 객체의 주소값을 가리키는 역활
		// this로 주소를 가지고 참조연산자로 접근해서 대입

		if (signatureMenuPrice <= 1000) {
			System.out.println("정상적이지 않은 값을 입력하셨습니다. 1000 이상의 정수를 입력하세요.");
		} else {
			this.signatureMenuPrice = signatureMenuPrice;
		}
	} // 컨테이너 - 객체(속성,기능)들을 담아두는 표현

	// name필드를 기록 및 수정할수 있는 메소드
	// 접근해야하니 public, 보여주는 반환타입 void, set+변수명, (값을 받을 자료형 변수명) {}
	// 전달받은 값을 클레스가 가진 필드에 대입
	// 주소값에 대입해야 하니 this
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	/*
	 * 관례 위반 두 개 이상의 필드값을 변경하는 메소드는 set을 붙이면 XXX* public void setNameAddress(String
	 * name, String address) { setName(name) setAddress(address) } // 얘는 setter가
	 * 아님(코드는 돌아감) set으로 시작하면 안됨 set은 하나의 필드값을 변경해야 한다.
	 */
	/*
	 * 규칙!
	 * 
	 * 1. getter()는 접근제한자 public을 사용한다. 2. get필드명으로 짓 되, 낙타표기법(camelCase)를 사용한다. 3.
	 * 모든 필드에 대해서 반드시 무조건 꼭 다 절대로 만들어주세요!!
	 */

	// 메소드를 호출한 곳으로 name필드값을 돌려주고 싶음

	// 직접접근을 막은 메소드를 가저오는 것은 getter
	// 데이터를 반환해주는 기능 : getter
	public /* void */String getName() {
		return name;// (다시 돌아가고 싶은 건 return, 변수명;)
		// return는 void호환 안됨, 변수명의 자료값으로 대입
		// 출력문을 대입해야 출력(값만 받은 상태)
	}

	// 주소지를 반환해주는 메소드
	public String getAddress() {
		return address;
		// return value;
		// value를 메소드 호출부분으로 반환하겠다
		// 메소드의 반환형과 반환하고자 하는 값의 자료형이 일치하는가를 꼭 잘 확인해야함!
	}

	public int getSignatureMenuPrice() {
		return signatureMenuPrice;
	}

	// getter() / setter() 다만들었다 ==> 캡슐화가 끝남(문법적인 관례)
	/*
	 * 1. 값을 숨긴다 => 필드의 접근제한자를 public대신 private으로 선언한다. 2. 메소드를 통해 필드에 접근할 수 있도록
	 * 만들어준다 => getter() / setter() 구현
	 * 
	 * 
	 * 데이터를 숨김 -> 객체간의 결합도를 낮춤 -> 책임을 분리시킨다.
	 * 
	 * 내꺼 내가 관리, 밖에서 값을 수정X 밖에서 값을 요구하는게 아니라 작업을 요구(수행)한다 상호간의 자신의 값을 작업함으로서 결합도를
	 * 낮춘다 유지보수를 유리하게 하는 작업
	 */

	// 모든 필드값을 확인할 수 있도록 반환해주는 메소드
	public String info() {

		// name, address, signatureMenuPrice
		// return name, address, signatureMenuPrice;
		// return 할 때 반환할 수 있는 값은 단 한개
		// 필드값을 합쳐서
		String info = "[name 필드값 : " + name + ", address 필드값 : " + address + ", signatureMenuPrice 필드값 : "
				+ signatureMenuPrice + "]";
		return info;
	}

}
