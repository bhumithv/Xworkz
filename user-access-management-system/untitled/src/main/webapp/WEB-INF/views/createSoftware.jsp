<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sign Up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
          <h2> ${ success } </h2>
            <h2 class="mb-4">Create Software</h2>

            <% if(request.getAttribute("error") != null) { %>
                <div class="alert alert-danger">
                    <%= request.getAttribute("error") %>
                </div>
            <% } %>

            <form action="software" method="post">
                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" id="name" name="name" required>
                </div>
                <div class="mb-3">
                    <label for="description" class="form-label">Description</label>
                    <input type="text" class="form-control" id="description" name="description" required>
                </div>

                  <div class="mb-3">
                                    <label for="accessLevels" class="form-label">Access Levels</label>
                                    <input type="text" class="form-control" id="accessLevels" name="accessLevels" required>
                                </div>

                <button type="submit" class="btn btn-primary">Create</button>
            </form>
            <p class="mt-3">Already have an account? <a href="toreturnlogin">Login</a></p>
        </div>
    </div>
</body>
</html>
