package com.iotrack.pushapi.controller;



import com.iotrack.pushapi.domain.Body;
import com.iotrack.pushapi.domain.Deneme;
import com.iotrack.pushapi.service.DenemeService;
import com.iotrack.pushapi.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PushService pushService;

    @Autowired
    private DenemeService denemeService;




    @RequestMapping(value = "/meraki" ,method= RequestMethod.GET )
    public ResponseEntity validate(){

        System.out.println("validation sending");

        Deneme deneme=new Deneme();
        deneme.setId("1");
        deneme.setName("fatih");

        this.denemeService.addDeneme(deneme);

        ResponseEntity<String> responseEntity = new ResponseEntity<>(validator,HttpStatus.OK);

        return responseEntity;

    }

    @RequestMapping(value = "/meraki" ,method= RequestMethod.POST)
    public ResponseEntity getData(@RequestBody Body body){

        System.out.println(body.getSecret());
        System.out.println(secret1);
        System.out.println(body.getData());


            if(body.getSecret().toString().equals(secret1)){

                System.out.println(body.getVersion());
                System.out.println(body.getType());
                System.out.println(body.getSecret());

                this.pushService.addBody(body);

                return new  ResponseEntity(body.toString() ,HttpStatus.OK );
            }else{
                return new  ResponseEntity("Şifre yanlış" ,HttpStatus.BAD_REQUEST );
            }





    }





}
