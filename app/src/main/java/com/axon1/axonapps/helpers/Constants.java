package com.axon1.axonapps.helpers;

import org.jetbrains.annotations.NotNull;

public final class Constants {
    @NotNull
    public static final String Domain_Url = "https://axontest.axon1.com/";
    public static final Constants INSTANCE = new Constants();
    public static final int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 1001;
    public static final int PERMISSIONS_REQUEST_ACCESS_COARSE_LOCATION = 100;
    public static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 99;
    public static final int PLACE_PICKER_REQUEST = 1;
    public static final int PICK_IMAGE_REQUEST = 3;
    public static final int MY_CAMERA_REQUEST_CODE = 4;
    public static final int Google_SIGN_IN = 5;
    public static final int SPLASH_Logo_Duration = 3000;
    public static final int SPLASH_Slid_Duration = 2000;
    public static final long SPLASH_TIME_OUT = 3000;
    public static final Long Services_connectTimeout = 180L;
    public static final Long Services_readTimeout = 60L;
    @NotNull
    public static final String Registration_Device = "Registration_Device";
    @NotNull
    public static final String User_AccessToken = "User_AccessToken";
    @NotNull
    public static final String User_Id = "User_Id";
    @NotNull
    public static final String User_RoleName = "User_RoleName";
    @NotNull
    public static final String app_lang = "app_lang";

}
