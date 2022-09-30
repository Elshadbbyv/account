package com.folksdev.account.dto;

import com.folksdev.account.model.Customer;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CustomerDtoConverter {
    public AccountCustomerDto converterToAccountCustomer(Customer from){
        if (from == null){
            return new AccountCustomerDto("","","");
        }
        return new AccountCustomerDto(Objects.requireNonNull(from.getId()), from.getName(), from.getSurname());
    }

}
