package pius.aoptutorial.domain

import org.springframework.stereotype.Service

@Service
class FooService {


    fun hello():String {
        return "foo"
    }
}