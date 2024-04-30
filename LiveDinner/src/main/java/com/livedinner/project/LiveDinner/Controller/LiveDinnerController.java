package com.livedinner.project.LiveDinner.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.livedinner.project.LiveDinner.Modell.Contact;
import com.livedinner.project.LiveDinner.Modell.Reservation;

@Controller
public class LiveDinnerController {
	
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("aboutPage")
	public String aboutPage() {
		return "about";
		
	}
	
	@RequestMapping("blogPage")
	public String blogPage() {
		return "blog";
	}
	
	
	@RequestMapping("blogDetailPage")
	public String blogDetailPage() {
		return "blog-details";
	}
	
	@RequestMapping("contactPage")
	public String contactpermission(Contact  contact) {
		return "contact";
	}
	
	@RequestMapping("contactpermission")
	public String contactPage(Contact cc) {
		Session openSession = sf.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		openSession.save(cc);
		beginTransaction.commit();
		return "contact";
	}

	@RequestMapping("galleryPage")
	public String galleryPage() {
		return "gallery";
	}
	

	@RequestMapping("indexPage")
	public String indexPage() {
		return "index";
	}
	

	@RequestMapping("menuPage")
	public String menuPage() {
		return "menu";
	}
	
	@RequestMapping("reservationPage")
	public String reservationPage() {
		return "reservation";
	}
	
	@RequestMapping("reservationpermission")
	public String reservationpermission(Reservation rr) {
		Session openSession = sf.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		openSession.save(rr);
		beginTransaction.commit();
		return "reservation";
	}
	
	@RequestMapping("stuffPage")
	public String stuffPage() {
		return "stuff";
	}
	
	

	
	

}
