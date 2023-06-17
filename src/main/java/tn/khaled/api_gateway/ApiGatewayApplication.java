package tn.khaled.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
//@EnableWebSecurity
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
//	@Bean
//	public RouteLocator configureRoute(RouteLocatorBuilder builder) {
//		return builder.routes()
//				//route("paymentId", r->r.path("/payment/**").uri("http://localhost:9009")) //static routing
//				.route("MSSTOCK", r->r.path("**/msStock/**").uri("lb://MSSTOCK")) //dynamic routing"))
//				.route("MSARTICLE", r->r.path("**/msArticle/**").uri("lb://MSARTICLE")) //dynamic routing"))
//				.build();
//	}


}
