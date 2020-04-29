package assignments7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	Map countCharacters(char[] c){
		LinkedHashMap h=new LinkedHashMap();
		for(int i=0;i<c.length;i++){
			int count=1;
			if(c[i]=='9'){
				continue;
			}
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					c[j]='9';
					count++;
				}
			}
			h.put(c[i], count);
		}
		Set set1 = h.entrySet();
		Iterator itr1 = set1.iterator();
		System.out.print("{");
		while (itr1.hasNext()) {
			Entry entry = (Entry) itr1.next();
			System.out.print("'" + entry.getKey() + "'" + ":");
			System.out.print(entry.getValue() + ",");
		}
		System.out.print("}");
		return h;
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements into string");
		String a=sc.next();
		char[] c=new char[a.length()];
		
		for(int i=0;i<a.length();i++){
			c[i]=a.charAt(i);
		}
		Exercise2 p=new Exercise2();
		p.countCharacters(c);
		
	}

}