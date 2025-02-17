# Restaurant Factory Project

## Overview
This project implements the **Abstract Factory Design Pattern** to simulate different types of restaurants. The factories can create food and drink items specific to a restaurant type, such as Chinese or Italian.

## Problem Statement
The project initially had incorrect class naming and mismatched food and drink assignments. For example, the class `Pasta` was mistakenly implementing the `Drink` interface, when it should have been implementing `Food`. This problem has been fixed, and the design now properly separates food and drink classes.

## Design Pattern Used: Abstract Factory
The **Abstract Factory** pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. In this project, it helps create Chinese and Italian restaurant menus by producing respective food and drinks.

## Project Structure
