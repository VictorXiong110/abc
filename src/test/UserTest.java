package test;

import java.util.LinkedList;
import java.util.List;
interface A{
	void aa();
	default void bb() {
		System.out.println("�ǳ�����");
	}
}
class B implements A{

	@Override
	public void aa() {
		System.out.println("����ʵ����");
		
	}
	
}
public class UserTest {

	public static void main(String[] args) {
		List a = new LinkedList();
		Object o = new Object();
		B  b = new B();
		b.aa();
		b.bb();
		
	}

}
