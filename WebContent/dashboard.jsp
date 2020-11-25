<%-- <%@page import="br.com.healthtrack.model.Dashboard" %>
<%@page import="java.util.ArrayList" %> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%--     <%
    	ArrayList<Dashboard> dashdata = (ArrayList<Dashboard>) request.getAttribute("dashdados");
    %> --%>


<!-- Header -->
<jsp:include page="${contextPath}/partials/header.jsp" />

<body>

<jsp:include page="${contextPath}/partials/nav.jsp" />

<!-- Main -->
    <div class="container">
      <div class="row mt-3 mb-3">
      
        <div class="col-12 mt-3 mb-3">
          <h5>Bem-vindo(a), Danilo</h5>
        </div>
        
<%--         <%
        for(Dashboard d : dashdata) {
        %>
        
        <% d.getQuantidadeBPM(); %>
        
        <% } %> --%>
        
        <!-- Passos -->
        <div class="col-12 col-md-4 mb-3">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span class="text-muted"><i class="fas fa-walking"></i> Passos</span>
              <h2>300</h2>
              <span>/5000</span>
            </div>
          </div>
        </div>
        
        <!-- Alimentos -->
        <div class="col-12 col-md-4 mb-3">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span class="text-muted"><i class="fas fa-weight"></i> Alimentos</span>
              <h2>125</h2>
              <span>Kcal</span>
              <br>
              <a href="foods">Adicionar</a> | <a href="foods">Ver mais</a>
            </div>
          </div>
        </div>
        
        <!-- Peso -->
        <div class="col-12 col-md-4 mt-3 mt-md-0 mb-3">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span class="text-muted"><i class="fas fa-weight"></i> Peso</span>
              <h2>85</h2>
              <span>Kg</span>
              <br>
              <a href="add-peso">Adicionar</a> | <a href="peso">Ver mais</a>
            </div>
          </div>
        </div>
        
        
        <!-- Trainning -->
        <div class="col-12 col-md-4 mt-3 mt-md-0">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span class="text-muted"><i class="fas fa-dumbbell"></i> Trainning</span>
              <h2>39</h2>
<!--               <span>%</span>
              <p>80 Dias</p> -->
              <!-- <br> -->
              <a href="add-trainning">Adicionar</a> | <a href="trainning">Ver mais</a>
            </div>
          </div>
        </div>
        
        
        <!-- BPM -->
        <div class="col-12 col-md-4 mt-3 mt-md-0">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span class="text-muted"><i class="fa fa-heartbeat" aria-hidden="true"></i> BPM</span>
              <h2>95</h2>
              <a href="add-bpm">Adicionar</a> | <a href="bpm">Ver mais</a>
            </div>
          </div>
        </div>
        
        
        <!-- Pontos -->
        <div class="col-12 col-md-4 mt-3 mt-md-0">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span class="text-muted"><i class="fas fa-trophy"></i> Pontos</span>
              <h2>200</h2>
            </div>
          </div>
        </div>
        
        <div class="col-12 d-flex justify-content-center mt-5">
          <small class="text-muted">Health Track 1.0 - FIAP | Danilo Caetano, Alexandre Mazarão</small>
        </div>
        
      </div>
    </div>


<!-- Footer -->
<jsp:include page="${contextPath}/partials/footer.jsp" />