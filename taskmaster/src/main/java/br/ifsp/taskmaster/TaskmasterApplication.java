package br.ifsp.taskmaster;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
    info = @Info(
        title = "Taskmaster API",
        version = "1.0",
        description = "Documentação da API do Taskmaster"
    )
)
@SpringBootApplication
public class TaskmasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskmasterApplication.class, args);
    }
}
