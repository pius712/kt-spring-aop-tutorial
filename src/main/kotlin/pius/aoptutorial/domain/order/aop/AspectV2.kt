package pius.aoptutorial.domain.order.aop

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.LoggerFactory

@Aspect
class AspectV2 {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @Pointcut("execution(* pius.aoptutorial.domain.order..*(..))")
    fun allOrder() {}
    @Around("allOrder()")
    fun doLog(joinPoint: ProceedingJoinPoint):Any {
        log.info("[log] ${joinPoint.signature}")
        return joinPoint.proceed()
    }
}