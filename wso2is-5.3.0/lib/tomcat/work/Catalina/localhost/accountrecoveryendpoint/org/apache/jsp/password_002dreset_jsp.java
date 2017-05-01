/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-05-01 06:49:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.mgt.endpoint.IdentityManagementEndpointUtil;

public final class password_002dreset_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    boolean error = IdentityManagementEndpointUtil.getBooleanValue(request.getAttribute("error"));
    String errorMsg = IdentityManagementEndpointUtil.getStringValue(request.getAttribute("errorMsg"));
    String callback = (String) request.getAttribute("callback");


      out.write("\n");
      out.write("\n");
      out.write("<fmt:bundle basename=\"org.wso2.carbon.identity.mgt.endpoint.i18n.Resources\">\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>WSO2 Identity Server</title>\n");
      out.write("\n");
      out.write("        <link rel=\"icon\" href=\"images/favicon.png\" type=\"image/x-icon\"/>\n");
      out.write("        <link href=\"libs/bootstrap_3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/Roboto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/custom-common.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <!-- header -->\n");
      out.write("    <header class=\"header header-default\">\n");
      out.write("        <div class=\"container-fluid\"><br></div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"pull-left brand float-remove-xs text-center-xs\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"images/logo-inverse.svg\" alt=\"wso2\" title=\"wso2\" class=\"logo\">\n");
      out.write("\n");
      out.write("                    <h1><em>Identity Server</em></h1>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- page content -->\n");
      out.write("    <div class=\"container-fluid body-wrapper\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!-- content -->\n");
      out.write("            <div class=\"col-xs-12 col-sm-10 col-md-8 col-lg-5 col-centered wr-login\">\n");
      out.write("                <h2 class=\"wr-title uppercase blue-bg padding-double white boarder-bottom-blue margin-none\">Reset\n");
      out.write("                    Password\n");
      out.write("                </h2>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <div class=\"boarder-all \">\n");
      out.write("\n");
      out.write("                    ");
 if (error) { 
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\" id=\"server-error-msg\">\n");
      out.write("                        ");
      out.print( Encode.forHtmlContent(errorMsg) );
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\" id=\"error-msg\" hidden=\"hidden\"></div>\n");
      out.write("\n");
      out.write("                    <div class=\"padding-double\">\n");
      out.write("                        <form method=\"post\" action=\"completepasswordreset.do\" id=\"passwordResetForm\">\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-group required\">\n");
      out.write("                                <label class=\"control-label\">Enter New Password</label>\n");
      out.write("                                <input id=\"reset-password\" name=\"reset-password\" type=\"password\"\n");
      out.write("                                       class=\"form-control\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                if (callback != null) {
                            
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <input type=\"hidden\" name=\"callback\" value=\"");
      out.print(callback );
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 form-group required\">\n");
      out.write("                                <label class=\"control-label\">Confirm Password</label>\n");
      out.write("                                <input id=\"reset-password2\" name=\"reset-password2\" type=\"password\" class=\"form-control\"\n");
      out.write("                                       data-match=\"reset-password\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-actions\">\n");
      out.write("                                <button id=\"submit\"\n");
      out.write("                                        class=\"wr-btn grey-bg col-xs-12 col-md-12 col-lg-12 uppercase font-extra-large\"\n");
      out.write("                                        type=\"submit\">Submit\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /content/body -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <p>WSO2 Identity Server | &copy;\n");
      out.write("                <script>document.write(new Date().getFullYear());</script>\n");
      out.write("                <a href=\"http://wso2.com/\" target=\"_blank\"><i class=\"icon fw fw-wso2\"></i> Inc</a>. All Rights Reserved.\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"libs/jquery_1.11.3/jquery-1.11.3.js\"></script>\n");
      out.write("    <script src=\"libs/bootstrap_3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("\n");
      out.write("            $(\"#passwordResetForm\").submit(function (e) {\n");
      out.write("\n");
      out.write("                var password = $(\"#reset-password\").val();\n");
      out.write("                var password2 = $(\"#reset-password2\").val();\n");
      out.write("                var error_msg = $(\"#error-msg\");\n");
      out.write("\n");
      out.write("                if (!password || 0 === password.length) {\n");
      out.write("                    error_msg.text(\"Password cannot be empty.\");\n");
      out.write("                    error_msg.show();\n");
      out.write("                    $(\"html, body\").animate({scrollTop: error_msg.offset().top}, 'slow');\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (password != password2) {\n");
      out.write("                    error_msg.text(\"Passwords did not match. Please try again.\");\n");
      out.write("                    error_msg.show();\n");
      out.write("                    $(\"html, body\").animate({scrollTop: error_msg.offset().top}, 'slow');\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("</fmt:bundle>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
