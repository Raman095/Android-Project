package Android.App.AndroidTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "Android.App.AndroidTutorial")
@EnableAutoConfiguration
public class AndroidTutorialApplication {

	public static void main(String[] args)
    {
		SpringApplication.run(AndroidTutorialApplication.class, args);
	}

}