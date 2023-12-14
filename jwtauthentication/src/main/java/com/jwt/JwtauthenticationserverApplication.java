package com.jwt;

//import com.jwt.model.User;
//import com.jwt.repo.UserRepository;
//import com.jwt.services.UserService;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Random;

@SpringBootApplication
public class JwtauthenticationserverApplication implements  CommandLineRunner  {

//    @Autowired
//    private UserRepository userRepository;
//    
//    @Autowired
//    private UserService userService;

    Random random = new Random();

    

    public static void main(String[] args) {
        SpringApplication.run(JwtauthenticationserverApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
//    	 User user = new User();
//         Long id = new Long(random.nextInt(100));
//         user.setId(id);
//         user.setEmail("pritesh@.com");
//         user.setPassword("pritesh123");
//         user.setFirstName("Pritesh");
//         user.setLastName("Patil");
//         
//         user.setRol("Admin");
//         user.setUsername("pritesh123");
//         
//        user= this.userService.createUser(user);
//
//         System.out.println(user);
         
    }
    
    @Bean
    public WebMvcConfigurer configure() {
    	return new WebMvcConfigurer() {
    		
    		
			public void addCorsMapping(CorsRegistry reg) {
    			reg.addMapping("/*").allowedOrigins("*");
    		}
    	};
    	
    }
}
