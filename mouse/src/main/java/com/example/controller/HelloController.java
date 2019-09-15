package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
 * ClassName:HelloController <br/>  
 * Function:  <br/>  
 * Date:     2019年8月18日 下午11:55:56 <br/>       
 */
@RestController
@RequestMapping("/ni")
public class HelloController {
     @GetMapping("vi/hello")
     public String hello() {
            return "Hello World!";
        }
}
  
