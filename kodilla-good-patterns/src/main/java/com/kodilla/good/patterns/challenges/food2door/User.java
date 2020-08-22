package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class User {
    private String name;
    private String nickname;

    public User(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }


    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public Double TotalAmountToPay(User user,OrdersBasket ordersBasket) {
        return ordersBasket.getOrders().stream()
                .filter(u -> u.getUser().equals(user))
                .mapToDouble(Order::amountToPay)
                .sum();


    }
    public List<String> userOrdersProducts(User user,OrdersBasket ordersBasket) {
        return ordersBasket.getOrders().stream()
                .filter(p -> p.getUser().equals(user))
                .map(Order::getProduct)
                .map(Product::getProductName)
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + nickname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName()) &&
                Objects.equals(getNickname(), user.getNickname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNickname());
    }
}
