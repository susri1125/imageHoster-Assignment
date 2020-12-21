package ImageHoster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//****************************************************************************
//Application Name:   ImageHosterApplication
//Created By:         upGrad
//Program Description:  Image Hoster Website let the users upload the images
// and put comments on other user's images after registering to Website.
//****************************************************************************
//Modification: Issue#1 - Fixed the issue related to error occurred while
//                        navigating the two imgaes with same title.
//Modified By:            Sunil Srivastava
//Date:                   18/12/2020
//****************************************************************************
//Modification: Issue#2 - Fixed the issue related to edit/delete the images.
//                        Only Owner of the image should be allowed to do the
//                        changes else show the appropriate message on screen
//Modified By:            Sunil Srivastava
//Date:                   21/12/2020
//****************************************************************************
//Modification: New Feature#1 - Password Strength : Validate  password entered
//                              by the user must contain at least 1 alphabet
//                              (a-z or A-Z), 1 number (0-9) and 1 special
//                              character (any character other than a-z, A-Z
//                              and 0-9).
//Modified By:                  Sunil Srivastava
//Date:                         21/12/2020
//****************************************************************************
//Modification: New Feature#2 - Comments : Add comment box where a user can
//                              add a comment to any image in the application
//                              after he is logged in the application
//Modified By:                  Sunil Srivastava
//Date:                         21/12/2020
//****************************************************************************
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class ImageHosterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImageHosterApplication.class, args);
    }
}
