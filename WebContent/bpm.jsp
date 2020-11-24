<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <!-- Header -->
<jsp:include page="${contextPath}/partials/header.jsp" />

<body>

<jsp:include page="${contextPath}/partials/nav.jsp" />

    <div class="container">
      <div class="row mt-3 mb-0">
        <div class="col-12">
          <h2>BPM</h2>
          <div class="card">
            <div class="card-body">
              <canvas id="myChart"></canvas>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-12 mt-3">
          <div class="card h-100">
            <div class="card-body">
              <div class="d-flex justify-content">
                <h2>Hoje</h2>
              </div>
              
              <table class="table table-striped">
                <thead>
                  <tr>
                    <th>Horário</th>
                    <th>BPM</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>13:00</td>
                    <td>100</td>
                  </tr>
                  <tr>
                    <td>12:00</td>
                    <td>85</td>
                  </tr>
                  <tr>
                    <td>11:00</td>
                    <td>90</td>
                  </tr>
                  <tr>
                    <td>10:00</td>
                    <td>100</td>
                  </tr>
                  <tr>
                    <td>09:00</td>
                    <td>120</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
    <script>
      var ctx = document.getElementById("myChart").getContext("2d");
      var chart = new Chart(ctx, {
        // The type of chart we want to create
        type: "bar",

        // The data for our dataset
        data: {
          labels: [
            "07:00",
            "08:00",
            "09:00",
            "10:00",
            "11:00",
            "12:00",
            "13:00"
          ],
          datasets: [
            {
              label: "BPM",
              data: [75, 80, 120, 100, 90, 85, 100]
            },
          ],
        },

        // Configuration options go here
        options: {},
      });
    </script>


<!-- Footer -->
<jsp:include page="${contextPath}/partials/footer.jsp" />