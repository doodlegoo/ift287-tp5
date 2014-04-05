package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footerLogin.jspf");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
      out.write("<HTML>\n");
      out.write("\t<HEAD>\n");
      out.write("\t\t<TITLE>IFT287 - SystÃ¨me de gestion de ligue de baseball</TITLE>\n");
      out.write("\t\t<META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<META NAME=\"author\" CONTENT=\"Vincent Gagnon\">\n");
      out.write("\t\t<META NAME=\"description\" CONTENT=\"Page d'accueil systÃ¨me de gestion de ligue de Baseball\">\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t    <!-- Bootstrap core CSS -->\n");
      out.write("\t    <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("\t    <!-- Custom styles for this template -->\n");
      out.write("\t    <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("\t</HEAD>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<BODY>\n");
      out.write("\t\t\n");
      out.write("\t\t<H1>Gestion de ligue de baseball</H1>\n");
      out.write("\t");
      out.write(" \n");
      out.write("\n");
      out.write("\t\t<FORM ACTION=\"Login\" METHOD=\"POST\" role=\"form\">\n");
      out.write("\t\t\t<BR> User Id Oracle : <INPUT TYPE=\"TEXT\" NAME=\"userIdBD\" VALUE=\"postgres\" >\n");
      out.write("\t\t    Mot de passe Oracle : <INPUT TYPE=\"TEXT\" NAME=\"motDePasseBD\" VALUE=\"qwerty\"><BR>\n");
      out.write("\t\t    Serveur : <SELECT NAME=\"serveur\">\n");
      out.write("\t\t                <OPTION VALUE=\"postgres\">postgres\n");
      out.write("\t\t              </SELECT>\n");
      out.write("\t\t    adresseIP : <INPUT TYPE=\"TEXT\" NAME=\"adresseIP\"  VALUE=\"localhost\"><BR>\n");
      out.write("\t\t     BD : <INPUT TYPE=\"TEXT\" NAME=\"bd\"  VALUE=\"postgres\">\n");
      out.write("\t\t\t<BR>\n");
      out.write("\t\t\t<BR>\n");
      out.write("\t\t\t<INPUT TYPE=\"SUBMIT\" VALUE=\"Soumettre\" class=\"btn btn-default\" >\n");
      out.write("\t\t</FORM>\n");
      out.write("\t\t<BR>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/messageErreur.jsp", out, false);
      out.write("\n");
      out.write("\t\t<BR>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\n");
      out.write("\t\tDate et heure normale de l'est: ");
      out.print( DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CANADA_FRENCH).format(new java.util.Date()) );
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Site footer -->\n");
      out.write("\t    <div class=\"footer\">\n");
      out.write("\t    \t<p>&copy; Ligue de baseball 2014</p>\n");
      out.write("\t    </div>\n");
      out.write("\t\t\n");
      out.write("\t</BODY>\n");
      out.write("</HTML>");
      out.write(' ');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
