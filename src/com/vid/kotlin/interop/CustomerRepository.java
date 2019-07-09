package com.vid.kotlin.interop;

import com.vid.kotlin.classes.CustomerJava;

import java.util.List;

public interface CustomerRepository {

    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
