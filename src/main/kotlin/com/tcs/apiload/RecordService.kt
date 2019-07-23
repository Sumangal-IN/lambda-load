package com.tcs.apiload

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RecordService (private val recordRepository:RecordRepository){

    fun getRecords(): MutableIterable<Record> {
        return recordRepository.findAll()
    }

    fun createRecord(number: Int, value: String): Unit {
        recordRepository.save(Record(id=number,content=value))
    }

}