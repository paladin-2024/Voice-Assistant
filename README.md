# VocaLite 🔊

VocaLite is a standalone Java-based voice assistant prototype designed for offline operation. It uses [Vosk](https://alphacephei.com/vosk/) for speech-to-text recognition and [FreeTTS](http://freetts.sourceforge.net/docs/index.php) for text-to-speech conversion. VocaLite can listen, interpret, and respond to basic voice commands like greetings, time queries, and system actions via a simple CLI interface.

## 💡 Features
- 🎙️ Offline speech recognition (Vosk)
- 🗣️ Text-to-speech responses (FreeTTS)
- ⌛ Time inquiries
- 🌐 System commands (e.g., open browser)
- 🚪 Exit assistant via voice

## 🚀 Getting Started

### Prerequisites
- Java 11+
- Vosk model files
- FreeTTS JAR library

### Installation
1. Clone this repo
2. Download Vosk model and place in `/models`
3. Add FreeTTS JAR to your project
4. Run the main class

```bash
java -jar VocaLite.jar
