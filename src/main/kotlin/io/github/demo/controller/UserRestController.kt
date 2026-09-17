package io.github.demo.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.enums.ParameterIn
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "User API", description = "유저 도메인 API")
@RestController
@RequestMapping("/api/v1")
class UserRestController {

    @Operation(
        summary = "전체 유저 Read",
        description = "전체 유저 조회",
        parameters = [
            Parameter(
                name = " test",
                description = "test",
                required = true,
                `in` = ParameterIn.PATH
            )
        ],
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "성공"
            )
        ]
    )
    @GetMapping("/users/{test}")
    fun getUsers(@PathVariable("test") test: Int): ResponseEntity<Map<String, Int>> {
        val map = mapOf(Pair("James", 13))

        return ResponseEntity
            .status(HttpStatus.OK)
            .body(map)
    }

}
