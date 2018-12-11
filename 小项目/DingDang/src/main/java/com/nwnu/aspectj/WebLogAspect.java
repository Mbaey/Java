package com.nwnu.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebLogAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    //对com.zparkep.controller包及其子包下面的所有类的所有public方法进行增强
    @Pointcut("execution(public * com.nwnu.controller..*.*(..))")
    public void webLog() {
    }

//    @Before("webLog()")
//    public void doBefore(JoinPoint joinPoint) throws Throwable {
//        // 接收到请求，记录请求内容
//        ServletRequestAttributes attributes = (ServletRequestAttributes)
//                RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        logger.info("=============================请求开始============================");
//        // 记录下请求内容
//        logger.info("URL : " + request.getRequestURL().toString());
//        logger.info("HTTP_METHOD : " + request.getMethod());
//        logger.info("IP : " + request.getRemoteAddr());
//        Enumeration<String> enu = request.getParameterNames();
//        while (enu.hasMoreElements()) {
//            String name = enu.nextElement();
//            logger.info(name + "=" + request.getParameter(name));
//        }
//    }
//    @AfterReturning(returning = "res", pointcut = "webLog()")
//    public void doAfterReturning(Object res) throws Throwable { // 处理完请求，返回内容
//        logger.info("RESPONSE : " + res);
//        logger.info("============================请求结束============================");
//    }
}
