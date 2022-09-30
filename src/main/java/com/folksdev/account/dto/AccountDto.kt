package com.folksdev.account.dto

import com.folksdev.account.model.Customer
import com.folksdev.account.model.Transaction
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
        val id: String?,
        val balance: BigDecimal?,
        val creationDate: LocalDateTime?,
        val customer: AccountCustomerDto?,
        val transactions: Set<TransactionDto>?

        )