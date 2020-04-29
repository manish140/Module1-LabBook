package lab3_exercise4;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next();
	sc.close();
	char[] ch = new char[s.length()];
    for (int i = 0; i < s.length(); i++)
        ch[i] = s.charAt(i);
    System.out.println(charCount(ch));
    
}
static HashMap<Character, Integer> charCount(char[] ch) {
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(char c:ch) {
		char tmp=c;
		if(map.containsKey(tmp)) {
			int count=map.get(tmp);
			map.put(tmp,count+1);
		}
		else
		 map.put(tmp,1);	
	}
	return map;
}
}
