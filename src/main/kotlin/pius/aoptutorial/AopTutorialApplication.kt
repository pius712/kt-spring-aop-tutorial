package pius.aoptutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import
import pius.aoptutorial.postprocessor.TestPostProcessorConfig

@SpringBootApplication
@Import(TestPostProcessorConfig::class)
class AopTutorialApplication

fun main(args: Array<String>) {
    runApplication<AopTutorialApplication>(*args)
}
