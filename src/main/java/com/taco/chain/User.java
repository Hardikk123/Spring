package com.taco.chain;
 
import lombok.Data;
import lombok.RequiredArgsConstructor; 


@Data
@RequiredArgsConstructor
public class User {

    private int id; 
    private String name; 
    private String type; 
}
