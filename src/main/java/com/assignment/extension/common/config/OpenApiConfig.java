package com.assignment.extension.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("파일 확장자 차단 API")
                        .description("고정 및 커스텀 확장자 차단 관리 시스템 API 명세서")
                        .version("v1.0.0"));
    }
}