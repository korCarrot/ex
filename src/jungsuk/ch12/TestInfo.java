package jungsuk.ch12;

public @interface TestInfo {
	int count() default 1;
	String[] value() default "aaa";
	
}
