package ImageHoster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//**************************************************************************
//Application Name:   ImageHosterApplication
//Created By:         upGrad
//Program Description:  Image Hoster Website let the users upload the images
// and put comments on other user's images after registering to Website.
//**************************************************************************
//Modification:
//Modified By:
//Date:
//Change Details:
//***************************************************************************

@SpringBootApplication
public class ImageHosterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImageHosterApplication.class, args);
    }
}
