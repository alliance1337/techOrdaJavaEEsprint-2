
<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.techorda.db.Items" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<br>
<br>
<section>
  <%
    ArrayList<Items> gg = (ArrayList<Items>) request.getAttribute("itemy");
    if (gg!=null) {
      int i = 0;
      for (Items wp : gg) {
        if (i % 3 == 0) {
  %>
  <div class="d-flex flex-row justify-content-between">
    <%
      }
    %>
    <div class="card flex-child" style="width: 22rem;">
      <div class="card-header">
        <h4 class="text-center"><%=wp.getName()%></h4>
      </div>
      <div class="card-body">
        <h5 class="card-title text-success fs-4 text-center"><%="$"+wp.getPrice()%></h5>
        <p class="card-text text-center"><span><%=wp.getRam()%></span><br><span><%=wp.getMemory()%></span><br><span><%=wp.getOs()%></span></p>
        <div class="d-grid gap-2">
          <button class="btn btn-success" type="button">Buy Now</button>
        </div>
      </div>
    </div>
    <%
      i++;
      if (i % 3 == 0) {
    %>
  </div>
  <%
      }
    }
    if (i % 3 != 0) {
  %>
  </div>
  <%
      }
    }
  %>
</section>
<br>
<br>
