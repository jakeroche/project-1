package files;

/**
 * title project 2
 * @author 92019528 jakeroche
 */
class catalogueobject {

    private Integer id;
    private String itemName;
    private String category;

    // getter methods
    public int getItemId() {
        return this.id;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getCategory() {
        return this.category;
    }

    // constructor
    public catalogueobject(Integer newId, String newName, String newCategory) {

        this.id = newId;
        this.itemName = newName;
        this.category = newCategory;
    }

    @Override
    public String toString() {
        return ("\n" + this.id + " "
                + this.itemName + " "
                + this.category);
    }

}
