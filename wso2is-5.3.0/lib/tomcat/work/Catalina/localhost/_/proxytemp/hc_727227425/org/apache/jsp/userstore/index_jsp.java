/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-05-01 05:43:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.userstore;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.user.mgt.stub.types.carbon.UserRealmInfo;
import org.wso2.carbon.user.mgt.stub.types.carbon.UserStoreInfo;
import org.wso2.carbon.user.mgt.ui.UserAdminClient;
import org.wso2.carbon.user.mgt.ui.UserAdminUIConstants;
import org.wso2.carbon.user.mgt.ui.Util;
import org.wso2.carbon.utils.ServerConstants;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tlds/carbontags.tld", Long.valueOf(1482326920000L));
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1482326920000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody;
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
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"extensions/core/js/vui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../admin/js/main.js\"></script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dialog/display_messages.jsp", out, false);
      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      try {
        _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
        _jspx_th_fmt_005fbundle_005f0.setParent(null);
        // /userstore/index.jsp(36,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.userstore.ui.i18n.Resources");
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
            out.write("    ");
            //  carbon:breadcrumb
            org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_005fbreadcrumb_005f0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
            try {
              _jspx_th_carbon_005fbreadcrumb_005f0.setPageContext(_jspx_page_context);
              _jspx_th_carbon_005fbreadcrumb_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
              // /userstore/index.jsp(38,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_carbon_005fbreadcrumb_005f0.setLabel("system.user.store");
              // /userstore/index.jsp(38,4) name = resourceBundle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_carbon_005fbreadcrumb_005f0.setResourceBundle("org.wso2.carbon.userstore.ui.i18n.Resources");
              // /userstore/index.jsp(38,4) name = topPage type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_carbon_005fbreadcrumb_005f0.setTopPage(true);
              // /userstore/index.jsp(38,4) name = request type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_carbon_005fbreadcrumb_005f0.setRequest(request);
              int _jspx_eval_carbon_005fbreadcrumb_005f0 = _jspx_th_carbon_005fbreadcrumb_005f0.doStartTag();
              if (_jspx_th_carbon_005fbreadcrumb_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } finally {
              _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.reuse(_jspx_th_carbon_005fbreadcrumb_005f0);
            }
            out.write("\n");
            out.write("        ");

    	UserRealmInfo userRealmInfo = null;
            String currentUser = (String) session.getAttribute("logged-user");

            try {
    			String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    			String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    			ConfigurationContext configContext = (ConfigurationContext) config
    					.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
    			UserAdminClient client = new UserAdminClient(cookie,backendServerURL, configContext);
    			userRealmInfo = client.getUserRealmInfo();
    			session.setAttribute(UserAdminUIConstants.USER_STORE_INFO,userRealmInfo);
    		} catch (Exception e) {
    			CarbonUIMessage uiMsg = new CarbonUIMessage(e.getMessage(),
    					CarbonUIMessage.ERROR, e);
    			session.setAttribute(CarbonUIMessage.ID, uiMsg);
    		}
    
            out.write("\n");
            out.write("\n");
            out.write("\n");
            out.write("    <div id=\"middle\">\n");
            out.write("        <h2>");
            if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</h2>\n");
            out.write("\n");
            out.write("        <div id=\"workArea\">\n");
            out.write("            <table width=\"100%\">\n");
            out.write("\n");
            out.write("                ");
 if (CarbonUIUtil.isUserAuthorized(request, "/permission/admin/manage/identity") ||
                       CarbonUIUtil.isUserAuthorized(request, "/permission/admin/manage/identity/usermgt") ||
                       CarbonUIUtil.isUserAuthorized(request, "/permission/admin/manage/identity/usermgt/users") ||
                       CarbonUIUtil.isUserAuthorized(request, "/permission/admin/manage/identity/usermgt/passwords") ||
                       CarbonUIUtil.isUserAuthorized(request, "/permission/admin/manage/identity/usermgt/profiles")) {
            out.write("\n");
            out.write("                <tr>\n");
            out.write("                    <td>\n");
            out.write("                        <table class=\"styledLeft\" id=\"internal\" width=\"100%\">\n");
            out.write("                            <tr>\n");
            out.write("                                <td>\n");
            out.write("                                    <a class=\"icon-link\"\n");
            out.write("                                       style=\"background-image:url(images/users.gif);\"\n");
            out.write("                                       href=\"../user/user-mgt.jsp\">");
            if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a>\n");
            out.write("                                </td>\n");
            out.write("                            </tr>\n");
            out.write("\n");
            out.write("\n");
            out.write("                            ");
 if (CarbonUIUtil.isUserAuthorized(request, "/permission/admin/manage/identity")) { 
            out.write("\n");
            out.write("                            <tr>\n");
            out.write("                                <td>\n");
            out.write("                                    <a class=\"icon-link\"\n");
            out.write("                                       style=\"background-image:url(images/user-roles.gif);\"\n");
            out.write("                                       href=\"../role/role-mgt.jsp\">");
            if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a>\n");
            out.write("                                </td>\n");
            out.write("                            </tr>\n");
            out.write("                            ");
 } 
            out.write("\n");
            out.write("                        </table>\n");
            out.write("                    </td>\n");
            out.write("                </tr>\n");
            out.write("            </table>\n");
            out.write("            ");
 } 
            out.write("\n");
            out.write("\n");
            out.write("            ");

                if(userRealmInfo != null){
                    UserStoreInfo userStoreInfo = Util.getUserStoreInfoForUser(currentUser, userRealmInfo);
                    if (!userStoreInfo.getReadOnly() && CarbonUIUtil.isUserAuthorized(request,
                            "/permission/admin/login") && !userStoreInfo.getPasswordsExternallyManaged()) {
            
            out.write("\n");
            out.write("            <br/>\n");
            out.write("            <table class=\"styledLeft\">\n");
            out.write("                <tbody>\n");
            out.write("                <tr>\n");
            out.write("                    <td class=\"middle-header\">Change Password</td>\n");
            out.write("                </tr>\n");
            out.write("                <tr>\n");
            out.write("                    <td>\n");
            out.write("                        <a href=\"../user/change-passwd.jsp?isUserChange=true&returnPath=../userstore/index.jsp\"\n");
            out.write("                           style=\"background-image: url(images/keys.gif);\" class=\"icon-link\">\n");
            out.write("                            ");
            if (_jspx_meth_fmt_005fmessage_005f3(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a></td>\n");
            out.write("                </tr>\n");
            out.write("                </tbody>\n");
            out.write("            </table>\n");
            out.write("            ");
      }
                }
            else {
            out.write("\n");
            out.write("                <script type=\"text/javascript\">\n");
            out.write("                    location.href = \"");
            out.print(request.getHeader("referer"));
            out.write("\";\n");
            out.write("                </script>\n");
            out.write("            ");
}
            
            out.write("\n");
            out.write("            </td>\n");
            out.write("\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            out.write("    <script type=\"text/javascript\">\n");
            out.write("        alternateTableRows('internal', 'tableEvenRow', 'tableOddRow');\n");
            out.write("        alternateTableRows('external', 'tableEvenRow', 'tableOddRow');\n");
            out.write("    </script>\n");
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
      // /userstore/index.jsp(62,12) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("user.management");
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
      // /userstore/index.jsp(79,67) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("users");
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
      // /userstore/index.jsp(89,67) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("roles");
      int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /userstore/index.jsp(115,28) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("change.my.password");
      int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
    }
    return false;
  }
}
