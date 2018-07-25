package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderThumb_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("                height: 30px;\n");
      out.write("                background-color: grey;\n");
      out.write("            }\n");
      out.write("            .green {\n");
      out.write("                color: green\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        ");
      DAO.userDAO user = null;
      synchronized (_jspx_page_context) {
        user = (DAO.userDAO) _jspx_page_context.getAttribute("user", PageContext.PAGE_SCOPE);
        if (user == null){
          user = new DAO.userDAO();
          _jspx_page_context.setAttribute("user", user, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      DAO.orderDAO orderC = null;
      synchronized (_jspx_page_context) {
        orderC = (DAO.orderDAO) _jspx_page_context.getAttribute("orderC", PageContext.PAGE_SCOPE);
        if (orderC == null){
          orderC = new DAO.orderDAO();
          _jspx_page_context.setAttribute("orderC", orderC, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("order");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderC.getOrder(param.id)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty order}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"container2\">\n");
        out.write("                <form action=\"orderMan\" method=\"post\">\n");
        out.write("                    <h2 class=\"green\"> Order <input type=\"text\" name=\"oid\" class=\"btn btn-success\" href=\"#\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"width: auto\" readonly></input> Information </h2>\n");
        out.write("\n");
        out.write("                    <div class=\"xdiv1\">\n");
        out.write("                        <div id=\"map\"></div>\n");
        out.write("                    </div>\n");
        out.write("                    <div class=\"xdiv2\">\n");
        out.write("                        <center class=\"input-group2 input-group-icon\">\n");
        out.write("                            <a href=\"profile.jsp?uid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn btn-success\">Owner : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                            <a href=\"profile.jsp?uid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.shipid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn btn-");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty order.shipid ? \"danger\" : \"info\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Shipper : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty order.shipid ? \"Not Yet\" : order.shipid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                        </center>\n");
        out.write("                        <div class=\"input-group2 input-group-icon\">\n");
        out.write("                            <input type=\"text\" value=\"Name : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" \" readonly>\n");
        out.write("                            <div class=\"input-icon\">\n");
        out.write("                                <i class=\"fa fa-circle\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"input-group2 input-group-icon\">\n");
        out.write("                            <input id='startAd' type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.start}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" readonly/>\n");
        out.write("                            <div class=\"input-icon\">\n");
        out.write("                                <i class=\"fa fa-home\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"input-group2 input-group-icon\">\n");
        out.write("                            <input id=\"endAd\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.dest}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" readonly/>\n");
        out.write("                            <div class=\"input-icon\">\n");
        out.write("                                <i class=\"fa fa-truck\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"input-group2 input-group-icon\">\n");
        out.write("                            <input class=\"controls\" type=\"text\" value=\"Price : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" VND\" readonly />\n");
        out.write("                            <div class=\"input-icon\">\n");
        out.write("                                <i class=\"fa fa-money\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"input-group2 input-group-icon\">\n");
        out.write("                            <input type=\"text\" value=\"Start Date\" style=\"width: 40%\" readonly/>\n");
        out.write("                            <input id=\"start-date\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.startDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" type=\"date\" style=\"width: 59%\" readonly/>\n");
        out.write("                            <div class=\"input-icon\">\n");
        out.write("                                <i class=\"fa fa-calendar-check-o\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"input-group2 input-group-icon\">\n");
        out.write("                            <input type=\"text\" value=\"Expired Date\" style=\"width: 40%\" readonly/>\n");
        out.write("                            <input type=\"date\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.expiredDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"width: 59%\" readonly/>\n");
        out.write("                            <div class=\"input-icon\">\n");
        out.write("                                <i class=\"fa fa-calendar-times-o\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"input-group2 input-group-icon\">\n");
        out.write("                            <input type=\"text\" value=\"Receiver Name : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.rName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Reciver Name\" />\n");
        out.write("                            <div class=\"input-icon\">\n");
        out.write("                                <i class=\"fa fa-user\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"input-group2 input-group-icon\">\n");
        out.write("                            <input type=\"text\" value=\"Phone Number : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.rPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" />\n");
        out.write("                            <div class=\"input-icon\">\n");
        out.write("                                <i class=\"fa fa-phone\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"input-group2 input-group-icon\">\n");
        out.write("                            <input class=\"file\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.desc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" />\n");
        out.write("                            <div class=\"input-icon2\">\n");
        out.write("                                <i class=\"fa fa-file-text\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <center>\n");
        out.write("                            ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </center>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                </form>\n");
        out.write("\n");
        out.write("\n");
        out.write("            </div>\n");
        out.write("            <script src=\"script/loadItemToMap.js\"></script>\n");
        out.write("            <script>\n");
        out.write("                $(document).ready(() => {\n");
        out.write("                    loadItemToMap('map', 'startAd', 'endAd');\n");
        out.write("                })\n");
        out.write("\n");
        out.write("            </script>   \n");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.user && sessionScope.user.username != order.uid && sessionScope.user.username != order.shipid}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <input type=\"submit\" name=\"accept\" class=\"btn btn-success\" value=\"Accept Order\"/>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.user && sessionScope.user.username != order.uid && sessionScope.user.username == order.shipid}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <input type=\"submit\" name=\"supsend\" class=\"btn btn-warning\" value=\"Supsend Order\"/>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.user && sessionScope.user.username == order.uid}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <input type=\"submit\" name=\"delete\" class=\"btn btn-danger\" value=\"Delete Order\"></a>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty order}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"container1\">\n");
        out.write("                <div class=\"row1\">\n");
        out.write("                    <div class=\"input-group input-group-icon\">\n");
        out.write("                        <input style=\"color:red\" name=\"uid\" type=\"text\" value='Order number \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" not found!' readonly />\n");
        out.write("                        <div class=\"input-icon\">\n");
        out.write("                            <i class=\"fa fa-star\"></i>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }
}
