package rr.msvehicle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/vehicle")
public class controller {

    @Autowired
    Vehicleservice vehicleservice;

  //  @Autowired
  //  private DiscoveryClient discoveryservice;



    // define the details for the vehicle

    @GetMapping("/fetch")
    public String currenttrackedvehicledetails(){

        String vehicledetails = vehicleservice.getvehcicledetails();
        System.out.println(vehicledetails);
        return vehicledetails;
    }

}
