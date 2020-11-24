<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>


<!-- Header -->
<jsp:include page="${contextPath}/partials/header.jsp" />

<body>

<jsp:include page="${contextPath}/partials/nav.jsp" />


 <div class="container">
      <div class="row mt-3 mb-3">
        <div class="col-12">
          <h2>Editar Perfil</h2>
          <p>Altere as informações abaixo:</p>
          <form role="form" action="profile.html">
            <div class="form-group">
              <label for="exampleInputFile">
                Foto
              </label>
              <input type="file" class="form-control-file" id="exampleInputFile" />
            </div>
            <hr>
            <div class="form-group">
              <label for="inputName">
                Nome
              </label>
              <input
                type="text"
                class="form-control"
                id="inputName"
                value="Danilo"
                placeholder="Nome"
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
                value="Caetano"
                placeholder="Sobrenome"
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
                value="me@danilocaetano.com.br"
                disabled
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
              />
            </div>
            <div class="form-group">
              <label for="inputWeight">
                Peso
              </label>
              <input
                type="text"
                class="form-control"
                id="inputWeight"
              />
            </div>
            <div class="form-group">
              <label for="inputHeight">
                Altura
              </label>
              <input
                type="text"
                class="form-control"
                id="inputHeight"
              />
            </div>
            <div class="form-group">
              <label for="inputTypeBlood">
                Tipo Sanguineo
              </label>
              <input
                type="text"
                class="form-control"
                id="inputTypeBlood"
                value="O"
              />
            </div>
            <div class="form-group">
              <label for="inputHealth">
                Observacoes Medicas
              </label>
              <textarea
                class="form-control"
                id="inputHealth"
                rows="5"
              /></textarea>
            </div>
            <hr>
            <div class="form-group">
              <label for="inputPassword">
                Senha
              </label>
              <input
                type="password"
                class="form-control"
                id="inputPassword"
                value="123456"
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
                value="123456"
                required
              />
            </div>
            <button type="submit" class="btn btn-primary" onclick="alert('Perfil Atualizado com Sucesso!!!')">
              ALTERAR
            </button>
            <a href="profile.html" class="btn btn-secondary">
              CANCELAR
            </a>
          </form>
        </div>
      </div>
    </div>


<!-- Footer -->
<jsp:include page="${contextPath}/partials/footer.jsp" />