package chap06.lecture.p11annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
public @interface MyAnnotation6 {

	String value(); // element 명이 value이면 값을 줄 때 생략 가능
}
