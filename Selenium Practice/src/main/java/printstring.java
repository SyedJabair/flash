
public class printstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		String s="syedjabair";
		for(int i=0;i<s.length();i++) {
			if(s.length()==1) {
				System.out.println(s);
			}
			for(int j=0;j<s.length();j++) {
				System.out.println(s.substring(0, s.length()-j));
				
			}
			s=s.substring(1,s.length());
		}
	}
}


