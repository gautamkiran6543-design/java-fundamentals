import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
    public class simplewebsite {

        public static void main(String[] args) throws IOException {

            // Create server on port 8080
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

            // Create route
            server.createContext("/", (HttpExchange exchange) -> {

                String response = """
                    <html>
                    <head>
                        <title>My First Java Website</title>
                    </head>
                    <body>
                        <h1>Welcome to My Java Website</h1>
                        <p>This page is created using Java Backend.</p>
                        <button>Click Me</button>
                    </body>
                    </html>
                    """;

                exchange.sendResponseHeaders(200, response.getBytes().length);

                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            });

            server.start();

            System.out.println("Server started!");
            System.out.println("Open: http://localhost:8080");
        }
    }

