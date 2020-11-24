<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>


<!-- Header -->
<jsp:include page="${contextPath}/partials/header.jsp" />

<body>

<jsp:include page="${contextPath}/partials/nav.jsp" />

    <div class="container">
      <div class="row mt-3 mb-0">
        <div class="col-12">
          <div class="card">
            <div class="card-body">
              <div class="media">
                <img
                  src="https://placeimg.com/80/80/animals"
                  alt="Profile Image"
                  class="rounded-circle"
                />
                <div class="media-body ml-3">
                  <h2>Danilo Caetano</h2>
                  <a href="edit-profile">Editar Perfil</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-6 col-md-4 mt-3">
          <div class="card h-100">
            <div class="card-body text-center">
              <span>Idade</span>
              <h2>28</h2>
              <span>anos</span>
            </div>
          </div>
        </div>

        <div class="col-6 col-md-4 mt-3">
          <div class="card h-100">
            <div class="card-body text-center">
              <span>Peso</span>
              <h2>85</h2>
              <span>Kg</span>
            </div>
          </div>
        </div>

        <div class="col-6 col-md-4 mt-3">
          <div class="card h-100">
            <div class="card-body text-center">
              <span>Altura</span>
              <h2>170</h2>
              <span>Cm</span>
            </div>
          </div>
        </div>

        <div class="col-6 col-md-4 mt-3">
          <div class="card h-100">
            <div class="card-body text-center">
              <span>Sangue</span>
              <h2>O+</h2>
            </div>
          </div>
        </div>

        <div class="col-12 col-md-4 mt-3 mb-3">
          <div class="card h-100">
            <div class="card-body text-center">
              <span>Informações médicas</span>
              <p>Sem Informações cadastradas</p>
            </div>
          </div>
        </div>
      </div>
    </div>


<!-- Footer -->
<jsp:include page="${contextPath}/partials/footer.jsp" />