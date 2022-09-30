package com.folksdev.account.dto

import com.folksdev.account.model.Transaction
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransactionDto(
        val id: String?,
        val transactionType: Transaction.TransactionType?= Transaction.TransactionType.INITIAL,
        val amount: BigDecimal?,
        val transactionDate: LocalDateTime?

        ) {

}
