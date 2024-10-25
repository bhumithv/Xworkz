<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pending Requests</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
    <h2 class="mb-4">Pending Access Requests</h2>

    <% if(request.getAttribute("error") != null) { %>
        <div class="alert alert-danger">
            <%= request.getAttribute("error") %>
        </div>
    <% } %>

    <!-- This would be populated from your backend with actual requests -->
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>User</th>
                <th>Software</th>
                <th>Access Type</th>
                <th>Reason</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <!-- Example of a pending request -->
            <tr>
                <td>JohnDoe</td>
                <td>Project Management Software</td>
                <td>Admin Access</td>
                <td>Manage project resources</td>
                <td>Pending</td>
                <td>
                    <form action="approve" method="post" style="display:inline;">
                        <input type="hidden" name="requestId" value="13">
                        <input type="hidden" name="status" value="Approved">
                        <button type="submit" class="btn btn-success">Approve</button>
                    </form>
                    <form action="approve" method="post" style="display:inline;">
                        <input type="hidden" name="requestId" value="13">
                        <input type="hidden" name="status" value="Rejected">
                        <button type="submit" class="btn btn-danger">Reject</button>
                    </form>
                </td>
            </tr>
        </tbody>
    </table>
</body>
</html>
