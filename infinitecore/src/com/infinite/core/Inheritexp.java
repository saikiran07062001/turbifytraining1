package com.infinite.core;

public class Inheritexp {
public void And ()
{
	System.out.println("method A");
}
}
class Inheritexp1 extends Inheritexp{


public void Bed(){
	super.And();
	System.out.println("method b");
}

public static void main(String[] arg){
	Inheritexp1 ob=new Inheritexp1();
	ob.Bed();
}
}

