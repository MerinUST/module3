package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ust.ioc.Connection;
import com.ust.ioc.Login;
import com.ust.iocautowiring.B;

public class testDrawing {
	public static void main(String[] args) {
//		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
//		Object obj =factory.getBean("point1");
//		Object obj1 =factory.getBean("point2");
//		Object obj2 =factory.getBean("line");
//		Line line=(Line)obj2;
//		line.drawLine();
//		
		//ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");//activating the spring container.
//		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//		context.registerShutdownHook();
//		boolean exits=context.containsBean("line");//one object is bind to other object is context
//		
//		System.out.println(exits);
//		if(exits) {
//			Object object=context.getBean("line");
//			if(object instanceof Line) {
//				Line line = (Line) object;
//			line.drawLine();
//			}
//		}
//	
//boolean type=context.isSingleton("line");// a class which have one context:every bean created by bean factory or application context is singleton
//System.out.println(type);
//
//Object object2=context.getBean("line");
//Object object=context.getBean("line");
//if(object.hashCode()==object2.hashCode()) {
//	System.out.println("line is singleton");
//}
//else {
//	System.out.println("line is not singleton");
//}
//	}
	
//	Line line1=(Line) context.getBean("line");
//	Line line2=(Line) context.getBean("line");
//	if(line1.hashCode()==line2.hashCode()) {
//		System.out.println("line is singleton");
//	}
//	else {//prototype means every time a bean is requested a new context os returned.2 containers 2 scopes
//		System.out.println("line is not singleton");
//	}
		
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		B b=(B) context.getBean("b");//callback methods:
		System.out.println(b);
		context.registerShutdownHook();
	}
}

