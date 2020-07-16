package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new Information(),new ProductOrderService(), new RepositoryCreator());
        OrderDto orderDto = productOrderProcessor.process(orderRequest);
        System.out.println(orderDto);


    }
}
