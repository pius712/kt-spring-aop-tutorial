package pius.aoptutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AopTutorialApplication

fun main(args: Array<String>) {
    runApplication<AopTutorialApplication>(*args)
}
