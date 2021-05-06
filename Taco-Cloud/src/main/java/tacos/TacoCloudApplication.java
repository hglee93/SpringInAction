package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {
    /*
    * TacoCloudApplication : 부트스트랩 클래스
    * -> 부트스트랩은 어플리케이션을 실행(Boot)하는 클래스
    * -> 세 개의 어노테이션이 결합
    * 1) SpringBootConfiguration
    * 2) EnableAutoConfiguration : 구성 파일을 자동으로 인식
    * 3) ComponentScan : @Component, @Controller, @Service 등의 클래스를 찾아서 스프링 어플리케이션 컨텍스트에 등록해줌
    * */

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
