
public class Ending2 {

	void ending2(Character son,EndingFace edf) {
		
		if (son.stamina >= 80 & son.strength >= 80 & son.morality >= 70 & son.intelligence >= 70 &  son.sensibility >= 70 & son.faith >= 70 & son.stress <= 70)  {
			
			System.out.println("여러가지 능력이 출중했으며, 온화한 성격의 청년이 된 " + son.name + "은 왕국에서 명성을 얻었고 그 소문은 왕국에 퍼져 왕에게 전해지게 되었다.");
			System.out.println("왕의 총애로 성에 자주 드나들던 " + son.name + "은 왕의 하나뿐인 외동딸을 만나고 눈이 맞아 버렸다.");
			System.out.println("그러다 식을 올리기도 전에 둘 사이에 아기가 생겼고, 왕은 손 쓸 새도 없이 " + son.name + "을 <<왕자>>로 책봉하였다.");
			System.out.println(son.name + "은 <<왕자>>가 되었습니다.");
			edf.end1();
		}
		
		else if (son.money <= 0) {

			System.out.println(son.name + "은 <<거지>>가 되었습니다");
			edf.end2();	
		}

		else if (son.stamina >= 80) {

			if (son.stress <= 60) {

				System.out.println("건장하게 자란 " + son.name + " 은 10년 뒤 아버지와 가업을 이어 <<목수>>가 되었습니다.");
				
				edf.end3();
				
				
			} else if (son.morality < 60 & son.strength >70) {

				System.out.println("건장하게 자랐으나 인성이 안 좋았던 " + son.name + " 은 10년 뒤 <<도적>>이 되었습니다.");
				edf.end4();
			}

		} else if (son.strength >= 80) {

			if (son.morality >= 80) {

				System.out.println("건장하고 반듯하게 자란 " + son.name + " 은 10년 뒤 왕국의 <<기사>>가 되었습니다.");
				edf.end5();
				
			} else {

				System.out.println("건장하게 자랐으나 폭력적인 성향이 다분했던  " + son.name + " 은 10년 뒤 한낱 <<불량배>>가 되었습니다.");
				edf.end6();	
			}

		} else if (son.intelligence >= 80) {

			if (son.morality >= 80) {

				System.out.println("학습에 관심을 보이던 " + son.name + "은 10년 뒤 왕립 학교의 <<교사>>가 되었습니다.");
				edf.end7();		

			} else {

				System.out.println("잔머리만 좋았던 " + son.name + "은 10년 뒤 시장의 <<대부업자>>가 되었습니다.");
				edf.end8();	
			}

		} else if (son.sensibility >= 80) {

			if (son.intelligence >= 80) {

				System.out.println("섬세하고 명석했던 " + son.name + "은 10년 뒤 왕실 직속 <<미술가>>가 되었습니다.");
				edf.end9();

			} else {

				System.out.println("감정 기복이 심했던 " + son.name + "은 10년 뒤 마을의 <<광인>>이 되었습니다.");
				edf.end10();		

			}

		} else if (son.faith >= 80) {

			if (son.morality >= 80) {

				System.out.println("신실하고 양심적인 " + son.name + "은 10년 뒤 수도원의 <<성직자>>가 되었습니다.");
				edf.end11();
			} else {

				System.out.println("종교에 심취해 있던 " + son.name + "은 10년 뒤 사이비종교의 <<교주>>가 되었습니다.");
			}
		}

		else if (son.morality >= 80) {

			if (son.money >= 1000) {

				System.out.println("성실하고 구두쇠 같았던 " + son.name + "은 10년 뒤 의 <<상인>>이 되었습니다.");
			}

		}

	}
}
