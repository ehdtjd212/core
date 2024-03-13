package hello.core.order;

public class Order {

    private long memberId;
    private String itemName;
    private int itemprice;
    private int discountprice;

    public Order(long memberId, String itemName, int itemprice, int discountprice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemprice = itemprice;
        this.discountprice = discountprice;
    }

    public int calculatePrice(){
        return itemprice - discountprice;
    }
    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemprice() {
        return itemprice;
    }

    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }

    public int getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(int discountprice) {
        this.discountprice = discountprice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemprice=" + itemprice +
                ", discountprice=" + discountprice +
                '}';
    }
}
