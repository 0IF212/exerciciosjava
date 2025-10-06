package br.ifsp.taskmaster.service;

import br.ifsp.taskmaster.dto.*;
import br.ifsp.taskmaster.model.Task;
import br.ifsp.taskmaster.repository.TaskRepository;
import java.util.NoSuchElementException;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    private TaskResponseDTO toDTO(Task task) {
        return new TaskResponseDTO(
            task.getId(),
            task.getTitulo(),
            task.getDescricao(),
            task.getCategoria(),
            task.getDataLimite()
        );
    }

    public TaskResponseDTO createTask(TaskRequestDTO dto) {
        Task task = new Task();
        task.setTitulo(dto.getTitulo());
        task.setDescricao(dto.getDescricao());
        task.setCategoria(dto.getCategoria());
        task.setDataLimite(dto.getDataLimite());
        Task saved = repository.save(task);
        return toDTO(saved);
    }

    public TaskResponseDTO updateTask(Long id, TaskRequestDTO dto) {
        Task task = repository
            .findById(id)
            .orElseThrow(() ->
                new NoSuchElementException("Tarefa não encontrada")
            );
        task.setTitulo(dto.getTitulo());
        task.setDescricao(dto.getDescricao());
        task.setCategoria(dto.getCategoria());
        task.setDataLimite(dto.getDataLimite());
        return toDTO(repository.save(task));
    }

    public void deleteTask(Long id) {
        if (!repository.existsById(id)) {
            throw new NoSuchElementException("Tarefa não encontrada");
        }
        repository.deleteById(id);
    }

    public Page<TaskResponseDTO> listTasks(Pageable pageable) {
        return repository.findAll(pageable).map(this::toDTO);
    }

    public Page<TaskResponseDTO> filterTasksByCategoria(
        String categoria,
        Pageable pageable
    ) {
        return repository.findByCategoria(categoria, pageable).map(this::toDTO);
    }
}
