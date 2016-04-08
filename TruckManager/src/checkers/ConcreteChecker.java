package checkers;

import javax.servlet.http.HttpServletRequest;

public interface ConcreteChecker {

	boolean check(HttpServletRequest request);
	
}
