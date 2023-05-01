package std.practice.interview.questions;

public final class ImutableClass {

    private final int id;
    private final String name;

    public ImutableClass(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
