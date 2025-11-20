# AI Automation Endpoints (Spring Boot)

This project contains multiple AI-ready backend automation endpoints built with Java and Spring Boot.  
Each endpoint demonstrates clean backend architecture, structured request/response models, and a service layer designed for future AI or LLM integration.

---

## 🚀 Features

### **1. AI Chat Endpoint**
A simple REST endpoint that returns an AI-style response.

**Endpoint:**  
`POST /api/chat`

**Example Request**
```json
{
  "message": "Hello"
}
```

**Example Response**
```json
{
  "response": "AI Response: Hello"
}
```

---

### **2. Email Classifier Endpoint**
A rule-based classifier that categorizes incoming emails into business-friendly types.

**Endpoint:**  
`POST /api/email/classify`

**Example Request**
```json
{
  "subject": "Refund request for last month invoice",
  "body": "Hi, I was charged twice and I would like a refund."
}
```

**Example Response**
```json
{
  "category": "Billing / Refund",
  "confidence": 0.9,
  "explanation": "Detected billing-related keywords such as 'refund', 'invoice' or 'payment'."
}
```

**Classification categories**
- Billing / Refund
- Support
- Lead / Sales
- General

---

## 📁 Project Structure

```
src/main/java/com/aiportfolio/chatendpoint
├── ChatendpointApplication.java
│
├── controller
│   ├── ChatController.java
│   └── EmailClassifierController.java
│
├── model
│   ├── ChatRequest.java
│   ├── ChatResponse.java
│   ├── EmailRequest.java
│   └── EmailResponse.java
│
└── service
    └── EmailClassifierService.java
```

The structure follows clean layered architecture:

- **controller** → REST endpoints
- **model** → DTO classes
- **service** → business logic

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Lombok
- Maven
- REST API Architecture

---

## ▶️ How to Run

1. Clone the repository
2. Navigate to the project folder
3. Run the application:

```
mvn spring-boot:run
```

4. Server starts at:

```
http://localhost:8081
```

(Some environments use port 8080.)

---

## 📌 Purpose

This project is part of a professional backend & AI automation portfolio.  
It demonstrates clean API design, extendable architecture, and real automation logic ready for future AI integration.
