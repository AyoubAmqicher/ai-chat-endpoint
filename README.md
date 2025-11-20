# AI Chat Endpoint (Spring Boot)

This project is a simple REST API endpoint that accepts a message and returns
an AI-style response. It is designed as a clean and professional portfolio
example to demonstrate backend development and AI integration structure.

---

## ✅ Features
- POST `/api/chat` endpoint
- Accepts JSON input
- Returns a formatted AI-style reply
- Built with Spring Boot (Java 17)
- Ready for AI integration (OpenAI or local LLM can be plugged in easily)

---

## 📌 Example Request

```
POST http://localhost:8081/api/chat
Content-Type: application/json
```

#### Request Body
```json
{
  "message": "Hello AI"
}
```

---

## 📌 Example Response
```json
{
  "reply": "AI Response: Hello AI"
}
```

---

## 🛠 Tech Stack
- Java 17
- Spring Boot
- REST API
- JSON (Jackson)

---

## 📷 Screenshots
- `screenshot-code.png` — Controller code & project structure
- `screenshot-postman.png` — Successful API call in Postman

---

## 📄 Purpose
This project was built as part of a professional Upwork portfolio to showcase:

- Clean backend architecture
- REST API development
- AI-ready workflow structure
- Ability to deliver small automation components quickly

It demonstrates the foundations used in AI-powered automations, chatbots, and backend integrations.

