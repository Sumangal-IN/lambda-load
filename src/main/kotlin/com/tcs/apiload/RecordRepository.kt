package com.tcs.apiload

import org.springframework.data.repository.CrudRepository

interface RecordRepository : CrudRepository<Record, Long> {

}