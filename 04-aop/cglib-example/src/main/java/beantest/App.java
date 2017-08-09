package beantest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class App{
	public static void main(String[] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		ClassAAA aaa = (ClassAAA) context.getBean(ClassAAA.class);
		ClassBBB bbb = (ClassBBB) context.getBean(ClassBBB.class);
		//InterfaceX bbb = (InterfaceX) context.getBean(InterfaceX.class);

		aaa.doSomething();
		bbb.doSomething();
	}
}
//	TODO:
//	A) go to InterfaceX.java, comment-out the only method and run. Observe result and undo changes.
//	B) go to Aspect1.java, comment-out the advice on ClassBB and run. Observe result and undo changes.
//	C) in App.java, comment-out the line that starts wiht "ClassBBB bbb = ..." and uncomment the line below.
//
//	Stack Overflow post about this:
//	https://stackoverflow.com/questions/45579173/nosuchbeandefinitionexception-caused-either-the-beans-interface-or-an-advice-on
//
//	Stack Overflow provided the solution:
//	From state prior to the three changes mentioned above, go to JavaConfig.java and make the
//	following change: @EnableAspectJAutoProxy(proxyTargetClass=true)

