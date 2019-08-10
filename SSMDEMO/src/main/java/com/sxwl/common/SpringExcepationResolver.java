package com.sxwl.common;
import com.sxwl.excepation.MyExcepation;
import com.sxwl.excepation.ParamException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Slf4j
public class SpringExcepationResolver implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String url = httpServletRequest.getRequestURI().toString();
        ModelAndView mv = null;
        String defaultMsg="System error";
        //所有JSON数据请求以.JSON结尾
        if(url.endsWith(".json")){
            log.info(".json"+url+"==="+e);
            if(e instanceof MyExcepation || e instanceof ParamException){
               JsonData result= JsonData.fail(e.getMessage());
                mv=new ModelAndView("jsonView",result.toMap());
            }else{
                log.info("unknow .json"+url+"==="+e);
                JsonData result= JsonData.fail(defaultMsg);
                mv=new ModelAndView("jsonView",result.toMap());
            }
            //所有page页面请求以.page结尾
        }else if(url.endsWith(".page")){
            log.info(".page"+url+"==="+e);
            JsonData result= JsonData.fail(defaultMsg);
            mv=new ModelAndView("excepation",result.toMap());

        }else{

            log.info("unknow .page"+url+"==="+e);

            JsonData result= JsonData.fail(defaultMsg);
            mv=new ModelAndView("jsonView",result.toMap());
        }

        return mv;
    }
}

