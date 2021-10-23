package com.homework.homework2solid.service.writer;


import java.util.stream.Collectors;

import com.homework.homework2solid.model.checkout.Bill;
import com.homework.homework2solid.model.enums.BillWriterType;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FileBillWriter implements BillWriter {
    @Override
    public BillWriterType getType(){
        return BillWriterType.FILE;
    }

    @Override
    public void printBill(Bill bill){

        bill.getBillItems().stream() .map(billItem -> 
                                billItem.getProductName() + "\t" +
                                billItem.getSellerName() + "\t" +
                                billItem.getQuantity() + "\t" +
                                billItem.getPrice() + "\t" +
                                billItem.getDiscountedprice()
                    ).collect(Collectors.toList());
                    
        bill.getTotalPrice();
        System.out.println("FileWriter");
    }
    
}
