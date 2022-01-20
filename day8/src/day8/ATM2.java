package day8;

import java.util.Scanner;

public class ATM2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 5;

		int[] arID = new int[max];
		int[] arPW = new int[max];
		int[] arMONEY = new int[max];

		int count = 0, cnt = 1, log = -1;
		int nid = 100;

		String menu = "=== 메가IT ATM ===\n";
		menu += "1. 회원가입\n2. 회원탈퇴\n3. 로그인\n4. 로그아웃\n";
		menu += "5. 입금\n6. 이체\n7. 잔액조회\n0. 종료";

		while (true) {
			System.out.println(menu);
			System.out.println("");
			System.out.println("메뉴 선택:");
			int slt = sc.nextInt();
			if (slt == 0) {
				break;
			}
			if (slt == 1) {
				System.out.println("<회원가입>");
				/*for (int k = 0; k < 5; k++) {
					System.out.println(arID[k] + "--" + arPW[k]);
				}*/
				if (count == 5) {
					System.out.println("가입 인원 초과. 가입 불가능");
					continue;
				}
				while (true) {
					System.out.println("ID 입력:");
					int id = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if (arID[i] == id) {
							System.out.println("중복된 아이디입니다.");
							break;
						} else if (arID[i] == 0) {
							arID[i] = id;
							arMONEY[i] += 1000;
							count++;
							break;
						}
					}
					if (cnt == count) {
						cnt++;
						break;
					}
				}
				while (true) {
					System.out.println("PW 입력:");
					int pw = sc.nextInt();
					if (pw != 0) {
						arPW[count - 1] = pw;
						break;
					} else {
						System.out.println("사용 불가한 패스워드");
					}
				}
			}
			if (slt == 2 && log == 1) {
				System.out.println("<회원탈퇴>");
				while (true) {
					int chkid = 100, chkpw = 1000;
					System.out.println("ID 입력:");
					int logid = sc.nextInt();
					System.out.println("PW 입력:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if (arID[i] == logid) {
							chkid = i;
						}
					}
					for (int j = 0; j < 5; j++) {
						if (arPW[j] == logpw) {
							chkpw = nid;
						}
					}
					if ((chkid == chkpw) && (chkid == nid)) {
						arID[chkid] = 0;
						arPW[chkpw] = 0;
						log = -1;
					} else {
						System.out.println("아이디 또는 패스워드가 틀립니다.");
						log = 1;
					}
					if (log == -1) {
						for (int x = nid; x < arID.length - 1; x++) {
							arID[x] = arID[x + 1];
							arMONEY[x] = arMONEY[x + 1];
						}
						arID[4] = 0;
						arMONEY[4] = 0;
						for (int x = nid; x < arPW.length - 1; x++) {
							arPW[x] = arPW[x + 1];
						}
						arPW[4] = 0;
						System.out.println("회원탈퇴가 완료되었습니다.");
						count--;
						cnt--;
						break;
					}
				}
			} else if (slt == 2 && log == -1) {
				System.out.println("로그인 후 이용하여 주시길 바랍니다.");
			}
			if (slt == 3 && log == -1) {
				System.out.println("<로그인>");
				while (true) {
					int chkid = 100, chkpw = 1000;
					System.out.println("ID 입력:");
					int logid = sc.nextInt();
					System.out.println("PW 입력:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if (arID[i] == logid) {
							chkid = i;
						}
					}
					for (int j = 0; j < 5; j++) {
						if ((arPW[j] == logpw) && (j == chkid)) {
							chkpw = j;
						}
					}
					if (chkid == chkpw) {
						nid = chkid;
						log = 1;
					} else {
						System.out.println("아이디 또는 패스워드가 틀립니다.");
						log = -1;
					}
					if (log == 1) {
						System.out.println("로그인 되었습니다.");
						break;
					}
				}
			} else if (slt == 3 && log == 1) {
				System.out.println("현재 로그인 상태 입니다.");
			}
			if (slt == 4 && log == 1) {
				while (true) {
					int chkid = 100, chkpw = 1000;
					System.out.println("ID 입력:");
					int logid = sc.nextInt();
					System.out.println("PW 입력:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if (arID[i] == logid) {
							chkid = i;
						}
					}
					for (int j = 0; j < 5; j++) {
						if ((arPW[j] == logpw) && (j == chkid)) {
							chkpw = j;
						}
					}
					if ((chkid == chkpw) && (chkid == nid)) {
						log = -1;
					} else {
						System.out.println("아이디 또는 패스워드가 틀립니다.");
						log = 1;
					}
					if (log == -1) {
						nid = 100;
						System.out.println("로그아웃 되었습니다.");
						break;
					}
				}
			} else if (slt == 4 && log == -1) {
				System.out.println("로그인 후 이용하여 주시길 바랍니다.");
			}

			if (slt == 5 && log == 1) {
				System.out.println("<입금>");
				while (true) {
					int chkpw = 100;
					System.out.println("확인 패스워드 입력:");
					int logpw = sc.nextInt();

					for (int i = 0; i < 5; i++) {
						if ((arPW[i] == logpw) && (nid == i)) {
							chkpw = i;
						}
					}
					if (chkpw == 100) {
						System.out.println("패스워드를 다시 입력하여 주세요.");
					} else {
						System.out.println("입금할 금액 입력:");
						int logmn = sc.nextInt();
						arMONEY[chkpw] += logmn;
						System.out.println(logmn + "원 입금되었습니다.");
						break;
					}
				}
			} else if (slt == 5 && log == -1) {
				System.out.println("로그인 후 이용하여 주시길 바랍니다.");
			}
			if (slt == 6 && log == 1) {
				System.out.println("<이체>");
				while (true) {
					int chkpw = 1000, chk = -1;
					System.out.println("확인 패스워드 입력:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if ((arPW[i] == logpw) && (nid == i)) {
							chkpw = i;
						}
					}
					if (chkpw == 1000) {
						System.out.println("패스워드를 다시 입력하여 주세요.");
						chk = -1;
						continue;
					} else {
						chk = 1;
					}
					if (chk == 1) {
						while (chk != 2) {
							int sndid = 100;
							System.out.println("받는 사람 ID 입력:");
							int logid2 = sc.nextInt();
							for (int n = 0; n < 5; n++) {
								if (arID[n] == logid2) {
									sndid = n;
								}
							}
							if ((sndid == 100) || (sndid == nid)) {
								System.out.println("아이디를 다시 입력하여 주세요.");
								continue;
							} else {
								while (true) {
									System.out.println("입금할 금액 입력:");
									int logmn = sc.nextInt();
									if (arMONEY[nid] >= logmn) {
										arMONEY[nid] -= logmn;
										arMONEY[sndid] += logmn;
										System.out.println(logid2 + "님의 통장으로 " + logmn + "원 이체되었습니다.");
										chk = 2;
										break;
									} else {
										System.out.println("잔고 초과");
									}
								}
							}
						}
					}
					if (chk == 2) {
						break;
					}
				}
			} else if (slt == 6 && log == -1) {
				System.out.println("로그인 후 이용하여 주시길 바랍니다.");
			}
			if (slt == 7 && log == 1) {
				System.out.println("<잔액조회>");
				while (true) {
					int chkpw = 100;
					System.out.println("확인 패스워드 입력:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if ((arPW[i] == logpw) && (nid == i)) {
							chkpw = i;
						}
					}
					if (chkpw == 100) {
						System.out.println("패스워드를 다시 입력하여 주세요.");
					} else {
						System.out.println(arID[nid] + "님의 통장 잔고: " + arMONEY[nid] + "원");
						break;
					}
				}
			} else if (slt == 7 && log == -1) {
				System.out.println("로그인 후 이용하여 주시길 바랍니다.");
			}
		}
		System.out.println("ATM 종료");
	}
}
