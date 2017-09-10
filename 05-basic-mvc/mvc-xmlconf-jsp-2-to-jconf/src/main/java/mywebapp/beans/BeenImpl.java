package mywebapp.beans;

import org.springframework.stereotype.Component;

@Component
public class BeenImpl implements IBeen {
	public String report(){
		return "Been " + this.toString() + " reporting in!";
	}
}
