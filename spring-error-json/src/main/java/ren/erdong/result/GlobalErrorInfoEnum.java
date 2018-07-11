package ren.erdong.result;

/**
 * 应用系统级别的错误码
 */
public enum GlobalErrorInfoEnum implements ErrorInfoInterface{
    SUCCESS("1", "success"),
    NOT_FOUND("-1", "service not found");

    private String code;

    private String message;

    GlobalErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode(){
        return this.code;
    }

    @Override
    public String getMessage(){
        return this.message;
    }
}
