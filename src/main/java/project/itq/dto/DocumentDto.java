package project.itq.dto;

import project.itq.entity.DocumentStatus;

import java.time.Instant;
import java.util.List;

public class DocumentDto {

    private Long id;
    private String number;
    private String author;
    private String title;
    private DocumentStatus status;
    private Instant createdAt;
    private Instant updatedAt;
    private List<DocumentHistoryDto> history;

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public DocumentStatus getStatus() {
        return status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public List<DocumentHistoryDto> getHistory() {
        return history;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(DocumentStatus status) {
        this.status = status;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setHistory(List<DocumentHistoryDto> history) {
        this.history = history;
    }
}
