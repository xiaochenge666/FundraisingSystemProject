package com.crowd.mvc.interceptor;

import com.crowd.constant.CrowdConstant;
import com.crowd.entity.Admin;
import com.crowd.exception.AccessForbiddenException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession=request.getSession();
        Admin user = (Admin) httpSession.getAttribute(CrowdConstant.ATTR_NAME_LOGIN_ADMIN);
        if(user==null){
            throw new AccessForbiddenException(CrowdConstant.MESSAGE_NOACCESSPERMISION);
        }

        return true;
    }
}
