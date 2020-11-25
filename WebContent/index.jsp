<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Header -->
<jsp:include page="${contextPath}/partials/header.jsp" />

<body class="secondary-body">

<!-- Main -->
  <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="text-center">
            <img class="logo" src="images/logo.png" alt="Health Track Logo">
          </div>
          <h1 class="text-center">Seu companheiro de vida saudável</h1>
          <p class="text-center">Se você já possui uma conta, basta fazer o login. Senão, <a href="register">cadastre-se.</a></p>
          <form role="form" action="" method="post">
            <div class="form-group">
              <label for="inputEmail">
                Email
              </label>
              <input
                type="email"
                class="form-control"
                id="username"
                name="username"
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
                id="password"
                name="password"
                required
              />
            </div>
            <div class="forgetPassword">
              <a href="#modal-forgetPassword">Esqueci minha senha</a>
            </div>
            <button type="submit" class="btn btn-block btn-primary">
              ENTRAR
            </button>
          </form>
        </div>
      </div>
</div>
      <!-- <script>
        $('a[href$="#modal-forgetPassword"]').on( "click", function() {
          $('#modal-forgetPassword').modal('show');
        });
      </script> -->

<!-- Footer -->
<jsp:include page="${contextPath}/partials/footer.jsp" />