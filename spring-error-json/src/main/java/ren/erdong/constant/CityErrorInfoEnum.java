package ren.erdong.constant;


import ren.erdong.result.ErrorInfoInterface;

/**
 * 业务错误码 案例
 */
public enum CityErrorInfoEnum implements ErrorInfoInterface {
    PARAMS_NO_COMPLETE("-1","params not complete"),
    CITY_EXIT("0","city exit");

    private String code;

    private String message;

    CityErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }
}
