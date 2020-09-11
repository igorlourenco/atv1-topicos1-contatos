package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ContactController {
	private String name;
	private String email;
	private String message;
	
	
	public String sendMessage() {
		System.out.println("Mensagem enviada!");
		return  " ";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMsg(String message) {
		this.message = message;
	}

}