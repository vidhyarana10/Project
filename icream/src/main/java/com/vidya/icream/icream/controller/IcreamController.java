package com.vidya.icream.icream.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vidya.icream.icream.model.Contact;

@Controller
public class IcreamController {
	
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("aboutPage")
	public String aboutPage() {
		return "about";
	}
	@RequestMapping("contactPage")
	public String contactPage() {
		return "contact";
	}
	
	
	
	@RequestMapping("contactPagepermission")
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
	
	//Main Page
	
	@RequestMapping("indexPage")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("productPage")
	public String productPage() {
		return "product";
	}
	
	@RequestMapping("servicePage")
	public String servicePage() {
		return "service";
	}
	

}
