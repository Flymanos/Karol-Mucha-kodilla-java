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
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDao(){
        //given
        Product product = new Product("Ziemniaki");
        Product product1 = new Product("Kurczaki");
        Product product2 = new Product("Kurczaki i ziemniaki");

        List<Item> items = new ArrayList<>();
        Item item = new Item(product, new BigDecimal(14), 14);
        Item item1 = new Item(product1, new BigDecimal(14), 14);
        Item item2 = new Item(product2, new BigDecimal(14), 14);
        items.add(item);
        items.add(item2);
        items.add(item1);

        Invoice invoice = new Invoice("ABS/14/14");
        items.stream().forEach(i -> i.setInvoice(invoice));
        invoice.setItems(items);
        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //then
        Assert.assertEquals(invoice.getItems().size(), invoiceDao.findOne(id).getItems().size());
        //cleanUP
        invoiceDao.delete(id);
    }
}
