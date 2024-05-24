package com.wipro.Propertysale.model;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "propertyinfo")
public class PropertyInfo {
    @Id
    public int id;
    public String propertyholdername;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String email;
    public String phone;
    public String propertytype;
    public String propertyvalue;
    public String propertydescription;
    public String propertyimage;
    public String status;
    public Date createddate;
    public Date updateddate;
    public String createdby;
    public String updatedby;
    public String propertyid;
    public String  registerunder;


}
