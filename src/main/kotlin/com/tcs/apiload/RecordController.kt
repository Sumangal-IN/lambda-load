package com.tcs.apiload

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class RecordController (private val recordService:RecordService){

	@GetMapping("/records")
	fun getRecords() = recordService.getRecords()

	@PostMapping("/records/{number}/{value}")
	fun createRecord(@PathVariable("number") number:Int, @PathVariable("value") value:String)
			=recordService.createRecord(number,value)

}