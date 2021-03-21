package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("1");
        Product product1 = new Product("Keyboard");
        Product product2 = new Product("Mouse");
        Item item1 = new Item(new BigDecimal(100), 1, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(20), 2, new BigDecimal(40));
        item1.setProduct(product1);
        item2.setProduct(product2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //Cleanup
        invoiceDao.deleteById(invoiceId);
    }
}
