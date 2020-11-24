<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!-- Header -->
<jsp:include page="${contextPath}/partials/header.jsp" />

<body>

<jsp:include page="${contextPath}/partials/nav.jsp" />

<!-- Main -->
    <div class="container">
      <div class="row mt-3 mb-3">
      
        <div class="col-12">
          <h1>Bem-vindo, Danilo!</h1>
        </div>
        
        <!-- Passos -->
        <div class="col-12 col-md-4 mb-3">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span><i class="fas fa-walking"></i> Passos</span>
              <h2>300</h2>
              <span>/5000</span>
            </div>
          </div>
        </div>
        
        <!-- Alimentos -->
        <div class="col-12 col-md-4 mb-3">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span><i class="fas fa-weight"></i> Alimentos</span>
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
              <span><i class="fas fa-weight"></i> Peso</span>
              <h2>85</h2>
              <span>Kg</span>
              <br>
              <a href="foods">Adicionar</a> | <a href="peso">Ver mais</a>
            </div>
          </div>
        </div>
        
        
        <!-- Trainning -->
        <div class="col-12 col-md-4 mt-3 mt-md-0">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span><i class="fas fa-dumbbell"></i> Trainning</span>
              <h2>39</h2>
<!--               <span>%</span>
              <p>80 Dias</p> -->
              <br>
              <a href="foods">Adicionar</a> | <a href="trainning">Ver mais</a>
            </div>
          </div>
        </div>
        
        
        <!-- BPM -->
        <div class="col-12 col-md-4 mt-3 mt-md-0">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span><i class="fa fa-heartbeat" aria-hidden="true"></i> BPM</span>
              <h2>95</h2>
              <a href="foods">Adicionar</a> | <a href="bpm">Ver mais</a>
            </div>
          </div>
        </div>
        
        
        <!-- Pontos -->
        <div class="col-12 col-md-4 mt-3 mt-md-0">
          <div class="card shadow h-100">
            <div class="card-body text-center">
              <span><i class="fas fa-trophy"></i> Pontos</span>
              <h2>200</h2>
            </div>
          </div>
        </div>
      </div>
    </div>


<!-- Footer -->
<jsp:include page="${contextPath}/partials/footer.jsp" />