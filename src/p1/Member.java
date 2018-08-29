package p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component
public class Member {
	

private String lastName;
private MemChild m;
/*public String getLastName() {
	return lastName;
}*/

@Required
@Value("Sakhaei")
public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getLastName() {
	return lastName;
}

public MemChild getM() {
	return m;
}

@Required
//@Autowired
public void setM(MemChild m) {
	this.m = m;
}

@Override
public String toString() {
	return "Member [lastName=" + lastName + ", m=" + m + "]";
}






}
