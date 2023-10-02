package pius.aoptutorial.domain.order

import org.springframework.stereotype.Service

@Service
class OrderService(private val orderRepository: OrderRepository) {

    fun order():String {
        return orderRepository.save()
    }
}