package dispatchers.postdispatchers;

import javax.servlet.http.HttpServletRequest;

import dispatchers.ConcreteDispatcher;
import helpers.RequestAttributeSetter;

public class LoginDispatcher implements ConcreteDispatcher {

	@Override
	public void dispatch(HttpServletRequest request) {
		
		String login = request.getParameter("userlogin");
		entityes.persons.User user = dao.UserDAO.getUserByLogin(login);
		
		if ((user != null) && (request.getParameter("userpassword").equals(user.getPassword())))
		{
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("userpic", "images/" + login + ".jpg"); 
			RequestAttributeSetter.setForwardPageMain(request);
		}
		else
		{
			RequestAttributeSetter.setWrongLoginOrPasswordMessage(request);
			RequestAttributeSetter.setForwardPageLogin(request);
		}
		

	}

}
