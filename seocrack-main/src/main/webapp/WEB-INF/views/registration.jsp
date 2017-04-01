<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Регистрация</title>
</head>
<body>
<form id="login" action="" method="POST">
    <h1>Форма входа</h1>
    <fieldset id="inputs">
        <input id="username" name="username" type="text" placeholder="Логин" autofocus required>
        <input id="password" name="password" type="password" placeholder="Пароль" required>
        <input id="confirm-password" name="passwordConfirm" type="password" placeholder="Подтверждение пароля" required>
        <input id="firstName" name="firstName" type="text" placeholder="Имя" required>
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
