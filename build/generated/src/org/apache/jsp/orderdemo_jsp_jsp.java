package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderdemo_jsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Create New Order</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <style scoped>\n");
      out.write("            #map {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 400px;\n");
      out.write("                background-color: grey;\n");
      out.write("            }\n");
      out.write("            .green {\n");
      out.write("                color: green\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div class=\"container2\">\n");
      out.write("            <form>\n");
      out.write("                <h1 class=\"green\"> Create New Orders </h1>\n");
      out.write("\n");
      out.write("                <div class=\"xdiv1\">\n");
      out.write("                    <div id=\"map\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"xdiv2\">\n");
      out.write("                    <div class=\"input-group2 input-group-icon\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Orders Name\" id=\"fileSelect\">\n");
      out.write("                        <div class=\"input-icon\">\n");
      out.write("                            <i class=\"fa fa-circle\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group2 input-group-icon\">\n");
      out.write("                        <input id='startAd' type=\"text\" placeholder=\"Start Address\" />\n");
      out.write("                        <div class=\"input-icon\">\n");
      out.write("                            <i class=\"fa fa-home\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group2 input-group-icon\">\n");
      out.write("                        <input id=\"endAd\" class=\"controls\" type=\"text\" placeholder=\"Destination Address\" />\n");
      out.write("                        <div class=\"input-icon\">\n");
      out.write("                            <i class=\"fa fa-truck\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group2 input-group-icon\">\n");
      out.write("                        <input name=\"price\" class=\"controls\" type=\"number\" placeholder=\"Price (VND)\" />\n");
      out.write("                        <div class=\"input-icon\">\n");
      out.write("                            <i class=\"fa fa-money\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group2 input-group-icon\">\n");
      out.write("                        <input type=\"text\" value=\"Start Date\" style=\"width: 40%\" readonly=\"true\"/>\n");
      out.write("                        <input id=\"start-date\" name=\"start-date\" type=\"date\" style=\"width: 59%\" readonly=\"true\" />\n");
      out.write("                        <div class=\"input-icon\">\n");
      out.write("                            <i class=\"fa fa-calendar-check-o\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group2 input-group-icon\">\n");
      out.write("                        <input type=\"text\" value=\"Expired Date\" style=\"width: 40%\" readonly=\"true\"/>\n");
      out.write("                        <input type=\"date\" style=\"width: 59%\" />\n");
      out.write("                        <div class=\"input-icon\">\n");
      out.write("                            <i class=\"fa fa-calendar-times-o\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group2 input-group-icon\">\n");
      out.write("                        <input type=\"email\" placeholder=\"Reciver Name\" />\n");
      out.write("                        <div class=\"input-icon\">\n");
      out.write("                            <i class=\"fa fa-user\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group2 input-group-icon\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Reciver Phone Number\" />\n");
      out.write("                        <div class=\"input-icon\">\n");
      out.write("                            <i class=\"fa fa-phone\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group2 input-group-icon\">\n");
      out.write("                        <input class=\"file\" type=\"text\" placeholder=\"Description\" />\n");
      out.write("                        <div class=\"input-icon2\">\n");
      out.write("                            <i class=\"fa fa-file-text\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <center>\n");
      out.write("                        <button style=\"width: 100px;\" type=\"button\" class=\"btn btn-success1\">Add Orders</button>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"script/loadItemToMap.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            Date.prototype.toDateInputValue = (function () {\n");
      out.write("                var local = new Date(this);\n");
      out.write("                local.setMinutes(this.getMinutes() - this.getTimezoneOffset());\n");
      out.write("                return local.toJSON().slice(0, 10);\n");
      out.write("            });\n");
      out.write("            $(document).ready(() => {\n");
      out.write("                loadItemToMap('map', 'startAd', 'endAd');\n");
      out.write("                $(\"#start-date\").val(new Date().toDateInputValue());\n");
      out.write("            })\n");
      out.write("\n");
      out.write("        </script>   \n");
      out.write("    </body>\n");
      out.write("    <footer>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </footer>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not loggedin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_redirect_0.setUrl("login.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }
}
