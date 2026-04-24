# WhatsApp Chatbot Backend Simulation

A production-ready Spring Boot backend that simulates a WhatsApp chatbot webhook. This project demonstrates REST API development, JSON processing, and real-time server-side logging as part of the backend internship assignment.

## 🚀 Features
- **Webhook Integration**: Exposes a POST endpoint at `/webhook` to receive simulated WhatsApp message payloads.
- **Automated Bot Logic**:
    - Send **"Hi"** → Bot responds with **"Hello"**
    - Send **"Bye"** → Bot responds with **"Goodbye"**
    - Other messages receive a default helpful prompt.
- **Message Logging**: Every incoming request is logged to the server console with sender details and message content using SLF4J (Requirement fulfilled).
- **Modern Stack**: Built using Java 21 and Spring Boot 3.x.

## 🛠️ Tech Stack
- **Language**: Java 21
- **Framework**: Spring Boot 3.3.5 (Spring Web)
- **Utilities**: Lombok (for clean POJOs), SLF4J (for logging)
- **Build Tool**: Maven

## ⚙️ Installation & Running Locally

** 1. Prerequisites
     - JDK 21
     - Maven
     
** 2. Steps

1. Clone the repository:
```bash
  git clone <https://github.com/pranjalpatel044/WhatsApp-Chatbot-Backend-Simulation>
   cd whatsapp-chatbot-backend
 ```
2. Build the project:
```bash
  mvn clean install
 ```
3. Run the application:
```bash
  mvn spring-boot:run
  ```
  
  The server will start on http://localhost:8080

## 🧪 Testing the API
You can use Postman or cURL to test the webhook.

Sample Request
  - Method: POST

   - URL: http://localhost:8080/webhook

   - Headers: Content-Type: application/json

    - Body: 
```json
      {
          "sender": "+919876543210",
          "messageBody": "Hi"
       }
```
Sample Response
```json
          {
            "reply": "Hello"
          }
```

## 📹 Demo Video
[Click here to watch the Demo Video](https://drive.google.com/file/d/10wEJtqHMTsGCNBOT7NsF0G0wohMIIDLQ/view?usp=drive_link)

## 🌐 Live Deployment
The application is hosted on Render:  
[Live API Link](https://your-app-name.onrender.com/webhook)

---
**Submitted by:** Pranjal Patel  
**Submission Date:** 25 April, 2026