import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		System.out.println("ù ��° ���� �߽ɰ� ������ �Է�>>");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int x1=s.nextInt();
		double r=s.nextDouble();
		System.out.println("�� ��° ���� �߽ɰ� ������ �Է�>>");
		int y=s.nextInt();
		int y1=s.nextInt();
		double r1=s.nextDouble();
		double distance=0;
		distance = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		if (distance<=r+r1) System.out.println("�� ���� ���� ��ģ��.");
		else System.out.println("�� ���� ���� �Ȱ�ģ��.");
		s.close();
		}
	}