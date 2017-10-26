package com.iotrack.pushapi.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class PushController {

    private final static String listenport = "9201";   										//TCP listening port
    private final static String secret1 = "iotrack2017.";
    private final static String validator = "70fea303ce32b9ab2f7f8462a7341c66ab4e81a1";



    @RequestMapping(value = "/meraki" ,method= RequestMethod.GET )
    public ResponseEntity validate(){

        System.out.println("validation sending");

        ResponseEntity<String> responseEntity = new ResponseEntity<>(validator,HttpStatus.OK);

        return responseEntity;

    }

    @RequestMapping(value = "/meraki" ,method= RequestMethod.POST)
    public String getData(@RequestBody String appMac , String secret){


        if(secret==secret1){
            System.out.println(appMac);

            return appMac;
        }else{
            return "hata";
        }











    }





}
