<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <!-- Header -->
<jsp:include page="${contextPath}/partials/header.jsp" />

<body>

<jsp:include page="${contextPath}/partials/nav.jsp" />

<div class="container">
      <div class="row mt-3 mb-0">
        <div class="col-12">
          <h2>Peso/IMC</h2>
          <div class="card">
            <div class="card-body text-center">
              <h2>50</h2>
              <form action="">
                <input type="range" min="20" max="150" class="w-100" />
                <button class="btn btn-primary" onclick="alert('Peso Cadastrado com Sucesso!!!')">CADASTRAR</button>
              </form>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-12 mt-3">
          <div class="card h-100">
            <div class="card-body">
              <h2>Histórico</h2>
              <span>Refresh</span>
              <table class="table table-striped">
                <thead>
                  <tr>
                    <th>Data</th>
                    <th>Peso</th>
                    <th>Status</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>02.05</td>
                    <td>85 KG</td>
                    <td class="text-danger">ACIMA</td>
                  </tr>
                  <tr>
                    <td>07:00</td>
                    <td>55</td>
                    <td class="text-warning">ABAIXO</td>
                  </tr>
                  <tr>
                    <td>02.05</td>
                    <td>75 KG</td>
                    <td class="text-success">NORMAL</td>
                  </tr>
                  <tr>
                    <td>02.05</td>
                    <td>85 KG</td>
                    <td class="text-success">NORMAL</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>

<!-- Footer -->
<jsp:include page="${contextPath}/partials/footer.jsp" />