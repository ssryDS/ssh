package com.hxs.aspect;
/**
17  * 注解方式声明aop
18  * 1.用@Aspect注解将类声明为切面(如果用@Component("")注解注释为一个bean对象，那么就要在spring配置文件中开启注解扫描，<context:component-scan base-package="com.cjh.aop2"/>
19  *      否则要在spring配置文件中声明一个bean对象)
20  * 2.在切面需要实现相应方法的前面加上相应的注释，也就是通知类型。
21  * 3.此处有环绕通知，环绕通知方法一定要有ProceedingJoinPoint类型的参数传入，然后执行对应的proceed()方法，环绕才能实现。
22  */
public class NoteAspect {

}
