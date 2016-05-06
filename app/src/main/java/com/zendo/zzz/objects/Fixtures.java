package com.zendo.zzz.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean on 03/05/2016.
 */
public class Fixtures {

    public List<Ad> getExampleAds() {
        List<Ad> output = new ArrayList<Ad>();
        output.add(new Ad(10, "Bob", "Household", "Cleaning", 20.0, "Cleaning your house"));
        output.add(new Ad(20, "Bob", "Car", "Repair", 200.0, "Engine repairs"));
        output.add(new Ad(30, "Lisa", "Beauty", "Manicure", 100.0, "Nail painting"));
        return output;
    }

    public List<User> getExampleUsers() {
        List<User> output = new ArrayList<User>();
        output.add(new User("Bob", "@mipmap/ic_user_male3", "My name is Bob"));
        output.add(new User("Lisa", "@mipmap/ic_user_female3", "My name is Lisa"));
        return output;
    }
}

