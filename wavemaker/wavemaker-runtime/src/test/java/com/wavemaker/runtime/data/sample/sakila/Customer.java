/*
 *  Copyright (C) 2009 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wavemaker.runtime.data.sample.sakila;

// Generated Jul 5, 2007 6:21:54 PM by Hibernate Tools 3.2.0.b9

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
@SuppressWarnings({ "serial", "unchecked" })
public class Customer implements java.io.Serializable {

    private Short customerId;

    private Address address;

    private Store store;

    private String firstName;

    private String lastName;

    private String email;

    private boolean active;

    private Date createDate;

    private Date lastUpdate;

    private Set payments = new HashSet(0);

    private Set rentals = new HashSet(0);

    public Customer() {
    }

    public Customer(Address address, Store store, String firstName, String lastName, boolean active, Date createDate, Date lastUpdate) {
        this.address = address;
        this.store = store;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
    }

    public Customer(Address address, Store store, String firstName, String lastName, String email, boolean active, Date createDate, Date lastUpdate,
        Set payments, Set rentals) {
        this.address = address;
        this.store = store;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.payments = payments;
        this.rentals = rentals;
    }

    public Short getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Store getStore() {
        return this.store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Set getPayments() {
        return this.payments;
    }

    public void setPayments(Set payments) {
        this.payments = payments;
    }

    public Set getRentals() {
        return this.rentals;
    }

    public void setRentals(Set rentals) {
        this.rentals = rentals;
    }

}
