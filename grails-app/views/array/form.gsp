<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="custom"/>
    <title>Подсчет элементов массива</title>
</head>
<body>
<h1>Введите элементы массива</h1>
<g:form action="count" method="post">
    <g:textField name="numbers" value="${numbers}" placeholder="Введите числа через запятую" size="30"/>
    <g:submitButton name="submit" value="Подсчитать"/>
</g:form>
</body>
</html>
