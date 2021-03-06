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

package com.wavemaker.runtime.data.sample.db2sampledb;

// Generated Feb 7, 2008 1:47:51 PM by Hibernate Tools 3.2.0.CR1

import java.sql.Clob;

/**
 * EmpResume generated by hbm2java
 */
@SuppressWarnings({ "serial" })
public class EmpResume implements java.io.Serializable {

    private EmpResumeId id;

    private Employee employee;

    private Clob resume;

    public EmpResume() {
    }

    public EmpResume(EmpResumeId id, Employee employee) {
        this.id = id;
        this.employee = employee;
    }

    public EmpResume(EmpResumeId id, Employee employee, Clob resume) {
        this.id = id;
        this.employee = employee;
        this.resume = resume;
    }

    public EmpResumeId getId() {
        return this.id;
    }

    public void setId(EmpResumeId id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Clob getResume() {
        return this.resume;
    }

    public void setResume(Clob resume) {
        this.resume = resume;
    }

}
