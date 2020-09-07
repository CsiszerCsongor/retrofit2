package com.example.retrofit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    @Override
    public String toString(){
        return    "User [id= " + id + ", "
                + "first_name= " + first_name + ", "
                + "last_name= " + last_name + ", "
                + "email= " + email + "" + " , "
                + "avatar= " + avatar +  "]";
    }
}
