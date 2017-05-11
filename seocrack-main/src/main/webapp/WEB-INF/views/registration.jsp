<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <spring:url value="/resources/css/styles.css" var="mainCss"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Регистрация</title>
    <webLink href="${mainCss}" rel="stylesheet" />
</head>
<body>
<form id="login" action="" method="POST">
    <h1>Форма входа</h1>
    <fieldset id="inputs">
        <input id="username" name="username" type="text" placeholder="Логин" autofocus required>
        <input id="password" name="password" type="password" placeholder="Пароль" required>
        <input id="confirm-password" name="passwordConfirm" type="password" placeholder="Подтверждение пароля" required>
        <input id="firstName" name="firstName" type="text" placeholder="Имя" required>
        <input id="lastName" name="lastName" type="text" placeholder="Фамилия" required>
        <select id="role" name="role">
            <option value="seo">SEO специалист</option>
            <option value="manager">Проект-менеджер</option>
        </select>
    </fieldset>
    <fieldset id="actions">
        <input type="submit" id="submit" value="Зарегистрироваться">
    </fieldset>
    <p>${error}</p>
</form>
</body>
</html>
