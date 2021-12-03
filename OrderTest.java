public class OrderTest{
    public static void main(String[] args){
        Item burger1 = new Item("Cheese Burger", 5.50);
        Item burger2 = new Item("Bacon Burger", 6.50);
        Item burger3 = new Item("Chicken Fried Sandwich", 6.00);

        Order order1 = new Order("Leonnardo");

        order1.items.add(burger1);
        order1.items.add(burger2);
        order1.items.add(burger2);
        for(int i = 0; i<order1.items.size(); i++){
            System.out.println(order1.items.get(i).name);
        }
    }
}