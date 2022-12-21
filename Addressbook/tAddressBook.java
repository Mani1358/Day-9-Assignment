package com.blz.Addressbook;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.*;

import java.util.Date;

public class tAddressBook {
        private static int totalNumber;

        public static int getTotal() {

            //Returns total number of employees
            return totalNumber;
        }

        private Date lastModified;
        private String fullname;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String phone;


        public tAddressBook() {
            super();
        }

        public tAddressBook(String fullname, String address, String city, String state, String zip, String phone) {
            this.fullname = fullname;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phone = phone;


        }


        public Date getLastModified() {

            return lastModified;
        }

        public void setLastModified(int month, int day, int year) {
            month = 00;
            day = 00;
            year = 0000;
            return;
        }
        public String getFullname() {
            return fullname;
        }
        public void setFullname(String fullname) {
            this.fullname = fullname;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        public String getZip() {
            return zip;
        }
        public void setZip(String zip) {
            this.zip = zip;
        }
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }


        @Override
        public String toString() {
            return "Employee [name=" + this.fullname + ", Address=" + this.address + ", City="
                    + this.city + ", state=" + this.state + ", zip=" + this.zip
                    + ", phone=" + this.phone + "]";
        }

    }

