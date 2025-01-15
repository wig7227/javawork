package _02_StringMethod;
// substring(fromindex) : fromindex번호 부터 ~ 끝까지 가져오기
// substring(fromindex, endindex) : fromindex번호 부터 ~ endIndex번호 까지 가져오기
public class T09_substring {

	public static void main(String[] args) {
		String str = "spring aws start";
		
		String result = str.substring(7);
		System.out.println(result);

		String result2 = str.substring(7,10);
		System.out.println(result2);
		
		System.out.println("--------------------");
		
		String sn = "030523-3245678";
		
		String month = sn.substring(2,4);
		String day = sn.substring(4,6);
		
		System.out.println("생일은" + month + "월" + day + "일 입니다");
		
		int age = Integer.parseInt(sn.substring(0,2));
		
		if(age < 25)
			System.out.println("나이는" + (25-age) + "세 입니다");
		else
			System.out.println("나이는" + (125-age) + "세 입니다");
		
		
		/*String gender = sn.substring(7,8);
		System.out.println(sn.substring(7,8));*/
		
		/*		if(gender.equals("1") || gender.equals("3"))
					System.out.println("남자");
				else
					System.out.println("여자");
				
				switch(gender) {
				case "1": case "3":
					System.out.println("남자");
				case "2": case "4":
					System.out.println("여자");
					break;	
				}*/
		
		/*int gender = Integer.parseInt(sn.substring(7,8));
		System.out.println(sn.substring(7,8));
		
		if(gender==1 || gender==3)
			System.out.println("남자");
		else
			System.out.println("여자");*/
		
	}

}
