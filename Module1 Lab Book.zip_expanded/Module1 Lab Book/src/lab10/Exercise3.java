package assignmentss10;
import java.util.*;
import java.util.function.Consumer;
interface auth
{
	boolean display(String u_name,String password);
}
public class Exercise3 {
	public static void main(String[] args) {
			auth a=(u_name,password)->{
				if(u_name.equals(password))
					return true;
				else
					return false;
			};
			Scanner sc=new Scanner(System.in);
			String u_name=sc.next();
			String password=sc.next();
			System.out.println(a.display(u_name, password));
	}

}
