package com.example;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class ControllClass {

	@RequestMapping(method=RequestMethod.POST, value="/Registration")
	public void registrationFun(HttpServletRequest req){
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String password = req.getParameter("password1");
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Query q = pm.newQuery(UserData.class);
		q.setFilter("Email == '" + email + "'");
		List<UserData> result = (List<UserData>) q.execute();
		if(!(result.isEmpty())){
			System.out.println("No empty");
		}else{
			UserData c = new UserData();
			c.setName(name);
			c.setEmail(email);
			c.setPassword(password);
			c.setPhone(phone);
			try{
				pm.makePersistent(c);
			}finally{
				pm.close();
			}
		}
		
		
		
	}
	
}
