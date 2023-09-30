package pius.aoptutorial.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pius.aoptutorial.domain.BarService
import pius.aoptutorial.domain.FooService

@RestController
@RequestMapping("/api/v1/test")
class TestController(private val fooService: FooService, ){


    @GetMapping
    fun test():String  {
        return fooService.hello();
    }
}