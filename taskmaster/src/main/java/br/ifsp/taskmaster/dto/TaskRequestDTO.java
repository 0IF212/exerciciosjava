package br.ifsp.taskmaster.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class TaskRequestDTO {

    @NotBlank(message = "O campo 'titulo' é obrigatório")
    private String titulo;

    private String descricao;

    @NotBlank(message = "O campo 'categoria' é obrigatório")
    private String categoria;

    @NotNull(message = "O campo 'dataLimite' é obrigatório")
    private LocalDateTime dataLimite;

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDateTime dataLimite) {
        this.dataLimite = dataLimite;
    }
}
