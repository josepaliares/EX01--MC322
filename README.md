# Ticket Purchase System

## Overview

This is a simple ticket purchase system built using Object-Oriented Programming (OOP) concepts. It is a project for the **MC322 - OOP** class at **UNICAMP**. The system allows users to purchase different types of tickets for various events, applying discounts and calculating event revenue.

## Key Concepts

The project focuses on the following OOP concepts:

- **Abstract Classes**: Used to define general behavior for tickets and events.
- **Polymorphism**: Applied to handle different types of tickets and events.
- **Encapsulation**: Ensures proper management of attributes like price and event details.

## Structure of the Application

1. **User**: Stores the user's name and email. Users can be assigned tickets.
2. **Location**: Represents the event location with attributes like name and capacity.
3. **Ticket**: An abstract class that defines common attributes for tickets, with subclasses defining pricing logic.
4. **Ticket Types**: Concrete classes representing different ticket types (`Inteira`, `Meia`, `VIP`), each with its own pricing logic.
5. **Event**: An abstract class that includes event details (name, location, base ticket price) and methods to manage tickets and calculate revenue.
6. **Event Types**: Concrete classes representing specific types of events (`EventoShow`, `EventoFestival`, `EventoTeatro`, `EventoJogo`), each with specific attributes.

## Steps Taken to Build the System

1. **Ticket Types**: 
   - Created an abstract `Ingresso` class and concrete ticket classes that implement different pricing logic based on the event.
2. **Event Categories**: 
   - Created concrete classes for different types of events, each with specific attributes and methods.
3. **Revenue Calculation**: 
   - Added a list of sold tickets in the `Evento` class and implemented methods to add tickets and calculate event revenue.
