package Models;

public class Task {
    private final String Description;
    private final String Title;
    public Task(String Description, String Title){
        this.Title = Title;
        this.Description = Description;
    }

    public String getDescription(){
        return Description;
    }
    public String getTitle(){
        return Title;
    }
}
