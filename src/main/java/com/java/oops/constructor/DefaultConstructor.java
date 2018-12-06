package com.java.oops.constructor;

public class DefaultConstructor
{
	// 1. Compiler is responsible to generate default constructor (but not JVM).

	// 2. If we're not writing any constructor then only compiler will generate default constructor i.e. if we're
	// writing at-least one constructor then compiler won't generate default constructor. Hence, every class in java can
	// contain constructor, it may be default constructor generated by compiler or customized constructor explicitly
	// provided by programmer but not both simultaneously.

	/** Prototype of default constructor **/

	// 1. It is always no-arg constructor.

	// 2. The access modifier of default constructor is exactly same as access modifier of class (this rule is
	// applicable only for public and default).

	// 3. It contains only 1 line i.e. 'super();'. It is a no-arg call to super class constructor.

	// Refer: Programmer_vs_Compiler_Code.PNG Note: Code highlighted in red is added by compiler.

	// 4. The first line inside every constructor should be either super() or this() and if we're not writing anything
	// then compiler will always place super().

	// 5. super() is used to call parent class constructor. this() is used to call another constructor of a same class.

	/** Note **/
	// Case 1: We can take super() or this() only in first line of constructor. If we're trying to take anywhere else
	// we'll get compile time error.

	// Case 2: Within the constructor we can take either super() or this() but not both simultaneously. We can call a
	// constructor directly from another constructor only.

	// Example for Case 1 and Case 2:
	public DefaultConstructor()
	{
		System.out.println("Cases");
		super(); // CE: call to super() must be first statement in constructor.
		this(); // CE: call to this() must be first statement in constructor.
	}

	// Case 3: We can use super() or this() only inside a constructor. If we're trying to use it outside constructor,
	// we'll get compile time error.

	// Example:
	public void m1()
	{
		super(); // CE: call to super() must be first statement in constructor.
		System.out.println("Case 3");
	}
	
	// Refer superAndThis_Method_vs_Keyword.PNG to know difference between super()/super and this()/this.

}
