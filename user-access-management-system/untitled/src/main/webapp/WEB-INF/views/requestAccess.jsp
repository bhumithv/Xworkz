<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Request Access</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
           <h2> ${ success } </h2>
            <h2 class="mb-4">Request Access</h2>

            <% if(request.getAttribute("error") != null) { %>
                <div class="alert alert-danger">
                    <%= request.getAttribute("error") %>
                </div>
            <% } else if(request.getParameter("success") != null) { %>
                <div class="alert alert-success">
                    Access request submitted successfully!
                </div>
            <% } %>

            <form action="request" method="post">
                <div class="mb-3">
                    <label for="softwareId" class="form-label">Software ID</label>
                    <input type="text" class="form-control" id="softwareId" name="softwareId" required>
                </div>
                <div class="mb-3">
                    <label for="accessType" class="form-label">Access Type</label>
                    <input type="text" class="form-control" id="accessType" name="accessType" required>
                </div>
                <div class="mb-3">
                    <label for="reason" class="form-label">Reason for Request</label>
                    <textarea class="form-control" id="reason" name="reason" rows="3" required></textarea>
                </div>
                <button type="submit" class="btn btn-primary">Submit Request</button>
            </form>
        </div>
    </div>
</body>
</html>
