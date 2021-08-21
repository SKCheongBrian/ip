public class Todo extends Task{
    public Todo(String description) {
        super(description);
    }

    @Override
    public String getType() {
        return "T";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getTiming() {
        return "";
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
