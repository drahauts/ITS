import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleHTTPServer {

    public static void main(String[] args) {
        int port = 8080; // Порт для прослушивания
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен на порту: " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("Подключен клиент: " + clientSocket.getInetAddress());
                    handleClientRequest(clientSocket);
                } catch (IOException e) {
                    System.err.println("Ошибка обработки клиента: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Не удалось запустить сервер: " + e.getMessage());
        }
    }

    private static void handleClientRequest(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        // Читаем HTTP-запрос
        String inputLine;
        StringBuilder request = new StringBuilder();
        while ((inputLine = in.readLine()) != null && !inputLine.isEmpty()) {
            request.append(inputLine).append("\n");
        }

        System.out.println("Получен HTTP-запрос:\n" + request);

        // Парсим первую строку HTTP-запроса
        String[] requestLines = request.toString().split("\n");
        String firstLine = requestLines[0]; // Пример: GET /index.html HTTP/1.1
        String[] firstLineParts = firstLine.split(" ");
        String method = firstLineParts[0];  // Метод запроса (GET, POST и т.д.)
        String resource = firstLineParts[1]; // Запрашиваемый ресурс

        System.out.println("Метод: " + method);
        System.out.println("Ресурс: " + resource);

        // Генерация HTTP-ответа
        String responseBody = "<html><body><h1>Hello, world!!</h1><p>Вы запросили ресурс: " + resource + "</p></body></html>";
        String response = "HTTP/1.1 200 OK\r\n" +
                          "Content-Type: text/html\r\n" +
                          "Content-Length: " + responseBody.length() + "\r\n" +
                          "\r\n" +
                          responseBody;

        // Отправка ответа клиенту
        out.print(response);
        out.flush();

        System.out.println("Ответ отправлен клиенту.");
    }
}
