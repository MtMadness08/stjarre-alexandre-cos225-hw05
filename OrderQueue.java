public class OrderQueue {
    private int Stock;
    private int queueSize = 0;
    LinkedQueue<CustomerOrder> Orders = new LinkedQueue<CustomerOrder>();

    public OrderQueue(){
        Stock = 0;
    }

    public OrderQueue(int Stock){
        this.Stock = Stock;
    }

    public void AddOrder(int Quantity){
        CustomerOrder Order = new CustomerOrder(Quantity);
        Orders.enqueue(Order);
        queueSize++;
    }

    public void AddStock(int Items){ // adds in items for the stock based on input number
        Stock = Stock+Items;
    }

    public void OrderTaken(){ //Gets the front of the list and decreases the quantity if it is greater than 0 by 1 item
        Orders.getFront().ShippedProduct();
        this.Stock--;
        if(Orders.getFront().Quantity <= 0){
            Orders.dequeue();
            queueSize--;
        }    
    }

    public void SellRemaining(){ //if the stock is greater than 0 then remove items until it is 0
        while(this.Stock > 0){
            OrderTaken();
            }
        }
    public String toString(){
        return "Quantity: " + Orders.getFront().Quantity;
    }
}
