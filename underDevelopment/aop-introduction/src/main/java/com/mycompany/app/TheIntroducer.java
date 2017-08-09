package com.mycompany.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class TheIntroducer {
	@DeclareParents(value="com.mycompany.app.InterfaceX+", defaultImpl=ImplProvider.class)
	public static Ability ability;
}
