package pius.aoptutorial.postprocessor

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class TestPostProcessorConfig {

    @Bean
    fun testBeanPostProcessor(): TestBeanPostProcessor {
        return TestBeanPostProcessor()
    }
}