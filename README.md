# SE350 Design Patterns Practice

Pizza-themed exercises practicing three design patterns in Java.

## Tasks

1. **Builder** (`Example1`): Replace the `PizzaWith...` subclasses with a builder that sets cheese and crust.
2. **Adapter** (`Example2`): Adapt the unmodifiable `DominoPizza` interface so it works with the Pizza Builder.
3. **Decorator** (`Example3`): Add optional toppings (e.g. `OnionDecorator`, `PineappleDecorator`) that can be stacked on a built pizza.
4.  **Composite** (`Example4`): The shop now sells combo meals, and a combo can even hold other combos (the "Family Deal" includes a pizza, a drink, and a "Kids Combo"). Make a `MenuItem` interface with `getPrice()` so the cashier can price one pizza or a whole nested combo the same way. `PizzaItem` and `Drink` return their own price, and `Combo` adds up everything inside it.
5. **Command** (`Example5`): Customers now place their orders at a kiosk, but they keep tapping the wrong item and need an undo button. Make a `Command` interface with `execute()` and `undo()`, and an `AddItemCommand` that adds a `Item` to the customer's `Order` and removes it on undo. The `Order` should store items and calculate the total cost. The `Kiosk` runs commands with `press()` and takes back the last one with `undoLast()`, remembering previously executed commands so the most recent action can be reversed. 
    - **Hint:** Reuse your existing `Item` interface.


The starter code is in `src/main/java/org/example/Task1/Client.java`.

## Requirements

- Java 23
- Maven

## Build & Run

```sh
mvn compile
java -cp target/classes org.example.Task1.Client
```
