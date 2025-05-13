My code models a library system using object-oriented programming (OOP).

🔹 1. LibraryItem class:
Acts like a base class.

Stores common details of any library item:

title, author, and itemID.

Has two actions:

checkOut() → prints that the item was checked out.

returnItem() → prints that the item was returned.

toString() method prints basic info (title, author, ID).

🔹 2. Books class:
Inherits from LibraryItem.

Adds two extra details: ISBN and issueNumber.

Overrides toString() to print just the ISBN and issueNumber (but misses inherited info like title/author).

🔹 3. Magazine class:
Also inherits from LibraryItem.

Has the same fields as Books: ISBN and issueNumber (which is incorrect based on the question).

Also overrides toString() to print ISBN and issueNumber.

🔹 4. mainClass (Main method):
Creates one LibraryItem object, assigns values, checks out and returns it.

Creates a Books object, sets values, and prints it.

Creates a Magazine object, sets values, and prints it.
