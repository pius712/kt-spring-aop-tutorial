package pius.aoptutorial.domain.order

import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.aop.support.AopUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class OrderServiceTest(
        @Autowired private val orderService: OrderService,
        @Autowired private val orderRepository: OrderRepository) {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @Test
    fun test() {
        log.info("isAopPorxy, orderService=${AopUtils.isAopProxy(orderService)}")
        log.info("isAopPorxy, orderRepository=${AopUtils.isAopProxy(orderRepository)}")
    }

    @Test
    fun test1() {
        orderService.order()
    }

}