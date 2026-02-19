package project.itq.dto;

public class StatusResult {

    private Long id;
    private StatusChange status;
    private String message;

    public Long getId() {
        return id;
    }

    public StatusChange getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(StatusChange status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
