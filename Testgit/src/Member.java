
//VO(value object), DTO
public class Member{
		private int no = 1234;
		private String username = "세종대앙";
		private String tel = "010-4567-7890";
		private String addr = "서울시 매포구 백범로";

		public Member() {
			
			
		}
		public Member(int no, String username, String tel, String addr) {
			this.no = no;
			this.username = username;
			this.tel = tel;
			this.addr = addr;
			
		}
		public void memberPrn() {
			System.out.printf("%d, %s, %s, %s\n", no, username, tel, addr);
		}
		
		// getter, setter
		
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}

		public String getUsername() {
			return username;
		}
		
		public void setUsername(String username) {
			this.username = username;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		
		





}
