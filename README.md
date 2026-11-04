# SE350 Design Patterns Practice

Pizza-themed exercises practicing three design patterns in Java.

## Tasks

1. **Builder** (`Example1`): Replace the `PizzaWith...` subclasses with a builder that sets cheese and crust.
2. **Adapter** (`Example2`): Adapt the unmodifiable `DominoPizza` interface so it works with the Pizza Builder.
3. **Decorator** (`Example3`): Add optional toppings (e.g. `OnionDecorator`, `PineappleDecorator`) that can be stacked on a built pizza.

The starter code is in `src/main/java/org/example/Task1/Client.java`.

## Requirements

- Java 23
- Maven

## Build & Run

```sh
mvn compile
java -cp target/classes org.example.Task1.Client
```
