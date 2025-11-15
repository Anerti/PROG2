import java.time.Instant;

public class GradeHistory {
    private double newGrade;
    private final Instant date;
    private final String description;

    public GradeHistory(double newGrade, String description) {
        this.newGrade = newGrade;
        this.date = Instant.now();
        this.description = description;
    }

    public double getNewGrade() {
        return newGrade;
    }
    public Instant getDate() {
        return date;
    }
    public String getDescription() {
        return description;
    }
    public void setNewGrade(GradeHistory newGrade) {
        this.newGrade = newGrade.getNewGrade();
    }
}
