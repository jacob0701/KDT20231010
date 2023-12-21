import java.nio.file.attribute.AclEntry;
import java.util.Scanner;

public class Season extends Thread {

	public void run(Character son, Work wk) {

		try {
			for (int i = 1; i <= 12; i++) {

				if (wk.work == 1) {
					Thread.sleep(500);
					System.out.println(son.name + "은 <야학>에서 일하는 중입니다.");
					System.out.println(i + "월이 지나갔습니다.");
				} else if (wk.work == 2) {
					Thread.sleep(500);
					System.out.println(son.name + "은 <주점>에서 일하는 중입니다.");
					System.out.println(i + "월이 지나갔습니다.");
				} else if (wk.work == 3) {
					Thread.sleep(500);
					System.out.println(son.name + "은 <수도원>에서 일하는 중입니다.");
					System.out.println(i + "월이 지나갔습니다.");
				} else if (wk.work == 4) {
					Thread.sleep(500);
					System.out.println(son.name + "은 <병영>에서 일하는 중입니다.");
					System.out.println(i + "월이 지나갔습니다.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
