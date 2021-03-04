package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import java.time.format.DateTimeFormatter;

public class MemberPrinter {

    private DateTimeFormatter dateTimeFormatter;

    public MemberPrinter() {
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
    }

    public void print(Member member) {
        if (dateTimeFormatter == null) {
            System.out.printf("회원 정보 : 아이디 = %d, 이메일 = %s, 등록일 = %tF\n",
                    member.getId(),member.getEmail(),member.getRegisterDateTime());
        }else{
            System.out.printf("회원 정보 : 아이디 = %d, 이메일 = %s, 등록일 = %s\n",
                    member.getId(),member.getEmail(),dateTimeFormatter.format(member.getRegisterDateTime()));
        }
    }

    @Autowired
    public void setDateTimeFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }
}
