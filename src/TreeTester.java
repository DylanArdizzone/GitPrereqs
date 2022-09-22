
import java.io.IOException;
import java.util.*;

public class TreeTester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> info=new ArrayList<String>();
		info.add("shrek : alkdfjadasd filename1.txt");
		info.add("beans : adlfjasdkf anotherfilename.txt");
		info.add("kuro : ;lj;lkj;kj filed.txt");
		Tree tronk=new Tree(info);
		tronk.saveInfo();
		
	}

}
