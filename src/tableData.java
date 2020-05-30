import javafx.beans.property.SimpleStringProperty;

public class tableData {
    private final SimpleStringProperty itemName;
    private final SimpleStringProperty itemMark;
    private final SimpleStringProperty studentName;

    public tableData(String itemName,String itemMark, String studentName){
        this.itemName = new SimpleStringProperty(itemName);
        this.itemMark = new SimpleStringProperty(itemMark);
        this.studentName = new SimpleStringProperty(studentName);
    }

    public String getItemName() {
        return itemName.get();
    }

    public String getItemMark() {
        return itemMark.get();
    }

    public String getStudentName() {
        return studentName.get();
    }

}
