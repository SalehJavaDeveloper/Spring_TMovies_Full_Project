package com.movies.tMovies.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class StoreOTP {
    private static int otp;

    public static int getOtp() {
        return otp;
    }

    public static void setOtp(int otp) {
        StoreOTP.otp = otp;
    }
}
