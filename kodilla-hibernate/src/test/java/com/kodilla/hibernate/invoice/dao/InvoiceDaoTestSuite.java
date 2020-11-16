package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given

        Product product = new Product("Tofu");
        Product product1 = new Product("Yoghurt");
        Product product2 = new Product("Ananas");
        Product product3 = new Product("Frozen Pizza");
        Product product4 = new Product("Good Beer");
        Product product5 = new Product("Mars Bar");
        Product product6 = new Product("Millet");
        Product product7 = new Product("Peanut Butter");
        Product product8 = new Product("Strong Vodka");
        Product product9 = new Product("Grapefruit");

        Invoice invoice = new Invoice("1/1/2020");
        Invoice invoice1 = new Invoice("2/1/2020");
        Invoice invoice2 = new Invoice("1/2/2020");
        Invoice invoice3 = new Invoice("2/2/2020");
        Invoice invoice4 = new Invoice("3/2/2020");
        Invoice invoice5 = new Invoice("4/2/2020");
        Invoice invoice6 = new Invoice("5/2/2020");
        Invoice invoice7 = new Invoice("6/2/2020");
        Invoice invoice8 = new Invoice("7/2/2020");
        Invoice invoice9 = new Invoice("8/2/2020");

        Item item = new Item(new BigDecimal(3.99), 100);
        Item item1 = new Item(new BigDecimal(9.99), 200);
        Item item2 = new Item(new BigDecimal(3.99), 500);
        Item item3 = new Item(new BigDecimal(9.99), 100);
        Item item4 = new Item(new BigDecimal(2.99), 1000);
        Item item5 = new Item(new BigDecimal(5.99), 6000);
        Item item6 = new Item(new BigDecimal(5.99), 100);
        Item item7 = new Item(new BigDecimal(7.99), 70);
        Item item8 = new Item(new BigDecimal(12.00), 100);
        Item item9 = new Item(new BigDecimal(25.99), 150);


        item.setProduct(product);
        item.setValue(item.ValueOfItem());
        item.setInvoice(invoice);
        invoice.getItems().add(item);

        item1.setProduct(product3);
        item1.setValue(item1.ValueOfItem());
        item1.setInvoice(invoice);
        invoice.getItems().add(item1);

        item2.setProduct(product5);
        item2.setValue(item2.ValueOfItem());
        item2.setInvoice(invoice);
        invoice.getItems().add(item2);


        item3.setProduct(product1);
        item3.setValue(item3.ValueOfItem());
        item3.setInvoice(invoice1);
        invoice1.getItems().add(item3);


        item4.setProduct(product7);
        item4.setValue(item4.ValueOfItem());
        item4.setInvoice(invoice1);
        invoice1.getItems().add(item4);


        item5.setProduct(product2);
        item5.setValue(item5.ValueOfItem());
        item5.setInvoice(invoice1);
        invoice1.getItems().add(item5);


        item6.setProduct(product4);
        item6.setValue(item6.ValueOfItem());
        item6.setInvoice(invoice2);
        invoice2.getItems().add(item6);


        item7.setProduct(product6);
        item7.setValue(item7.ValueOfItem());
        item7.setInvoice(invoice7);
        invoice7.getItems().add(item7);


        item8.setProduct(product8);
        item8.setValue(item8.ValueOfItem());
        item8.setInvoice(invoice3);
        invoice3.getItems().add(item8);


        item9.setProduct(product9);
        item9.setValue(item9.ValueOfItem());
        item9.setInvoice(invoice3);
        invoice3.getItems().add(item9);


        //When

        invoiceDao.save(invoice);
        int id = invoice.getId();
        invoiceDao.save(invoice1);
        int id1 = invoice1.getId();
        invoiceDao.save(invoice2);
        int id2 = invoice2.getId();
        invoiceDao.save(invoice3);
        int id3 = invoice3.getId();
        invoiceDao.save(invoice7);
        int id7 = invoice7.getId();

        Invoice result = invoiceDao.findById(id1);
        List<String> ananasList = result.getItems().stream()
                .map(Item::getProduct)
                .map(Product::getName)
                .filter(n -> n.equals("Ananas"))
                .collect(Collectors.toList());
        //Then

        Assert.assertNotEquals(0, id);
        Assert.assertNotEquals(0, id1);
        Assert.assertNotEquals(0, id2);
        Assert.assertNotEquals(0, id3);
        Assert.assertNotEquals(0, id7);

        Assert.assertEquals("Ananas", ananasList.get(0));

        //CleanUp

        invoiceDao.deleteById(id);
        invoiceDao.deleteById(id1);
        invoiceDao.deleteById(id2);
        invoiceDao.deleteById(id3);
        invoiceDao.deleteById(id7);


    }

}
