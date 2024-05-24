package com.wipro.Propertysale.service;

import com.wipro.Propertysale.dto.Propertydto;
import com.wipro.Propertysale.model.PropertyInfo;
import com.wipro.Propertysale.repository.Propertyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private Propertyrepo repo;

    public PropertyInfo saveProperty(Propertydto dto) {
        PropertyInfo propertyInfo = new PropertyInfo();
        propertyInfo.setPropertyholdername(dto.getPropertyholdername());
        propertyInfo.setAddress(dto.getAddress());
        propertyInfo.setCity(dto.getCity());
        propertyInfo.setState(dto.getState());
        propertyInfo.setZip(dto.getZip());
        propertyInfo.setEmail(dto.getEmail());
        propertyInfo.setPhone(dto.getPhone());
        propertyInfo.setPropertytype(dto.getPropertytype());
        propertyInfo.setPropertyvalue(dto.getPropertyvalue());
        propertyInfo.setPropertydescription(dto.getPropertydescription());
        propertyInfo.setPropertyimage(dto.getPropertyimage());
        propertyInfo.setStatus(dto.getStatus());
        propertyInfo.setCreateddate(dto.getCreateddate());
        propertyInfo.setUpdateddate(dto.getUpdateddate());
        propertyInfo.setCreatedby(dto.getCreatedby());
        propertyInfo.setUpdatedby(dto.getUpdatedby());
        propertyInfo.setPropertyid(dto.getPropertyid());
        propertyInfo.setRegisterunder(dto.getRegisterunder());
        return repo.save(propertyInfo);
    }

    public List<PropertyInfo> getProperty() {
        return repo.findAll();

    }
}
