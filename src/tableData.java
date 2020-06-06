import javafx.beans.property.SimpleStringProperty;

public class tableData {
    private final SimpleStringProperty itemName;
    private final SimpleStringProperty itemMark;

    public tableData(String itemName,String itemMark){
        this.itemName = new SimpleStringProperty(itemName);
        this.itemMark = new SimpleStringProperty(itemMark);
    }

    public String getItemName() {
        return itemName.get();
    }

    public String getItemMark() {
        return itemMark.get();
    }


}
