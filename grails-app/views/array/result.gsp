<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="custom"/>
    <title>Результат подсчета</title>
</head>
<body>
<h1>Результат подсчета элементов</h1>
<g:each in="${result}" var="entry">
    <p>${entry.key}: ${entry.value}</p>
</g:each>
<g:link action="index">Назад</g:link>
</body>
</html>
