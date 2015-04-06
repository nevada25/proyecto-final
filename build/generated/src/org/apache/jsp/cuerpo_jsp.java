package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cuerpo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/encabesado.jsp");
    _jspx_dependants.add("/piecera.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/pesicon2.ico\" type=\"image/png\" />\r\n");
      out.write("        <title>SELVA AMAZONICA</title>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilos.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("   \r\n");
      out.write("     \r\n");
      out.write("     ");
      out.write(" \n");
      out.write("<section id=\"universal\">\n");
      out.write("    <h1>\n");
      out.write("    <a href=\"index.html\">\n");
      out.write("    \n");
      out.write("    <img class=\"fade\" alt=\"SELVA AMAZONICA.SAC SISTEMA DE CONTROL Y BOLETA ELECTRONICAS\" src=\"img/logo4.png\"/>\n");
      out.write("    </a>\n");
      out.write("    </h1>\n");
      out.write("        <header>header</header>\n");
      out.write("     <nav>\n");
      out.write("     \t<ul>\n");
      out.write("        \t<li><a href=\"index.html\">Inicio</a></li>\n");
      out.write("            <li><a href=\"acerca.html\">Acerca</a></li>\n");
      out.write("            <li><a href=\"servicios\">Servicios</a></li>\n");
      out.write("            <li><a href=\"trabajo\">Trabajos</a></li>\n");
      out.write("            <li><a href=\"contacto\">Contacto</a></li>\n");
      out.write("        \n");
      out.write("        </ul>\n");
      out.write("     \n");
      out.write("     </nav>\n");
      out.write("     \n");
      out.write("     <section id=\"contenedor\">\n");
      out.write("        <section id=\"principal\">\n");
      out.write("        section\n");
      out.write("        <article id=\"galeria-inicio\" >\n");
      out.write("        aqui habra una galeria con Jquery\n");
      out.write("            \n");
      out.write("        </article>\n");
      out.write("        </section>\n");
      out.write("        <aside>\n");
      out.write("widgets sociales\n");
      out.write("        </aside>\n");
      out.write("\n");
      out.write("     </section>\n");
      out.write("     ");
      out.write("<footer>\n");
      out.write("        &copy; DERECHOS RESERVADOS,CREADO POR ING.KEVIN CALDERON,ING.ELAR BECERRA,ING.FLOR SANGAMA<a href=\"\" target=\"_blank\"></a>\n");
      out.write("     </footer>\n");
      out.write("     </section>\n");
      out.write("   \n");
      out.write("    </body>\n");
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
}
