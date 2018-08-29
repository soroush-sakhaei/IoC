package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
//@ImportResource({"spring.xml"})
public class Config {
	/*@Bean
	public MemberType getM() {
		MemberType m = new MemberType();
		
		return m;
	}*/
	@Bean
 public Member getMember(){
	 Member m=new Member();
	 //m.setLastName("Sakhaei");
	 return m;
 }
	/*@Bean(name="mem")
 	public MemChild getMem(){
 		return new MemChild();
 	}*/
}

