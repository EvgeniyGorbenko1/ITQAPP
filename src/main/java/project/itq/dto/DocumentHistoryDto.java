package project.itq.dto;

import project.itq.entity.DocumentActions;

import java.time.Instant;

public class DocumentHistoryDto {

    private DocumentActions action;
    private String performedBy;
    private Instant performedAt;
    private String comment;

    public DocumentActions getAction() {
        return action;
    }

    public void setAction(DocumentActions action) {
        this.action = action;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public Instant getPerformedAt() {
        return performedAt;
    }

    public void setPerformedAt(Instant performedAt) {
        this.performedAt = performedAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
