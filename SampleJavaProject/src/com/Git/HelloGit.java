package com.Git;

public class HelloGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Test New");
		
		//Below line will give compilation error
		//System.out.println(null);
		
		
		System.out.println(123);
		System.out.println(1.23);
		System.out.println('a');
		
		//Java Test(Null Pointer)
		/*Boolean b=null;
		System.out.println(b ? true : false);*/
		
		//
		/*Number [] numbers = new Number[4];
		numbers[0] = new Number(0); 
		numbers[1] = new Integer(1); 
		numbers[2] = new Float(2.0f); 
		numbers[3] = new BigDecimal(3.0); 
		for(Number num : numbers) { 
		System.out.print(num + " ");*/ 
		
		Object nullObj = null;
		StringBuffer strBuffer = new StringBuffer(10);
		strBuffer.append("hello ");
		strBuffer.append("world ");
		strBuffer.append(nullObj);
		strBuffer.insert(11, '!');
		System.out.println(strBuffer);

	}

}
