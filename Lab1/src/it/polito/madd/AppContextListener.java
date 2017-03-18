package it.polito.madd;


import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class AppContextListener
 *
 */
@WebListener
public class AppContextListener implements ServletContextListener, HttpSessionListener {
	
	public void contextInitialized(ServletContextEvent e){
		//ArrayList<Ticket> Tickets = new ArrayList<Ticket>;
		//e.getServletContext().setAttribute("TicketList", Tickets);
	}

    public void sessionCreated(HttpSessionEvent se) {
    	se.getSession().setAttribute("LoginService", new LoginManager());
    	//se.getSession().setAttribute("CartService", new CartManager());
    	//se.getSession().setAttribute("PaymentService", new PaymentManager());
    }
	
}
