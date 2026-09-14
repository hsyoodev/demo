package io.github.demo.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "User API", description = "유저 도메인 API")
@RestController
@RequestMapping("/api/v1")
class UserRestController {

    @GetMapping("/users")
    fun getUsers(): ResponseEntity<Map<String, Int>> {
        val map = mapOf(Pair("James", 13))

        return ResponseEntity
            .status(HttpStatus.OK)
            .body(map)
    }

}
