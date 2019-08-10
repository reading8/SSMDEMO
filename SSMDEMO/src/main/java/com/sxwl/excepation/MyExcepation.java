package com.sxwl.excepation;

public class MyExcepation extends  RuntimeException {
    public MyExcepation() {
        super();
    }

    public MyExcepation(String message) {
        super(message);
    }

    public MyExcepation(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExcepation(Throwable cause) {
        super(cause);
    }

    protected MyExcepation(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
