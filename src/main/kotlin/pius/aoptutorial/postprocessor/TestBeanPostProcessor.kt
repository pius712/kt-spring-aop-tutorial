package pius.aoptutorial.postprocessor

import org.springframework.beans.factory.config.BeanPostProcessor
import pius.aoptutorial.domain.BarService
import pius.aoptutorial.domain.FooService


class TestBeanPostProcessor :BeanPostProcessor {
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {
        return super.postProcessBeforeInitialization(bean, beanName)
    }

    // 이렇게 아예 Bean을 갈아버리면, 애플리케이션이 뜨는 단계에서 bean을 못찾는다.
    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        return if(bean is FooService) BarService() else bean;
    }
}