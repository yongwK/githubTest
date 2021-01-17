package emp;

public class empLogin {
	public static String id;
	public static String pwd;
	public empLogin() {
		
	}

	public static boolean loginCheck() {
		if( id == "" || pwd == "") {
			System.out.println("아이디와 패스워드를 입력해주세요");
			return false;
		}else if(id.equals("master") && pwd.equals("1234")) {
			return true;
		}else {
			return false;
		}
		
	
	
	
	
	}
}
