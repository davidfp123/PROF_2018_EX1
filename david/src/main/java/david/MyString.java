package david;

public class MyString {
	
	public String s;
	
	public int compareTo(MyString other){
		
		int res=0;
		for(int k=0;k<this.s.length()&&k<other.s.length();k++){
			res = this.s.charAt(k)-other.s.charAt(k);
			if(res!=0)
				return res;
		}
		
		return this.s.length()-other.s.length();
	}
		
}
