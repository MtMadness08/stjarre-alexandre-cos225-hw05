public class OrderQueue {
    private int Stock;
    private int QueueSize = 0;
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
        QueueSize++;
    }

    public void AddStock(int Items){
        Stock = Stock+Items;
    }

    public void OrderTaken(){
        Orders.getFront().ShippedProduct();
        this.Stock = Stock--;
        if(Orders.getFront().Quantity <= 0){
            Orders.dequeue();
            QueueSize--;
        }    
    }

    public void SellRemaining(){
        while(this.Stock > 0){
        Orders.getFront().ShippedProduct();
        Stock = Stock--;
        if(Orders.getFront().Quantity <= 0){
            Orders.dequeue();
            QueueSize--;
            }
        }
    }
    public String toString(){
        return "Quantity: " + Orders.getFront().Quantity;
    }
}
