package checkers;

import javax.servlet.http.HttpServletRequest;

public interface Checker {

	public boolean check(HttpServletRequest request);
	
}
