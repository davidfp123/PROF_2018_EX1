package david;

public class MyString {
	
	public String s;
	
	public MyString(String r){
		this.s=r;
	}
	
	public int compareTo(MyString other){
		
		//nodo 1
		int res=0;
		//nodo 2
		for(int k=0;k<this.s.length()&&k<other.s.length();k++){
			//nodo 3
			res = this.s.charAt(k)-other.s.charAt(k);
			//nodo 4
			if(res!=0)
				//nodo 5
				return res;
		}
		
		//nodo 6
		return this.s.length()-other.s.length();
	}
		
}
