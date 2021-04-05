package com.coforge.predefinedinter;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Trial {
public static void main(String[] args) {
	Consumer<String> consumer = (String t)->System.out.println(t.toUpperCase());
	consumer.accept("rajat");
	Supplier<Integer> sup=()->{
		return 10;
	};
	System.out.println(sup.get());
	BiConsumer <Integer,Integer> consumer1=(x,y)->System.out.println("Sum is:"+(x+y));
	consumer1.accept(15, 20);
	Predicate<String> pred=(name)->name.length()>6;
    System.out.println(pred.test("rajatjoshi"));
    BiPredicate<Integer,String> bipr=(num,name)->
    {
    	if(name.length()>6 && num>10)
    		return true;
    	return false;
    };
    System.out.println(bipr.test(12, "rajatjoshi"));
}
}
