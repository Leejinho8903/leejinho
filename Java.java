package jinho.com.greedy.section03.jobSeeker;

public class Java implements Develop {
	private int JavaPoint;

	public Java() {
	}

	public void setJavaPoint(int JavaPoint) {
		this.JavaPoint = JavaPoint;
	}


	public Java(int JavaPoint) {
		super();
		this.JavaPoint = JavaPoint;
	}

	
	public int getJavaPoint() {
		return JavaPoint;
	}

	@Override  
	public void getPoint(int pointUp) {
		JavaPoint += pointUp ;
		System.out.print("Point +" + pointUp+ "! ");
		System.out.println(", Total Point :" + JavaPoint);
	}
	
	public void losePoint(int pointDown) {
		JavaPoint += pointDown ;
		System.out.print("Point " + pointDown+ "! ");
		System.out.println(", Total Point :" + JavaPoint);
	}
	
	@Override // 누적 포인트 출력
	public String getInformation() {
		return "Java [JavaPoint= " + JavaPoint + "]";
	}

	@Override // 프로젝트 발생
	public void joinProject() {
		System.out.println("[프로젝트 제안]이 왔습니다. 열심히 한다면 좋은 결과가 있을 겁니다.");
	}

	@Override
	public void scoutEnding() {
		System.out.println("==============띠링!====================="); //멘트
		System.out.println("축하합니다! 성공적인 당신의 행보에 스카웃 제안이 왔습니다.");
		System.out.println("나이버, 가가오, 와이뱅크 골라가세요! 머기업 입력<<"); //멘트 수정요망
		
	}
	
	@Override
	public String ending() {
		return "[당신은 전도유망한 백엔드 개발자입니다!]";
	}

	
	@Override
	public String badEnding() {
		return "[어디로 가야하오]";
	}

	@Override
	public void hiddenEnding() {
		System.out.println("..");
		System.out.println("............");
		System.out.println(".....................");
		System.out.println("..............................");
		System.out.println("당신은 이세계에서 안됩니다. 개발집 막내아들 프로젝트 시작합니다.");
		System.out.println("[나] : 여긴 어디지? .....");
		System.out.println("2편을 기대해주세요 .....");
		
	}


}