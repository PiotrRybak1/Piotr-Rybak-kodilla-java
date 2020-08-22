package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Producer {
    String name;


    public Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean process(User user, Producer producer, OrdersBasket ordersBasket){
        System.out.println( user.getName() + " orders: " );
        producer.specificOrdersProducts(user,producer,ordersBasket)
                .stream()
                .map(Order ::getProduct)
                .map(Product::getProductName)
                .forEach(System.out ::println);

        System.out.println("from shop " + producer.getName() + " with the total amount " + producer.specificOrderIncom(user, producer, ordersBasket) + " pln" );
        return true;

    }

    public List<Order> allProducerOrdersProducts(Producer producer,OrdersBasket ordersBasket) {
        return ordersBasket.getOrders().stream()
                .filter(n -> n.getProducer().equals(producer))
                .collect(Collectors.toList());
    }
    public Double producerIncom(Producer producer, OrdersBasket ordersBasket) {
        return ordersBasket.getOrders().stream()
                .filter(u -> u.getProducer().equals(producer))
                .mapToDouble(Order::amountToPay)
                .sum();
    }
    public List<Order> specificOrdersProducts(User user, Producer producer, OrdersBasket ordersBasket) {
        return ordersBasket.getOrders().stream()
                .filter(p -> p.getUser().equals(user))
                .filter(n -> n.getProducer().equals(producer))
                .collect(Collectors.toList());


    }
    public Double specificOrderIncom(User user,Producer producer, OrdersBasket ordersBasket) {
        return ordersBasket.getOrders().stream()
                .filter(p -> p.getUser().equals(user))
                .filter(u -> u.getProducer().equals(producer))
                .mapToDouble(Order::amountToPay)
                .sum();
    }
    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producer)) return false;
        Producer producer = (Producer) o;
        return getName().equals(producer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
