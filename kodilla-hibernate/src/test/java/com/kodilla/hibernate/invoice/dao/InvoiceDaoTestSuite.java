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
        List<Item> items = new ArrayList<>();
        items.add(new Item(new Product("Ziemniaki"), new BigDecimal(10), 14, new BigDecimal(140)));
        items.add(new Item(new Product("Kurczaki"), new BigDecimal(10), 14, new BigDecimal(140)));
        items.add(new Item(new Product("Kapusta"), new BigDecimal(10), 14, new BigDecimal(140)));

        Invoice invoice = new Invoice("ABC/12/12", items);
        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();
        Invoice result = invoiceDao.findOne(id);
        //then
        Assert.assertEquals(invoice.getItems().size(), result.getItems().size());
        //cleanUp
        invoiceDao.delete(id);
    }
}
