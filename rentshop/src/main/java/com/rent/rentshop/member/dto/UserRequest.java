package com.rent.rentshop.member.dto;

import com.rent.rentshop.member.domain.Address;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserRequest {

    @NotEmpty(message = "아이디는 필수입니다.")
    private String userId;
    @NotEmpty(message = "패스워드는 필수입니다.")
    private String password;
    @NotEmpty(message = "이름은 필수입니다.")
    private String userName;
    @NotEmpty(message = "이메일은 필수입니다.")
    private String userEmail;
    @NotEmpty(message = "휴대폰 번호는 필수입니다.")
    private String userPhone;
    @NotEmpty(message = "도로명 주소는 필수입니다.")
    private String roadAddress;
    @NotEmpty(message = "상세 주소는 필수입니다.")
    private String detailAddress;

    private String userBirth;

    @Builder
    public UserRequest(String userId, String password, String userName, String userEmail, String userPhone, String roadAddress, String detailAddress, String userBirth) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.roadAddress = roadAddress;
        this.detailAddress = detailAddress;
        this.userBirth = userBirth;
    }

}