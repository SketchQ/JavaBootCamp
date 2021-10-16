package com.homework.homework2solid.service.writer;

import com.homework.homework2solid.model.checkout.Bill;
import com.homework.homework2solid.model.enums.BillWriterType;

public interface BillWriter {
    BillWriterType getType();
    void printBill(Bill bill);
}
