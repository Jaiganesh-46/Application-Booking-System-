# Appointment Booking System (Java Console App)

This is a simple Java-based appointment booking system that allows users to:

- Book a time slot
- View all current bookings
- Cancel a booking

It's ideal for beginners and demonstrates real-world logic using core Java features like HashMap, Scanner, control statements, and loops.

## Features

- Menu-driven console interface
- Prevents double-booking of slots
- Allows easy booking cancellation
- Stores appointments in memory using HashMap

## How It Works

Each time slot is treated as a unique string (e.g., `10AM-11AM`) and stored with the user’s name. When a booking is made, the system checks if the slot is already taken.

## Prerequisites

- Java 8 or higher
- Any Java IDE (IntelliJ, Eclipse, VS Code) or command line
