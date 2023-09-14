package com.infinite.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Exmparray {
public static void main(String[] arg){
	ArrayList ls= new ArrayList();
	ls.add(34);
	ls.add("saikiran");
	ls.add(33.5f);
	ls.add("sai");
	for(int i=89;i<=200;i++){
		ls.add(i);
	}
	System.out.println(ls);
	System.out.println("size"+ls.size());
	System.out.println(ls.get(3));
	System.out.println(ls.isEmpty());
	System.out.println(ls.toArray());
	Iterator it= ls.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
for(object p:ls){
	System.out.println(p);
	}
}
}
