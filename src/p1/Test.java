package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		 ApplicationContext ctx2=new ClassPathXmlApplicationContext("spring.xml");
		Member m = (Member) ctx2.getBean(Member.class);
		//MemFather mF = ctx.getBean(MemFather.class);
		//mF.setM(m);
		 MemChild mem=(MemChild) ctx2.getBean("mem");
		 m.setM(mem);
		// m.setM(mem);
		// m.setLastName("Sakha");
		// System.out.println(mem.getName());
		//System.out.println(mF.toString());
		System.out.println(m.toString());
	}
}
