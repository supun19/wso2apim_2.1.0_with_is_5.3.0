/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-05-01 05:42:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.encoder.Encode;

public final class openid_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
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
      response.setContentType("text/html");
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

    String[] profiles = request.getParameterValues("profile");
    String[] claimTags = request.getParameterValues("claimTag");
    String[] claimValues = request.getParameterValues("claimValue");
    String openidreturnto = request.getParameter("openid.return_to");
    String openididentity = request.getParameter("openid.identity");
    if (openidreturnto != null && openidreturnto.indexOf("?") > 0) {
        openidreturnto = openidreturnto.substring(0, openidreturnto.indexOf("?"));
    }

      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      try {
        _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
        _jspx_th_fmt_005fbundle_005f0.setParent(null);
        // /openid_profile.jsp(33,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources");
        int _jspx_eval_fmt_005fbundle_005f0 = _jspx_th_fmt_005fbundle_005f0.doStartTag();
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_fmt_005fbundle_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_fmt_005fbundle_005f0.doInitBody();
          }
          do {
            out.write("\n");
            out.write("\n");
            out.write("    <html>\n");
            out.write("    <head>\n");
            out.write("        <meta charset=\"utf-8\">\n");
            out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
            out.write("        <title>OpenID2.0 Profile</title>\n");
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
            out.write("\n");
            out.write("        <script type=\"text/javascript\">\n");
            out.write("            function submitProfileSelection() {\n");
            out.write("                document.profileSelection.submit();\n");
            out.write("            }\n");
            out.write("\n");
            out.write("            function approved() {\n");
            out.write("                document.getElementById(\"hasApprovedAlways\").value = \"false\";\n");
            out.write("                document.profile.submit();\n");
            out.write("            }\n");
            out.write("\n");
            out.write("            function approvedAlways() {\n");
            out.write("                document.getElementById(\"hasApprovedAlways\").value = \"true\";\n");
            out.write("                document.profile.submit();\n");
            out.write("            }\n");
            out.write("        </script>\n");
            out.write("\n");
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
            out.write("    <div class=\"container-fluid body-wrapper\">\n");
            out.write("\n");
            out.write("        <div class=\"row\">\n");
            out.write("            <div class=\"col-md-12\">\n");
            out.write("\n");
            out.write("                <!-- content -->\n");
            out.write("                <div\n");
            out.write("                        class=\"container col-xs-12 col-sm-10 col-md-7 col-lg-5 ol-centered wr-content wr-login col-centered\">\n");
            out.write("                    <div>\n");
            out.write("                        <h2\n");
            out.write("                                class=\"wr-title uppercase blue-bg padding-double white boarder-bottom-blue margin-none\">\n");
            out.write("                            Open ID User Claims\n");
            out.write("                        </h2>\n");
            out.write("\n");
            out.write("\n");
            out.write("                    </div>\n");
            out.write("                    <div class=\"boarder-all \">\n");
            out.write("                        <div class=\"clearfix\"></div>\n");
            out.write("\n");
            out.write("                        <div class=\"padding-double login-form\">\n");
            out.write("                            <div>\n");
            out.write("                                <form action=\"../openidserver\" id=\"profile\" name=\"profile\" class=\"form-horizontal\">\n");
            out.write("                                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 control-group\">\n");
            out.write("                                        <div class=\"controls\" style=\"margin-left: 0px !important;\">\n");
            out.write("\n");
            out.write("                                            ");

                                                if (claimTags != null && claimTags.length > 0) { 
            out.write("\n");
            out.write("                                            <table class=\"table table-striped table-bordered\">\n");
            out.write("                                                <tr>\n");
            out.write("                                                    <th>Claim URI</th>\n");
            out.write("                                                    <th>Claim Value</th>\n");
            out.write("                                                </tr>\n");
            out.write("                                                ");

                                                    for (int i = 0; i < claimTags.length; i++) {
                                                        String claimTag = claimTags[i];
                                                        if ("MultiAttributeSeparator" .equals(claimTag)) {
                                                            continue;
                                                        }
                                                
            out.write("\n");
            out.write("                                                <tr>\n");
            out.write("                                                    <td>");
            out.print(Encode.forHtmlContent(claimTag));
            out.write("\n");
            out.write("                                                    </td>\n");
            out.write("                                                    <td>");
            out.print(Encode.forHtmlContent(claimValues[i]));
            out.write("\n");
            out.write("                                                    </td>\n");
            out.write("                                                </tr>\n");
            out.write("                                                ");

                                                    } 
            out.write("\n");
            out.write("                                            </table>\n");
            out.write("                                            ");

                                                }
                                            
            out.write("\n");
            out.write("                                        </div>\n");
            out.write("                                    </div>\n");
            out.write("\n");
            out.write("                                    <div style=\"text-align:left;\">\n");
            out.write("                                        <input type=\"button\" class=\"btn  btn-primary\" id=\"approve\" name=\"approve\"\n");
            out.write("                                               onclick=\"javascript: approved(); return false;\"\n");
            out.write("                                               value=\"");
            if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("\"/>\n");
            out.write("                                        <input type=\"button\" class=\"btn\" id=\"chkApprovedAlways\"\n");
            out.write("                                               onclick=\"javascript: approvedAlways();\"\n");
            out.write("                                               value=\"");
            if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("\"/>\n");
            out.write("                                        <input type=\"hidden\" id=\"hasApprovedAlways\" name=\"hasApprovedAlways\"\n");
            out.write("                                               value=\"false\"/>\n");
            out.write("                                        <input class=\"btn\" type=\"reset\" value=\"");
            if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("\"\n");
            out.write("                                               onclick=\"javascript:document.location.href='");
            out.print(openidreturnto);
            out.write("'\"/>\n");
            out.write("                                    </div>\n");
            out.write("                                </form>\n");
            out.write("\n");
            out.write("                            </div>\n");
            out.write("                            <div class=\"clearfix\"></div>\n");
            out.write("                        </div>\n");
            out.write("\n");
            out.write("                    </div>\n");
            out.write("                </div>\n");
            out.write("                <!-- /content -->\n");
            out.write("\n");
            out.write("            </div>\n");
            out.write("        </div>\n");
            out.write("        <!-- /content/body -->\n");
            out.write("\n");
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
            out.write("    </body>\n");
            out.write("    </html>\n");
            out.write("\n");
            int evalDoAfterBody = _jspx_th_fmt_005fbundle_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_fmt_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
      }
      out.write('\n');
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

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /openid_profile.jsp(142,54) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("approve");
      int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /openid_profile.jsp(145,54) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("approve.always");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /openid_profile.jsp(148,79) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("cancel");
      int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
    }
    return false;
  }
}
