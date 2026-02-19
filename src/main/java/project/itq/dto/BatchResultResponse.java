package project.itq.dto;

import java.util.List;

public class BatchResultResponse {

    private List<StatusResult> results;

    public List<StatusResult> getResults() {
        return results;
    }

    public void setResults(List<StatusResult> results) {
        this.results = results;
    }
}
