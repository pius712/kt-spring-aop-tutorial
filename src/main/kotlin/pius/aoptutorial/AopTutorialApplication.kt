package pius.aoptutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import
import pius.aoptutorial.domain.order.aop.AspectV1
import pius.aoptutorial.domain.order.aop.AspectV2
import pius.aoptutorial.domain.order.aop.AspectV3
import pius.aoptutorial.postprocessor.TestPostProcessorConfig

@SpringBootApplication
//@Import(TestPostProcessorConfig::class)
//@Import(AspectV2::class)
@Import(AspectV3::class)
class AopTutorialApplication

fun main(args: Array<String>) {
    runApplication<AopTutorialApplication>(*args)
}
