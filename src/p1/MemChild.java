package p1;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MemChild {
private String name;

public String getName() {
	return name;
}
@Required
@Value("Ahmad")
public void setName(String name) {
	this.name = name;
}

}
