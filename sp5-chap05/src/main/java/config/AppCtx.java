package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.*;

@Configuration
@ComponentScan(basePackages = {"spring"})
public class AppCtx {

//    @Bean
//    public MemberDao memberDao(){
//        return new MemberDao();
//    }
//
//    @Bean
//    public MemberRegisterService memberRegSvc(){
//        return new MemberRegisterService();
//    }
//
//    @Bean
//    public ChangePasswordService changePwdSvc(){
////        ChangePasswordService pwdSvc = new ChangePasswordService();
////        pwdSvc.setMemberDao(memberDao());
////        return pwdSvc;
//        return new ChangePasswordService();
//    }

//    @Bean
//    @Qualifier("printer")
//    public MemberPrinter memberPrinter1() {
//        return new MemberPrinter();
//    }

    @Bean
    public MemberSummaryPrinter memberPrinter2() {
        return new MemberSummaryPrinter();
    }

//    @Bean
//    public MemberListPrinter listPrinter() {
//        return new MemberListPrinter();
//    }

//    @Bean
//    public MemberInfoPrinter infoPrinter() {
//        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
////        infoPrinter.setMemberDao(memberDao());
////        infoPrinter.setPrinter(memberPrinter());
//        return infoPrinter;
//    }

    @Bean
    public VersionPrinter versionPrinter() {
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }

}
