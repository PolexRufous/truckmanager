package checkers;

import javax.servlet.http.HttpServletRequest;

import exceptions.IllegalMethodException;

public interface Checker {

	public boolean check(HttpServletRequest request)  throws IllegalMethodException;
	
}
