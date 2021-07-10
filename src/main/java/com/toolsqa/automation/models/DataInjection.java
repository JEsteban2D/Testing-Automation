package com.toolsqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Date;
import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String name, lastName, email, mobileNumber, birthday, subjects, Picture, currentAddress, state,  city, filepath, sheetName,

    extensionAddress, extensionEmail, extensionMobile, validationsSheetName;

    public String getName() { return name;
    }

    public String getLastName() { return lastName;
    }

    public String getEmail() { return email;
    }

    public String getMobileNumber() { return mobileNumber;
    }

    public String getGender() { return name;
    }

    public String getBirthday() { return birthday;
    }

    public String getCurrentAddress() { return currentAddress;
    }

    public String getUploadPicture() { return Picture;
    }

    public String getState() { return state;
    }

    public String getCity() { return city;
    }

    public String getFilepath() { return filepath;
    }

    public String getSheetName() { return sheetName;
    }

    /*--------------------------EXTENSION-------------------------------*/


    public String getExtensionAddress() {
        return extensionAddress;
    }
    public String getExtensionEmail() {
        return extensionEmail;
    }
    public String getExtensionMobile() {
        return extensionMobile;
    }

    public String getValidationsSheetName() {
        return validationsSheetName;
    }



    public DataInjection(){

        this.name = faker.name().name();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.mobileNumber = faker.numerify("##########");
        this.birthday = "Sep 1993";
        this.subjects = "Maths";
        this.Picture = "C:\\Users\\Usuario\\Desktop\\testing.jpg";
        this.currentAddress = faker.address().fullAddress();
        this.state = "Haryana";
        this.city = "Panipat";
        this.filepath = "resources/Data_Injection.xlsx";
        this.sheetName = "DataInjection";

        /*--------------------------EXTENSION-------------------------------*/


        this.extensionAddress = "";
        this.extensionEmail = "";
        this.extensionMobile = "";
        this.validationsSheetName = "Validations";
    }
}
