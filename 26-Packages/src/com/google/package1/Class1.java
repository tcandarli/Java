package com.google.package1;

// There are 3 ways to access package from outside the package
//1. way import package.*;
import com.google.package2.*;

//2. import package.className
//import com.google.package2.Class2;

//3. fully qualified name
// com.google.package2.Class2 cl1=new com.google.package2.Class2();
// com.google.package2.Class3 cl2=new com.google.package2.Class3();

public class Class1 {

	public static void main(String[] args) {

		Class2 cl = new Class2();
		Class3 cl3 = new Class3();

	}

}
