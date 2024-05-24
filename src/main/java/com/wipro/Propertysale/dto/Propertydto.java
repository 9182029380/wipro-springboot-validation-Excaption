package com.wipro.Propertysale.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Propertydto {
    @NotNull(message = "Propertyholder name is required")
    public String propertyholdername;
    @NotBlank(message = "Address")
    public String address;
    public String city;
    @NotBlank(message = "Propertyholder")
    public String state;
    @Pattern(regexp = "^\\d{6}$", message = "Invalid zip code")
    public String zip;
    @Email
    public String email;
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    public String phone;
    @NotNull(message = "Property type is required")
    public String propertytype;
    @NotNull(message = "Property value is required")
    public String propertyvalue;
    @NotNull(message = "Property description is required")
    public String propertydescription;
    @NotNull(message = "Property image is required")
    public String propertyimage;
    @NotNull(message = "Status is required")
    public String status;
    @NotNull(message = "Created date is required")
    public Date createddate;
    public Date updateddate;
    @NotNull(message = "Created by XX required")
    public String createdby;
    public String updatedby;
    @Pattern(regexp = "^\\d{4}$", message = "Invalid property id")
    public String propertyid;
    @NotNull(message = "Register under is required")
    public String  registerunder;
}
