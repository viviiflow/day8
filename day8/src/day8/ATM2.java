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

		String menu = "=== �ް�IT ATM ===\n";
		menu += "1. ȸ������\n2. ȸ��Ż��\n3. �α���\n4. �α׾ƿ�\n";
		menu += "5. �Ա�\n6. ��ü\n7. �ܾ���ȸ\n0. ����";

		while (true) {
			System.out.println(menu);
			System.out.println("");
			System.out.println("�޴� ����:");
			int slt = sc.nextInt();
			if (slt == 0) {
				break;
			}
			if (slt == 1) {
				System.out.println("<ȸ������>");
				/*for (int k = 0; k < 5; k++) {
					System.out.println(arID[k] + "--" + arPW[k]);
				}*/
				if (count == 5) {
					System.out.println("���� �ο� �ʰ�. ���� �Ұ���");
					continue;
				}
				while (true) {
					System.out.println("ID �Է�:");
					int id = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if (arID[i] == id) {
							System.out.println("�ߺ��� ���̵��Դϴ�.");
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
					System.out.println("PW �Է�:");
					int pw = sc.nextInt();
					if (pw != 0) {
						arPW[count - 1] = pw;
						break;
					} else {
						System.out.println("��� �Ұ��� �н�����");
					}
				}
			}
			if (slt == 2 && log == 1) {
				System.out.println("<ȸ��Ż��>");
				while (true) {
					int chkid = 100, chkpw = 1000;
					System.out.println("ID �Է�:");
					int logid = sc.nextInt();
					System.out.println("PW �Է�:");
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
						System.out.println("���̵� �Ǵ� �н����尡 Ʋ���ϴ�.");
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
						System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
						count--;
						cnt--;
						break;
					}
				}
			} else if (slt == 2 && log == -1) {
				System.out.println("�α��� �� �̿��Ͽ� �ֽñ� �ٶ��ϴ�.");
			}
			if (slt == 3 && log == -1) {
				System.out.println("<�α���>");
				while (true) {
					int chkid = 100, chkpw = 1000;
					System.out.println("ID �Է�:");
					int logid = sc.nextInt();
					System.out.println("PW �Է�:");
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
						System.out.println("���̵� �Ǵ� �н����尡 Ʋ���ϴ�.");
						log = -1;
					}
					if (log == 1) {
						System.out.println("�α��� �Ǿ����ϴ�.");
						break;
					}
				}
			} else if (slt == 3 && log == 1) {
				System.out.println("���� �α��� ���� �Դϴ�.");
			}
			if (slt == 4 && log == 1) {
				while (true) {
					int chkid = 100, chkpw = 1000;
					System.out.println("ID �Է�:");
					int logid = sc.nextInt();
					System.out.println("PW �Է�:");
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
						System.out.println("���̵� �Ǵ� �н����尡 Ʋ���ϴ�.");
						log = 1;
					}
					if (log == -1) {
						nid = 100;
						System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
						break;
					}
				}
			} else if (slt == 4 && log == -1) {
				System.out.println("�α��� �� �̿��Ͽ� �ֽñ� �ٶ��ϴ�.");
			}

			if (slt == 5 && log == 1) {
				System.out.println("<�Ա�>");
				while (true) {
					int chkpw = 100;
					System.out.println("Ȯ�� �н����� �Է�:");
					int logpw = sc.nextInt();

					for (int i = 0; i < 5; i++) {
						if ((arPW[i] == logpw) && (nid == i)) {
							chkpw = i;
						}
					}
					if (chkpw == 100) {
						System.out.println("�н����带 �ٽ� �Է��Ͽ� �ּ���.");
					} else {
						System.out.println("�Ա��� �ݾ� �Է�:");
						int logmn = sc.nextInt();
						arMONEY[chkpw] += logmn;
						System.out.println(logmn + "�� �ԱݵǾ����ϴ�.");
						break;
					}
				}
			} else if (slt == 5 && log == -1) {
				System.out.println("�α��� �� �̿��Ͽ� �ֽñ� �ٶ��ϴ�.");
			}
			if (slt == 6 && log == 1) {
				System.out.println("<��ü>");
				while (true) {
					int chkpw = 1000, chk = -1;
					System.out.println("Ȯ�� �н����� �Է�:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if ((arPW[i] == logpw) && (nid == i)) {
							chkpw = i;
						}
					}
					if (chkpw == 1000) {
						System.out.println("�н����带 �ٽ� �Է��Ͽ� �ּ���.");
						chk = -1;
						continue;
					} else {
						chk = 1;
					}
					if (chk == 1) {
						while (chk != 2) {
							int sndid = 100;
							System.out.println("�޴� ��� ID �Է�:");
							int logid2 = sc.nextInt();
							for (int n = 0; n < 5; n++) {
								if (arID[n] == logid2) {
									sndid = n;
								}
							}
							if ((sndid == 100) || (sndid == nid)) {
								System.out.println("���̵� �ٽ� �Է��Ͽ� �ּ���.");
								continue;
							} else {
								while (true) {
									System.out.println("�Ա��� �ݾ� �Է�:");
									int logmn = sc.nextInt();
									if (arMONEY[nid] >= logmn) {
										arMONEY[nid] -= logmn;
										arMONEY[sndid] += logmn;
										System.out.println(logid2 + "���� �������� " + logmn + "�� ��ü�Ǿ����ϴ�.");
										chk = 2;
										break;
									} else {
										System.out.println("�ܰ� �ʰ�");
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
				System.out.println("�α��� �� �̿��Ͽ� �ֽñ� �ٶ��ϴ�.");
			}
			if (slt == 7 && log == 1) {
				System.out.println("<�ܾ���ȸ>");
				while (true) {
					int chkpw = 100;
					System.out.println("Ȯ�� �н����� �Է�:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if ((arPW[i] == logpw) && (nid == i)) {
							chkpw = i;
						}
					}
					if (chkpw == 100) {
						System.out.println("�н����带 �ٽ� �Է��Ͽ� �ּ���.");
					} else {
						System.out.println(arID[nid] + "���� ���� �ܰ�: " + arMONEY[nid] + "��");
						break;
					}
				}
			} else if (slt == 7 && log == -1) {
				System.out.println("�α��� �� �̿��Ͽ� �ֽñ� �ٶ��ϴ�.");
			}
		}
		System.out.println("ATM ����");
	}
}
