package com.miki.json;

import java.util.List;
import java.util.Map;

/**
 * Created by Miki on 02.03.2017.
 */
public class UserBuilder {

    private User user = new User();


    public UserBuilder withFirstName(String firstName){
        user.setFirstName(firstName);
        return this;
    }
    public UserBuilder withLastName(String lastName){
        user.setLastName(lastName);
        return this;
    }
    public UserBuilder withAddress(Map<String,Address> address){
        user.setAddresses(address);
        return this;
    }
    public UserBuilder withAddress(String addressName, Address address){
        user.getAddresses().put(addressName,address);
        return this;
    }

        public UserBuilder withChildren(List<String> children){
        user.setChildrenNames(children);
        return this;
    }

    public UserBuilder withChildren(String children){
        user.getChildrenNames().add(children);
        return this;
    }

    public User build()
    {
        return user;
    }

}
