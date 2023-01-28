package com.movies.tMovies.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TempOTP {
    private int otp;

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }
}
