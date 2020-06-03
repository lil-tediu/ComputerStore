# ComputerStore
Project for Clean Code course in Sofia University. The project is simulating a computer store. There are some junit tests.  
The class Computer is an abstract class which represents the real life computer.  

Every instance of Computer class has the following fields:
- manufacturer
- model
- price
- CPU speed
- RAM memory  

Every computer can be a laptop, a desktop machine or a tablet.

Every desktop has the following fields apart from the computers':
- video RAM memory
- power supply in watts

Every tablet has the following fileds apart from the computers':
- operating system 
- internal storage
- does it have a sd card slot or not

Every laptop has the following fields apart from the computers':
- colour
- screen size;
- battery capacicty in mAh

The main class is ComputerStore and it represents a real life computer store.
It has:
- name
- a set of computers
- balance  

It can:
- Add computer
- Sell computer
- list all the computers in the store
- sort computers by price ascending and descending

There is a class Demo for demonstrating the work of the application.

I am using junit for unit testing.
