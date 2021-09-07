package my;

import org.springframework.web.bind.annotation.*;

@RestController
public class myc 
{  
@RequestMapping("/")  
 public String hello()   
		{  
		return "Hello javaTpoint";  
		}  
}  
