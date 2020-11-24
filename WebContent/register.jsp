<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- Header -->
<jsp:include page="${contextPath}/partials/header.jsp" />

<body>

 <div class="container">
      <div class="row mt-3 mb-0">
        <div class="col-12">
          <h2>Cadastre-se</h2>
          <p>Preencha as informações abaixo:</p>
          <form role="form" action="dashboard.html">
            <div class="form-group">
              <label for="inputName">
                Nome
              </label>
              <input
                type="text"
                class="form-control"
                id="inputName"
                required
              />
            </div>
            <div class="form-group">
              <label for="inputSecondName">
                Sobrenome
              </label>
              <input
                type="text"
                class="form-control"
                id="inputSecondName"
                required
              />
            </div>
            <div class="form-group">
              <label for="inputBornDate">
                Data de Nascimento
              </label>
              <input
                type="date"
                class="form-control"
                id="inputBornDate"
                required
              />
            </div>
            <div class="form-group">
              <label for="inputEmail">
                Email
              </label>
              <input
                type="email"
                class="form-control"
                id="inputSenha"
                required
              />
            </div>
            <div class="form-group">
              <label for="inputPassword">
                Senha
              </label>
              <input
                type="password"
                class="form-control"
                id="inputPassword"
                required
              />
            </div>
            <div class="form-group">
              <label for="inputConfirmPassword">
                Confirmar Senha
              </label>
              <input
                type="password"
                class="form-control"
                id="inputConfirmPassword"
                required
              />
            </div>
            <button type="submit" class="btn btn-primary">
              CADASTRAR
            </button>
            <a href="./" class="btn btn-secondary">
              CANCELAR
            </a>
          </form>
        </div>
      </div>
    </div>

<!-- Footer -->
<jsp:include page="${contextPath}/partials/footer.jsp" />