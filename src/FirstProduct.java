public class FirstProduct extends Parent  {

int necotine;
static int quantity;


    public FirstProduct() {
    }

    public FirstProduct(String nameOfProduct, int priceOfProduct, int necotine, int quantity) {
        super(nameOfProduct, priceOfProduct);
        this.necotine = necotine;
        this.quantity = quantity;
    }

    public int getNecotine() {
        return necotine;
    }

    public void setNecotine(int necotine) {
        if(necotine>1&necotine<10) {
            this.necotine = necotine;
        }
        }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "FirstProduct{" +
                "necotine=" + necotine +
                ", quantity=" + quantity +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", priceOfProduct=" + priceOfProduct +
                '}';
    }
}


