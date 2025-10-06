package br.ifsp.taskmaster.dto;

import java.time.LocalDateTime;

public class TaskResponseDTO {

    private Long id;
    private String titulo;
    private String descricao;
    private String categoria;
    private LocalDateTime dataLimite;

    // Construtor e Getters/Setters
    public TaskResponseDTO(
        Long id,
        String titulo,
        String descricao,
        String categoria,
        LocalDateTime dataLimite
    ) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.dataLimite = dataLimite;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }
}
