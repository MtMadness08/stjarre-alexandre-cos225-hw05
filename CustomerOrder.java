public class CustomerOrder{
    String Name;
    String Date;
    int Quantity;

    public CustomerOrder(){
        Name = null;
        Date = null;
        Quantity = -1;
    }

    public CustomerOrder(int Quantity){
        this.Quantity = Quantity;
    }

    public void ShippedProduct(){
        if(Quantity > 0){
            Quantity -= 1;
        }
    }

}