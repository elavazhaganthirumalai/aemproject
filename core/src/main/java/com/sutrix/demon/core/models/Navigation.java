package com.sutrix.demon.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Navigation {
    @ChildResource
    private String name;
    @ChildResource
    private MultifieldModel multifieldModel;

    public String getName() {
        return name;
    }

    public MultifieldModel getMultifieldModel() {
        return multifieldModel;
    }
}
