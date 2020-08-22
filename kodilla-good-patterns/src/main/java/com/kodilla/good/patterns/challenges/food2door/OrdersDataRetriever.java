package com.kodilla.good.patterns.challenges.food2door;

public class OrdersDataRetriever {

    public OrdersData retrive() {
        User user = new User("JurekOgórek", "VegeBoy");
        User user1 = new User("MateuszSkarabeusz", "Mati");
        User user2 = new User("JolantaWarta", "FoodPassion");
        User user3 = new User("MirosławMazur", "Chłop21");


        Producer producer = new Producer("ExtraFoodShop");
        Producer producer1 = new Producer("HealthyShop");
        Producer producer2 = new Producer("GlutenFreeShop");
        Producer producer3 = new Producer("VeganProteinShop");

        Product product = new Product("yoghurtBio", 2.50, producer);
        Product product1 = new Product("milkBio", 2.30, producer);
        Product product2 = new Product("soySausagesBio", 7.50, producer);
        Product product3 = new Product("PumpkinJamBio", 19.50, producer);
        Product product4 = new Product("primroseOil", 20.50, producer1);
        Product product5 = new Product("grapeSeedOil", 15.50, producer1);
        Product product6 = new Product("walnutSeedOil", 15.50, producer1);
        Product product7 = new Product("hazelnutOil", 15.50, producer1);
        Product product8 = new Product("glutenFreeBread", 5.50, producer2);
        Product product9 = new Product("glutenFreeCookies", 10.00, producer2);
        Product product10 = new Product("glutenFreeFlour", 20.50, producer2);
        Product product11 = new Product("glutenFreeRolls", 15.50, producer2);
        Product product12 = new Product("peaProteinInstant", 50.00, producer3);
        Product product13 = new Product("riceProteinInstant", 45.50, producer3);
        Product product14 = new Product("soyProteinInstant", 50.00, producer3);
        Product product15 = new Product("tofu", 7.00, producer3);

        Order order = new Order(user, product, 25, producer);
        Order order1 = new Order(user, product2, 35, producer);
        Order order3 = new Order(user, product15, 25, producer3);
        Order order4 = new Order(user1, product, 5, producer);
        Order order5 = new Order(user1, product9, 45, producer2);
        Order order6 = new Order(user, product4, 5, producer1);
        Order order7 = new Order(user2, product15, 7, producer3);
        Order order8 = new Order(user2, product13, 80, producer3);
        Order order9 = new Order(user3, product1, 13, producer);
        Order order10 = new Order(user3, product14, 25, producer3);
        Order order2 = new Order(user3, product12, 25, producer3);
        Order order11 = new Order(user2, product11, 5, producer2);
        Order order12 = new Order(user1, product10, 25, producer2);
        Order order13 = new Order(user, product6, 25, producer1);
        Order order14 = new Order(user3, product5, 1, producer1);
        Order order15 = new Order(user1, product7, 5, producer1);
        Order order16 = new Order(user2, product8, 2, producer2);
        Order order17 = new Order(user3, product3, 3, producer);
        Order order18 = new Order(user1, product3, 2, producer);
        Order order19 = new Order(user, product12, 25, producer1);

        OrdersBasket ordersBasket = new OrdersBasket();
        ordersBasket.addOrders(order);
        ordersBasket.addOrders(order1);
        ordersBasket.addOrders(order2);
        ordersBasket.addOrders(order3);
        ordersBasket.addOrders(order4);
        ordersBasket.addOrders(order5);
        ordersBasket.addOrders(order6);
        ordersBasket.addOrders(order7);
        ordersBasket.addOrders(order8);
        ordersBasket.addOrders(order9);
        ordersBasket.addOrders(order10);
        ordersBasket.addOrders(order11);
        ordersBasket.addOrders(order12);
        ordersBasket.addOrders(order13);
        ordersBasket.addOrders(order14);
        ordersBasket.addOrders(order15);
        ordersBasket.addOrders(order16);
        ordersBasket.addOrders(order17);
        ordersBasket.addOrders(order18);
        ordersBasket.addOrders(order19);

        return new OrdersData(user2, producer1, ordersBasket);
    }
}
