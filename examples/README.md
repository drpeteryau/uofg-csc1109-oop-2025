# Abstract class vs interface

Package `com.example.examples.abstractinterface`. Run `Main`.

| | Abstract class (`Payment`) | Interface (`Auditable`) |
|---|---|---|
| Models | What something **is** | What something **can do** |
| How many | A class extends **one** | A class implements **many** |
| State | Fields and constructors allowed | Constants only |
| Methods | Abstract + concrete | Abstract + `default` + `static` |
| In this example | `pay` is abstract, `receipt` is shared | `audit` is abstract, `showAuditVersion` is a default |

`CreditCardPayment` extends `Payment` **and** implements `Auditable`. `CashPayment` is only a `Payment`, so `Main` uses `instanceof` to audit only what supports it.

## Common mistakes

- Overriding without `@Override` (a typo then silently creates a new method instead of overriding).
- Weakening access when overriding (an interface method is `public`, so the implementation must be `public`).
- Using an abstract class when only a capability is needed (prefer an interface).

## Extension exercises

1. Add `BankTransferPayment` that is `Auditable` and overrides `showAuditVersion`.
2. Add a second interface `Refundable` and implement both interfaces on one class.
3. What happens if two interfaces provide the same `default` method? Try it.
