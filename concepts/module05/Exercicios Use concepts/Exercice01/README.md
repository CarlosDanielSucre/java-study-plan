## ✅ Exercise 1: Bank Account
### Create a `BankAccount` class with the following requirements:
- Private attributes: `number`, `balance`, and `accountType` (enum).
-Enum `AccountType` with values: `CHECKING_ACCOUNT`, `SAVING_ACCOUNT`, `SALARY_ACCOUNT`.
- Provide getters and setters for all fields.
- Implement `deposit(double amount)` and `withdraw(double amount)` methods with proper validation.
- Create a `Client` class with `name` and `cpf`, and associate it with a `BankAccount` (composition relationship).


## ✅ Exercise 2: Game Character with Weapon (Composition + Enum Logic)
### 🎯 Goal:

Model a basic game character system using composition and an enum with embedded logic, representing weapon types.  

### 📦 Required Classes and Structure:

### 1. `Character` Class  
Represents a game character.  

#### Attributes:

- `name` (String): the name of the character.
- `health` (int): current health points.
- `weapon` (Weapon): the weapon assigned to the character (composition).

#### Methods:

- `attack()`: uses the weapon to attack. The method should call the use() method from the weapon, and print the character's name, weapon type, and damage dealt.

### 2. `Weapon` Class
Represents a physical weapon held by the character.

#### Attributes:

- `type` (WeaponType): the type of weapon (enum).
- `durability` (int): number of times the weapon can be used before breaking.

Methods:

- `use()`: decreases durability by 1 and delegates the attack message to the WeaponType. If `durability` is 0 or less, print a warning that the weapon is broken.

### 3. `WeaponType` Enum

An enum representing the types of weapons available.

#### Constants and Data:

- `SWORD`: label = "Sword", damage = 10
- `BOW`: label = "Bow", damage = 8
- `AXE`: label = "Axe", damage = 12

#### Fields:

- `label` (String): user-friendly name of the weapon type.
- `damage` (int): damage caused per hit.

#### Methods:

- `getLabel()`: returns the label.
- `getDamage()`: returns the damage.
- `attack(String characterName)`: prints a message like:
      - `"Carlos attacks with Sword causing 10 damage!"`

### Example usage (Main Clas):
```java
Weapon sword = new Weapon(WeaponType.SWORD, 5);
Character hero = new Character("Carlos", 100, sword);

hero.attack();
// Output: Carlos attacks with Sword causing 10 damage! Durability left: 4
```
If the durability reaches 0:
```txt
Carlos tries to attack with Sword, but the weapon is broken!
```
