package io.github.demo.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.servers.Server
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenAPIConfig {

    @Bean
    fun openApi(): OpenAPI {
        return OpenAPI()
            .info(Info()
                .title("개발자 유구리 API 목록")
                .description("개발자 유구리 스프링 부트 Swagger 시리즈 실습을 위한 API 목록입니다.")
                .version("v1.0.0")
            )
            .servers(listOf<Server>(
                Server()
                    .url("http://localhost:8080")
                    .description("개발용 서버")
            ))
    }

    @Bean
    fun groupedOpenApiV1(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("v1")
            .pathsToMatch("/api/v1/**")
            .build()
    }

    @Bean
    fun groupedOpenApiV2(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("v2")
            .pathsToMatch("/api/v2/**")
            .build()
    }

}