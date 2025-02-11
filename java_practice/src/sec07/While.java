	package sec07;
	
	public class While {
	
		public static void main(String[] args) {
			int i = 0;
	
			//  💡 while 문의 괄호에는 종료조건만
			while (i < 10) {
				// 종료조건 충족을 위한 값 변화는 외적으로 
				System.out.print(i++);
			}
	
		}
	
	}
