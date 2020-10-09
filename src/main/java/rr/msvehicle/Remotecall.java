package rr.msvehicle;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="fleetman-tracker", url="http://miniposra:8888")
public interface Remotecall {

        @RequestMapping(method= RequestMethod.GET, value="/position/fetch/vehicle")
        public String getlatestvehicledetail();

}
