package com.kodilla.good.patterns.challenges.food2door;

public class BuyingProcessor {

    public InformService informService;
    public Producer producer;
    public ShopingRepo shopingRepo;


    public BuyingProcessor(InformService informService, Producer producer, ShopingRepo shopingRepo) {
        this.informService = informService;
        this.producer = producer;
        this.shopingRepo = shopingRepo;
    }


    public BuyingDto buyingProcess(User user,Producer producer,OrdersBasket ordersBasket) {
        Boolean acceptedShoping = producer.process(user, producer,ordersBasket);
        if (acceptedShoping) {
            informService.inform(user);
            shopingRepo.createdRepo();

            return new BuyingDto(user, true);
        } else
            return new BuyingDto(user, false);

    }


}
