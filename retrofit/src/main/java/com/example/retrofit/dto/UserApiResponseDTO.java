package com.example.retrofit.dto;

import com.example.retrofit.entity.Ad;
import com.example.retrofit.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserApiResponseDTO {
    private User data;
    private Ad ad;

    @Override
    public String toString(){
        return "data = [" + data + "] <br/> \n" + "ad = [" + ad + "]";
    }
}
