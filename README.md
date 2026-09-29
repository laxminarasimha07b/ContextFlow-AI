# ContextFlow AI

AI-powered context summarization and clarification platform built with Spring Boot, Spring AI, and OpenRouter.

## Overview

ContextFlow AI turns raw or unstructured text into clear, structured information. Users provide their context, choose a goal, and the application transforms the text accordingly.

## Features

- AI-powered context analysis
- Context summarization
- Actionable bullet points
- Study flashcards
- Simplification for beginners
- REST API architecture
- Spring AI and OpenRouter integration
- Environment-based API key configuration
- React frontend

## Tech Stack

| Layer    | Technologies                                  |
| -------- | --------------------------------------------- |
| Backend  | Java 21, Spring Boot, Spring AI, REST APIs, Maven |
| AI       | OpenRouter, NVIDIA Nemotron                   |
| Frontend | React, Tailwind CSS, Vite                     |

## Architecture

```text
React Frontend
      │
      ▼
Spring Boot REST API
      │
      ▼
Spring AI
      │
      ▼
OpenRouter
      │
      ▼
NVIDIA Nemotron
```

## Getting Started

### Prerequisites

- Java 21
- Maven
- Node.js and npm
- An [OpenRouter](https://openrouter.ai) API key

### Backend

```bash
git clone https://github.com/<your-username>/<your-repo>.git
cd <your-repo>

# Set your API key (do not commit it)
export OPENROUTER_API_KEY=your_api_key_here

mvn spring-boot:run
```

On Windows PowerShell, use `$env:OPENROUTER_API_KEY="your_api_key_here"` instead of `export`.

The API starts on `http://localhost:8080` by default.

### Frontend

```bash
cd frontend
npm install
npm run dev
```

The app runs on `http://localhost:5173` by default.

## Configuration

The API key is read from an environment variable and should never be hardcoded or committed to version control.

| Variable             | Description            |
| -------------------- | ---------------------- |
| `OPENROUTER_API_KEY` | Your OpenRouter API key |

## Usage

1. Paste or type your context into the input area.
2. Select a goal: summary, actionable points, flashcards, or beginner-friendly simplification.
3. Submit and review the generated output.

## License

Add a license of your choice (for example, MIT).
