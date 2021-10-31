package com.example.rentalapartmentapp.Services;

import com.example.rentalapartmentapp.Model.Property;
import com.example.rentalapartmentapp.View.Activities.AddPropertyActivity;

public interface DAO {
    void addPropertyToDatabase(Property property);
    void showAllProperties();
    void deleteProperty(Property property);
}
