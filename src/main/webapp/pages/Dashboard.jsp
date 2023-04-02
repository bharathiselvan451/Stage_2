<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="dashboard.css" rel="stylesheet">
</head>
<body>
    <h1>Welcome <%= request.getAttribute("name") %></h1>
    <h2>Your expenses <%= request.getAttribute("Expense") %></h2>
    <h2>Your budget <%= request.getAttribute("Budget") %></h2>
    <h2><%=request.getAttribute("output") %></h2>
    <form method="post">
        <table>
            <tr>
                <td colspan="6"><label for="budget">Enter the budget</label></td>
                <td colspan="6"><input type="number" name="budget" id="budget" required></td>
            </tr>
           
           <tr>
                <td colspan="6"><button type="submit" formaction="setbudget">SUBMIT</button></td>
                
            </tr>
        </table>
    </form>
    <form method="post">
        <table>
            <tr>
                <td colspan="6"><label for="budget">Enter the expense</label></td>
                <td colspan="6"><input type="number" name="expense" id="expense" required></td>
            </tr>
           <br>
           <tr>
                <td colspan="6"><button type="submit" formaction="setexpense">SUBMIT</button></td>
                
            </tr>
        </table>
    </form>
    
</body>
</html>