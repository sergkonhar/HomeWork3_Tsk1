public abstract class Parent {
 String nameOfProduct;
  int priceOfProduct;

    public Parent(String nameOfProduct, int priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public Parent() {
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
       if(nameOfProduct.matches("[A-Z]+[a-z]+")) {
           this.nameOfProduct = nameOfProduct;
       }
       }

    public int getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(int priceOfProduct) {
        if(priceOfProduct>1&priceOfProduct<10) {
            this.priceOfProduct = priceOfProduct;
        }
        }

    @Override
    public String toString() {
        return "Parent{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", priceOfProduct=" + priceOfProduct +
                '}';
    }
}
