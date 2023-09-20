/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class validate {
    public boolean validName(String name) {
        return name.matches("^[a-zA-Z\\s]*$");
    }
    
    public Date getValidDate(){
        while(true){
        
        
        }
    }
    
    public Date parseDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.parse(date);
    }
//----------------------------------------------------------

    public String formatDate(Date date) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(date);
    }
//-----------------------------------------------------------
    public boolean validDate(String dob) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            Date dateFormat = df.parse(dob);
            Calendar calendar = Calendar.getInstance();
            calendar.setLenient(false);
            calendar.setTime(dateFormat);
            
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            
            if (year > 2023) {
                return false;
            }

            if (month == 2) {
                return validFebrary(day, year);
                
            }else {
                return validMonth(day, month);
            }

        } catch (ParseException e) {
            return false;
        }
    }
//-----------------------------------------------------------
    public boolean validMonth(int day, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                return day >= 1 && day <= 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return day >= 1 && day <= 30;
            default:
                return false;

        }
    }
//-----------------------------------------------------------
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 == 0) || (year % 400 == 0);

    }
//-----------------------------------------------------------
    public boolean validFebrary(int day, int year) {
        if (isLeapYear(year)) {
            return day >= 1 && day <= 29;

        } else {
            return day >= 1 && day <= 28;
        }

    }
//-----------------------------------------------------------
}
