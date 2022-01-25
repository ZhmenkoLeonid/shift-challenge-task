Данная программа преобразует строку json формата в формат .xml

Пример запроса: curl -X POST "http://localhost/api/convert" -H "accept: text/xml" -H "Content-Type: application/json" -d "{\"a\":[{\"b\":\"c\"},{\"b\":\"d\"}]}"