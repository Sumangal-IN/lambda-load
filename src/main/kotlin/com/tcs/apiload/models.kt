package com.tcs.apiload

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Record(
        @Id var id: Int,
        var content: String)

