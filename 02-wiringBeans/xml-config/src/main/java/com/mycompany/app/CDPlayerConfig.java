package com.mycompany.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//the unspecified component scan target is same package as config class + subpackages
//@ComponentScan(basePackageClasses={SgtPeppers.class})
//@ComponentScan(basePackageClasses={CompactDisc.class})
//this scan will not find com.mycompany.components.Incurso which also implements CompactDisc

//@ComponentScan("com.mycompany.components")
//@ComponentScan(basePackageClasses={com.mycompany.components.Incurso.class})
//@ComponentScan(basePackages={"com.mycompany.components","com.mycompany.morecomponents"})
//uncomment some other @ComponentScan above to play something less vanilla
public class CDPlayerConfig{}