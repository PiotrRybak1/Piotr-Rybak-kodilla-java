package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Application {


    public static void main(String[] args) {

OrdersDataRetriever ordersDataRetriever = new OrdersDataRetriever();
OrdersData data = ordersDataRetriever.retrive();


BuyingProcessor buyingProcessor = new BuyingProcessor( new Communicant(), data.getProducer(),new Repo());
BuyingDto transaction = buyingProcessor.buyingProcess(data.getUser(),data.getProducer(), data.getOrdersBasket());
System.out.println(transaction.getUser() +" "+ transaction.acceptedShoping);

System.out.println();

Double UserTotalAmountToPay = data.getUser().TotalAmountToPay(data.getUser(), data.getOrdersBasket());
System.out.println( data.getUser().getName() + " total amount to pay for his online shopping equals "+ UserTotalAmountToPay + " pln");
List<String> usersProducts = data.getUser().userOrdersProducts(data.getUser(), data.getOrdersBasket());
System.out.println("Number of all orders " + data.getUser().getName() + " is " + usersProducts.size() + ". \nThese orders are:");
usersProducts.stream().forEach(System.out :: println);

System.out.println();
Double producerIncomAll = data.getProducer().producerIncom(data.getProducer(), data.getOrdersBasket());
System.out.println( data.getProducer().getName() + " total incom for all orders - " +  producerIncomAll + " pln");
List<Order> producerAllOrdersHisProducts = data.getProducer().allProducerOrdersProducts(data.getProducer(), data.getOrdersBasket());
        System.out.println("Number of all orders from " + data.getProducer().getName() + " is " + producerAllOrdersHisProducts.size() + ". \nThese orders are:");
        producerAllOrdersHisProducts.stream()
                .map(Order::getProduct)
                .map(Product::getProductName)
                .forEach(System.out :: println);


    }
}
