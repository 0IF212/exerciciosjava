package br.ifsp.taskmaster.controller;

import br.ifsp.taskmaster.dto.*;
import br.ifsp.taskmaster.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.data.domain.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TaskResponseDTO> createTask(
        @Valid @RequestBody TaskRequestDTO dto
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
            service.createTask(dto)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskResponseDTO> updateTask(
        @PathVariable Long id,
        @Valid @RequestBody TaskRequestDTO dto
    ) {
        return ResponseEntity.ok(service.updateTask(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Page<TaskResponseDTO>> listTasks(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "5") int size,
        @RequestParam(defaultValue = "id,asc") String[] sort,
        @RequestParam(required = false) String categoria
    ) {
        Pageable pageable = PageRequest.of(
            page,
            size,
            Sort.by(Sort.Direction.fromString(sort[1]), sort[0])
        );

        if (categoria != null) {
            return ResponseEntity.ok(
                service.filterTasksByCategoria(categoria, pageable)
            );
        }

        return ResponseEntity.ok(service.listTasks(pageable));
    }
}
