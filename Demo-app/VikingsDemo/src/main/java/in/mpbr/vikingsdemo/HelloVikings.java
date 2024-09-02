package in.mpbr.vikingsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloVikings {

    @GetMapping("/hello")

    public String saySomthing() {
//        return ("<html><body><h1 style='font-size:40px;'>Vikings Say Hello To Everyone Here...!</h1></body></html>");
        return """
            <html>
            <head>
                <style>
                    body {
                        background-color: #f0f8ff;
                        font-family: Arial, sans-serif;
                        text-align: center;
                        padding-top: 100px;
                    }
                    .message-container {
                        background-color: #ffcccb;
                        color: #2c3e50;
                        padding: 20px;
                        border-radius: 15px;
                        display: inline-block;
                        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
                    }
                    .message-container h1 {
                        font-size: 50px;
                        margin: 0;
                    }
                </style>
                 <body>
                   <div class="message-container">
                      <!-- <h1>Vikings Say Hello To Everyone Here...!</h1> -->
                       <h1>Vikings Say Thank You for This Opportunity...!</h1>
                   </div>
                 </body>
            </head>
            </html>
            """;
    }
 }