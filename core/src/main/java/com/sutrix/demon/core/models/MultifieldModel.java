package com.sutrix.demon.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables =  Resource.class ,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultifieldModel{
    @ChildResource
    private String textField;


    public String getTextField() {
        return textField;
    }
}

