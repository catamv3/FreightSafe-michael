package com.example.freightsafe;

public interface DriverQualifications {
       public int checkHours();
       public boolean checkCredentials();
       public boolean checkAge();
       public void addDriver(Driver d);
       public Driver removeDriver();



}
