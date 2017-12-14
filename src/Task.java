public class Task {
    private String text;
    private boolean dONE;

    @Override
    public String toString() {
        return text + " " + dONE;
    }

    public Task(String text, boolean dONE) {
        this.text = text;
        this.dONE = dONE;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isdONE() {
        return dONE;
    }

    public void setdONE(boolean dONE) {
        this.dONE = dONE;
    }
}
