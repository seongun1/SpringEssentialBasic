package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        // 어디서부터 찾는지 지정할 수 있다.
//        basePackages =  "hello.core.member",
//        basePackageClasses = AutoAppConfig.class,
        // 제외할 클래스를 추가
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    @Bean(name =  "memoryMemberRepository")
    MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

}
