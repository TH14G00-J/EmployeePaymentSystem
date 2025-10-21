# Employee Payment System

Este projeto tem como objetivo calcular o pagamento de funcionários de uma empresa, incluindo funcionários próprios e terceirizados.

## 💡 Descrição do Projeto
O sistema permite o cadastro de funcionários informando:
- Nome
- Horas trabalhadas
- Valor por hora

Para **funcionários terceirizados**, é solicitado também um valor de **despesa adicional**, que recebe um bônus de **110%** sobre este valor.

Após a entrada dos dados, o sistema exibe o nome e o pagamento de cada funcionário.

---

## 🧱 Estrutura do Projeto

```
src/
 ├── model/
 │    ├── Employee.java
 │    └── OutsourceEmployee.java
 └── Main.java
```

### 📄 `Employee.java`
Classe base que representa um funcionário genérico da empresa, contendo:
- Atributos: `name`, `hours`, `valuePerHours`
- Método `payment()` que calcula o valor total a ser pago (horas × valor por hora)

### 📄 `OutsourceEmployee.java`
Subclasse que estende `Employee` e adiciona:
- Atributo: `additionalCharge`
- Sobrescrita do método `payment()` para incluir o bônus de 110% da despesa adicional

### 📄 `Main.java`
Classe principal responsável por:
- Ler os dados dos funcionários via teclado
- Instanciar objetos `Employee` ou `OutsourceEmployee`
- Exibir o pagamento de cada funcionário

---

## 🧩 Exemplo de Execução

```
Enter the number of employees: 2
Employee #1 data:
Outsourced (y/n)? n
Name: João
Hours: 40
Value per hours: 20
Employee #2 data:
Outsourced (y/n)? y
Name: Maria
Hours: 30
Value per hours: 25
Additional charge: 200

PAYMENTS
João - $ 800.00
Maria - $ 1075.00
```

---

## 🛠️ Tecnologias Utilizadas
- Java 17+
- Paradigma Orientado a Objetos (POO)
- IntelliJ IDEA

---

## 👨‍💻 Autor
Projeto desenvolvido por **Thiago José** como prática de herança e polimorfismo em Java.
