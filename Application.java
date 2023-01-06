package jinho.com.greedy.section03.jobSeeker;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int focus = 70;

		int count = 1;
		int random = (int) (Math.random() * 100) + 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("[???] : 취업을 위해 공부를 시작해야 해요. ");
		System.out.println("[???] : 공부를 해서 취업에 성공하세요.");
		System.out.println("===================================");
		System.out.println("[???] : 공부 할 사람을 선택해주세요");
		System.out.println("[???] : 1. 진호 2. 다현 3. 유찬 ");
		int a = sc.nextInt();
		System.out.println("[???] : 공부할 언어를 골라주세요 ");
		System.out.println("[???] : 1. java 2. Sql 3. Css ");

		int b = sc.nextInt();

		Java java = new Java();
		Sql Sql = new Sql();
		Css Css = new Css();

		switch (b) {
		case 1:
			while (count < 12) {

				System.out.println("===================================");
				System.out.println("1. 공부하기 2. 휴식하기 ");
				int button = sc.nextInt();
				{
					if (button == 1) {
						System.out.println("==================================");
						System.out.println("[" + count + "개월]차 " + "공부를 시작합니다!");
						java.getPoint(10);
						count++; // 공부 횟수
						if (count == 6) { // 프로젝트 이벤트
							System.out.println("프로젝트 기간입니다. 성공여부에 당신의 미래가 달라집니다.");
							java.joinProject();

							if (focus > random) {
								System.out.println("프로젝트를 성공적으로 완성했습니다 ! 더 많은 포인트를 얻습니다!");
								java.getPoint(100); // 프로젝트 성공 보나스
							} else {
								System.out.println("프로젝트를 폭망했습니다.");
								java.losePoint(100);

							}
						}

						if (count == 8) {

							if (focus > random) {
								System.out.println("당신이 이 메세지를 본다면 잘해오고 있다는 겁니다. 포기하지마세요!");
								java.getPoint(50);
							} else {
								System.out.println("노오오오오오오오오력이 필요합니다.");
								java.getPoint(10);
							}
						}

						if (count == 12) {
							System.out.println("12개월의 여정이 끝났습니다.");
							if (java.getJavaPoint() >= 100) { // 총점 가져오는 메소드
								System.out.println(java.ending());
								System.out.println("게임을 종료합니다.");// 해피엔딩 1
								if (java.getJavaPoint() >= 250) {
									java.scoutEnding(); // 해피엔딩 2 : 스카웃
									System.out.println("게임을 종료합니다.");

								}

							} else { // 배드엔딩을 else 하나 더 써서 내리기
								System.out.println(java.ending());
								if (java.getJavaPoint() < 60) { // 배드배드 엔딩
									java.hiddenEnding();
									;
									return;
								}

							}

						}

					} else {
						java.losePoint(-100);
						count++;
						System.out.println("[" + count + "개월]차 " + "공부를 시작합니다!");
						System.out.println("왜 쉬시죠? 앞으로 더 부단히 노력해야할 겁니다.");
						if (count == 12) {
							if (java.getJavaPoint() < 60) {
								java.hiddenEnding();
								return;
							}
						}
					}
				}
			}
		case 2:
			while (count < 12) {

				System.out.println("===================================");
				System.out.println("1. 공부하기 2. 휴식하기 ");
				int button = sc.nextInt();
				{
					if (button == 1) {
						System.out.println("==================================");
						System.out.println("[" + count + "개월]차 " + "공부를 시작합니다!");
						Sql.getPoint(10);
						count++; // 공부 횟수
						if (count == 6) { // 프로젝트 이벤트
							System.out.println("프로젝트 기간입니다. 성공여부에 당신의 미래가 달라집니다.");
							Sql.joinProject();

							if (focus > random) {
								System.out.println("프로젝트를 성공적으로 완성했습니다 ! 더 많은 포인트를 얻습니다!");
								Sql.getPoint(100); // 프로젝트 성공 보나스
							} else {
								System.out.println("프로젝트를 폭망했습니다.");
								Sql.losePoint(100);

							}
						}

						if (count == 8) {

							if (focus > random) {
								System.out.println("당신이 이 메세지를 본다면 잘해오고 있다는 겁니다. 포기하지마세요!");
								Sql.getPoint(50);
							} else {
								System.out.println("노오오오오오오오오력이 필요합니다.");
								Sql.getPoint(10);
							}
						}

						if (count == 12) {
							System.out.println("12개월의 여정이 끝났습니다.");
							if (Sql.getSqlPoint() >= 100) { // 총점 가져오는 메소드
								System.out.println(Sql.ending());
								System.out.println("게임을 종료합니다.");// 해피엔딩 1
								if (Sql.getSqlPoint() >= 250) {
									Sql.scoutEnding();
									; // 해피엔딩 2 : 스카웃
									System.out.println("게임을 종료합니다.");

								}

							} else { // 배드엔딩을 else 하나 더 써서 내리기
								System.out.println(Sql.badEnding());
								if (Sql.getSqlPoint() < 60) { // 배드배드 엔딩
									Sql.hiddenEnding();
									;
									return;
								}

							}

						}

					} else {
						Sql.losePoint(-100);
						count++;
						System.out.println("[" + count + "개월]차 " + "공부를 시작합니다!");
						System.out.println("왜 쉬시죠? 앞으로 더 부단히 노력해야할 겁니다.");
						if (count == 12) {
							if (Sql.getSqlPoint() < 60) {
								Sql.hiddenEnding();
								return;
							}
						}
					}
				}
			}
		case 3:
			while (count < 12) {

				System.out.println("===================================");
				System.out.println("1. 공부하기 2. 휴식하기 ");
				int button = sc.nextInt();
				{
					if (button == 1) {
						System.out.println("==================================");
						System.out.println("[" + count + "개월]차 " + "공부를 시작합니다!");
						Css.getPoint(10);
						count++; // 공부 횟수
						if (count == 6) { // 프로젝트 이벤트
							System.out.println("프로젝트 기간입니다. 성공여부에 당신의 미래가 달라집니다.");
							Css.joinProject();
							int random1 = (int) (Math.random() * 100) + 1;
							if (focus > random) {
								System.out.println("프로젝트를 성공적으로 완성했습니다 ! 더 많은 포인트를 얻습니다!");
								Css.getPoint(100); // 프로젝트 성공 보나스
							} else {
								System.out.println("프로젝트를 폭망했습니다.");
								Css.losePoint(100);

							}
						}

						if (count == 8) {
							int random1 = (int) (Math.random() * 100) + 1;
							if (focus > random) {
								System.out.println("당신이 이 메세지를 본다면 잘해오고 있다는 겁니다. 포기하지마세요!");
								Css.getPoint(50);
							} else {
								System.out.println("노오오오오오오오오력이 필요합니다.");
								Css.getPoint(10);
							}
						}

						if (count == 12) {
							System.out.println("12개월의 여정이 끝났습니다.");
							if (Css.getCssPoint() >= 100) { // 총점 가져오는 메소드
								System.out.println(Css.ending());
								System.out.println("게임을 종료합니다.");// 해피엔딩 1
								if (Css.getCssPoint() >= 250) {
									Css.scoutEnding(); // 해피엔딩 2 : 스카웃
									System.out.println("게임을 종료합니다.");

								}

							} else { // 배드엔딩을 else 하나 더 써서 내리기
								System.out.println(Css.badEnding());
								if (Css.getCssPoint() < 60) { // 배드배드 엔딩
									Css.hiddenEnding();
									return;
								}

							}

						}

					} else {
						Css.losePoint(-100);
						count++;
						System.out.println("[" + count + "개월]차 " + "공부를 시작합니다!");
						System.out.println("왜 쉬시죠? 앞으로 더 부단히 노력해야할 겁니다.");
						if (count == 12) {
							if (Css.getCssPoint() < 60) {
								Css.hiddenEnding();
								return;
							}
						}
					}
				}
			}
		}
	}

}
