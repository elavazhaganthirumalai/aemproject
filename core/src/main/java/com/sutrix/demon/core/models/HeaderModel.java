package com.sutrix.demon.core.models;

import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.sutrix.demon.core.bean.HeaderBean;
import org.apache.sling.api.resource.ValueMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeaderModel extends WCMUsePojo {
    ValueMap properties;
    PageManager pageManager;

    @Override
    public void activate() throws Exception {
        properties=getProperties();
        pageManager=getPageManager();

    }
    public String getLogoImagePath(){
        String logoImagePath=properties.get("logopath","");
        return logoImagePath;
    }
    public List<HeaderBean> getHeaderLinks(){
        List<HeaderBean> headerBeanList=new ArrayList<>();
        String parentPagePath=properties.get("parentpagepath","");
        if (parentPagePath!=null||!parentPagePath.equalsIgnoreCase("")){
            Page page=pageManager.getPage(parentPagePath);
            if (page!=null){
                Iterator<Page> listChildren=page.listChildren();
                while (listChildren.hasNext()){
                    Page nextPage=listChildren.next();
                    HeaderBean headerBean=new HeaderBean();
                    headerBean.setLinkLabel(nextPage.getTitle());
                    headerBean.setLinkPath(nextPage.getPath()+".html");
                    headerBeanList.add(headerBean);
                }
            }
        }
        return headerBeanList;
    }
}
