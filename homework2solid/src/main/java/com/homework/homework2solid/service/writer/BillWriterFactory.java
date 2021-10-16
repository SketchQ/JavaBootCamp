package com.homework.homework2solid.service.writer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.homework.homework2solid.model.enums.BillWriterType;

import org.springframework.stereotype.Service;

@Service
public class BillWriterFactory {
    private final Map<BillWriterType, BillWriter> billWriterMap;

    public BillWriterFactory(List<BillWriter> billWriters){
        this.billWriterMap = billWriters.stream()
                .collect(Collectors.toMap(BillWriter::getType, BillWriter -> BillWriter));
    }

    public BillWriter gBillWriter(BillWriterType type){
        return billWriterMap.get(type);
    }
}
