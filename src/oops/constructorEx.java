package oops;

public class constructorEx {
    public static void main(String[] args) {
        itemDetails noteBook = new itemDetails("noteBook", 50, 5, 1234);

        System.out.println("Item Name: "+noteBook.itemName);
        System.out.println("Item MRP: "+noteBook.mrp);
        System.out.println("Tax Rate(%): "+noteBook.taxRate);
        System.out.println("Item Code: "+noteBook.itemCode);
    }
}


class itemDetails{
    public itemDetails(String name, int mrp, int taxRate, int itemCode){
        this.itemName=name;
        this.mrp=mrp;
        this.taxRate=taxRate;
        this.itemCode=itemCode;
    }
    String itemName;
    int mrp;
    int taxRate;
    int itemCode;
}