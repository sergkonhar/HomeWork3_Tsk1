public class SecondProduct extends Parent{


    int alcoholConcentartion;
  static   int quantity;


    public SecondProduct() {
    }

    public SecondProduct(String nameOfProduct, int priceOfProduct, int alcoholConcentartion, int quantity) {
        super(nameOfProduct, priceOfProduct);
        this.alcoholConcentartion = alcoholConcentartion;
        this.quantity = quantity;
    }

    public int getAlcoholConcentartion() {
        return alcoholConcentartion;
    }

    public void setAlcoholConcentartion(int alcoholConcentartion) {
        if(alcoholConcentartion>39&alcoholConcentartion<80) {
            this.alcoholConcentartion = alcoholConcentartion;
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
        return "SecondProduct{" +
                "alcoholConcentartion=" + alcoholConcentartion +
                ", quantity=" + quantity +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", priceOfProduct=" + priceOfProduct +
                '}';
    }


}
