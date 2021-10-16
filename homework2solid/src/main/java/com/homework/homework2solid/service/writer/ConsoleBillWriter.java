package com.homework.homework2solid.service.writer;

import com.homework.homework2solid.model.checkout.Bill;
import com.homework.homework2solid.model.enums.BillWriterType;

import org.springframework.stereotype.Component;

@Component
public class ConsoleBillWriter implements BillWriter {

    @Override
    public BillWriterType getType(){
        return BillWriterType.CONSOLE;
    }
    

    @Override
    public void printBill(Bill bill){
        System.out.println("Product name" + "\t" + 
                    "SellerName" + "\t" + 
                    "Quantity" + "\t" + 
                    "Price" + "\t" + 
                    "Discounted Price" );
        bill.getBillItems().forEach(BillItem -> {
            System.out.println(BillItem.getProductName() + "\t" +
                            BillItem.getSellerName() + "\t" +
                            BillItem.getQuantity() + "\t" +
                            BillItem.getPrice() + "\t" +
                            BillItem.getDiscountedprice());
        }); 
        System.out.println("Total Price: " + bill.getTotalPrice());
    }
}
