<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="signip.css" rel="stylesheet">
</head>
<body>
    <h1>Expense tracker</h1>
    <form method="post">
        <table>
            <tr>
                <td colspan="6"><label for="email">Enter the email    </label></td>
                <td colspan="6"><input type="text" name="email" id="email" required></td>
            </tr>
            <tr>
                <td colspan="6"><label for="name">Enter the name    </label></td>
                <td colspan="6"><input type="text" name="name" id="name" required></td>
            </tr>
            <tr>
                <td colspan="6"><label for="password">Enter the password    </label></td>
                <td colspan="6"><input type="text" name="password" id="password" required></td>
            </tr>
            <tr>
                <td colspan="6"><button type="submit" formaction="SIGNUP_INTO">SUBMIT</button></td>
                
            </tr>
        </table>
    </form>
    <form id="login">
        <button type="submit"  formaction="LOGIN">LOGIN</button>
    </form>
    <p><%= request.getAttribute("Message") %></p>
</body>
</html>