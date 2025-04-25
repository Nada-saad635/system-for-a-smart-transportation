# system-for-a-smart-transportation
java Assignment  designing a system for a smart transportation management application. The system must manage  various types of vehicles operating in a smart city, including public vehicles, private vehicles, and  autonomous delivery vehicles

## ✅ Object-Oriented Programming Concepts Demonstrated in the Code
The application demonstrates:
- Multi-level inheritance
- Composition
- Method overloading & overriding

### 1. 🧬 Inheritance

The code uses **inheritance** to create a clear hierarchy of vehicle types:

- `PublicVehicle` inherits from `Vehicle`.
- `Bus` and `MetroTrain` inherit from `PublicVehicle`.
- `PrivateVehicle` inherits from `Vehicle`.
- `ElectricCar` inherits from `PrivateVehicle`.
- `AutonomousVehicle` inherits from `Vehicle`.
- `Drone` and `DeliveryRobot` inherit from `AutonomousVehicle`.

This inheritance hierarchy allows subclasses to **reuse** common properties and behaviors from their superclasses, leading to more **organized and efficient code**.

> **Example:**  
> The `Bus` class inherits `vehicleID`, `manufacturerName`, `capacity`, and `routeNumber` from `PublicVehicle`, and adds its own attributes like `numberOfStops` and `hasWheelchairAccess`.

---

### 2. ⚙️ Composition

The `Vehicle` class demonstrates **composition**:

- It contains a field:
  ```java
  Sensor[] sensors = new Sensor[3];
\### 3. 🔁 Overloading

The code demonstrates **method overloading** in the `Vehicle` class using the `toString()` method:

```java
public String toString()
public String toString(boolean includeSensors)

```
### 4. 🔄 Overriding

The code also demonstrates **method overriding** in the subclasses:

Each subclass (such as `Bus`, `MetroTrain`, `ElectricCar`, etc.) overrides the inherited `toString()` method from the `Vehicle` class.

The **overridden** version includes **subclass-specific details**.

**Example:**  
The `Bus` class overrides the `toString()` method to include:

- `numberOfStops`
- `hasWheelchairAccess`

