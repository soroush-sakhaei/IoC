package p1;

import org.springframework.stereotype.Component;
@Component
public class MemFather {
private Member m;

public Member getM() {
	return m;
}

public void setM(Member m) {
	this.m = m;
}

@Override
public String toString() {
	return "MemFather [m=" + m.getLastName() + "]";
}

}
