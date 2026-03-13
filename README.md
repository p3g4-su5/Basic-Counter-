# Basic Counter 

A simple counter app built with **Kotlin** and **Jetpack Compose** as part of a mobile development assignment.

## Features
- Display current count as a large number centred on screen
- **+** button to increment the count
- **−** button to decrement (disabled when count is 0)
- **Reset** button to return count to 0
- Count text turns **green** when positive, **grey** when zero

## Tech Stack
- Kotlin
- Jetpack Compose
- Material 3

## Project Structure
```
app/src/main/java/com/example/counterscreen/
├── MainActivity.kt       # Entry point, sets up the theme and screen
└── CounterScreen.kt      # Full counter UI with state management
```

## How to Run
1. Clone the repo
2. Open in Android Studio
3. Run on an emulator or physical device (min SDK 24)
