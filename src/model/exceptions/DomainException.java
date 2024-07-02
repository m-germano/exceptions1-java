package model.exceptions;

//RuntimeException nao obriga a tratar. Exception eu serei obrigado a tratar o erro
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
}
