package pius.aoptutorial.domain

import org.springframework.stereotype.Service

@Service
class BarService {

    fun hello():String {
        return "bar"
    }
}