package project.itq.dto;

import project.itq.entity.DocumentStatus;

public class ConcurrencyTestResult {

    private int successCount;
    private int conflictCount;
    private int errorCount;
    private DocumentStatus finalStatus;

    public int getSuccessCount() {
        return successCount;
    }

    public int getConflictCount() {
        return conflictCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public DocumentStatus getFinalStatus() {
        return finalStatus;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public void setConflictCount(int conflictCount) {
        this.conflictCount = conflictCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public void setFinalStatus(DocumentStatus finalStatus) {
        this.finalStatus = finalStatus;
    }
}
