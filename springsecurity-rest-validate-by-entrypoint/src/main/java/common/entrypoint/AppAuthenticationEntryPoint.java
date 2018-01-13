package common.entrypoint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import common.util.ResponseUtil;

/**
 * @author <a href="mailto:psunil1278@gmail.com">Sunil Kumar</a>
 * @since 30/12/15
 */
public class AppAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

    private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();


    /**
     * Performs the redirect (or forward) to the login form URL.
     */
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {

    	//加上这一句就是开启http 基本认证,会弹出对验证对话框 
    	//response.addHeader("WWW-Authenticate", "Basic realm=" + getRealmName());
         response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
         //PrintWriter writer = response.getWriter();
         //writer.println("HTTP Status 401" + authException.getMessage());
         ResponseUtil.renderJson(authException.getMessage(), response, null);
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        setRealmName("Baeldung");
        super.afterPropertiesSet();
    }


}
