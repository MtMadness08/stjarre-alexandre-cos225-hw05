public class OrderTester {

    public static void main(String[] args){

    OrderQueue First_Queue = new OrderQueue(14);
        First_Queue.AddOrder(5);
        First_Queue.AddOrder(5);
        First_Queue.AddOrder(8);

        System.out.println(First_Queue);

        First_Queue.SellRemaining();

        System.out.println(First_Queue);

        First_Queue.AddStock(10);

        First_Queue.AddOrder(3);
        First_Queue.AddOrder(3);
        First_Queue.AddOrder(5);

        First_Queue.SellRemaining();

        System.out.println(First_Queue);
    }
}