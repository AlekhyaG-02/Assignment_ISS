package com.oops.encapsulation;

//Class with different access modifiers
@SuppressWarnings("unused")
public class AccessModifier {
	// Public variable
	public int publicVar = 10;

	// Protected variable
	protected int protectedVar = 20;

	// Default (Package-Private) variable
	int defaultVar = 30;

	// Private variable
	private int privateVar = 40;

	// Public method
	public void publicMethod() {
		System.out.println("Public Method");
	}

	// Protected method
	protected void protectedMethod() {
		System.out.println("Protected Method");
	}

	// Default (Package-Private) method
	void defaultMethod() {
		System.out.println("Default Method");
	}

	// Private method
	private void privateMethod() {
		System.out.println("Private Method");
	}
}
