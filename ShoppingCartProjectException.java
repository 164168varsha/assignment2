package com.connection.exception;

public class ShoppingCartProjectException extends Exception {

	public ShoppingCartProjectException() {
		System.out.println("invalid errror.try  later...");
	}

	public ShoppingCartProjectException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ShoppingCartProjectException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ShoppingCartProjectException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ShoppingCartProjectException(String arg0, Throwable arg1,
			boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
