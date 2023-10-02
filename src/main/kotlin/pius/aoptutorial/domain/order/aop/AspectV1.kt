package pius.aoptutorial.domain.order.aop

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.slf4j.LoggerFactory

@Aspect
class AspectV1 (
        ){
    private val log = LoggerFactory.getLogger(this.javaClass)
    @Around("execution(* pius.aoptutorial.domain.order..*(..))")
    fun doLog(joinPoint: ProceedingJoinPoint):Any {
        log.info("[log] ${joinPoint.signature}")
        return joinPoint.proceed()
    }
}