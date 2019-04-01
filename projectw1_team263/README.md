# Personal Project
:arrow_forward: Please refer to [edX][1] for description and instructions.

[1]: https://edge.edx.org/courses/course-v1:UBC+CPSC210+2018W1/courseware/a4d49b3ef5fa4fe2bd9496e76d72dc48/e2887456a15a48dbb040ecdac313168f/1?activate_block_id=block-v1%3AUBC%2BCPSC210%2B2018W1%2Btype%40vertical%2Bblock%40ff793bbcd5544e82bb5052f0dffe5d71

DESCRIPTION OF PERSONAL PROJECT WEEK 1:***************

- created SRC module so it looks lke other repos from Github
- created UI package inside SRC module
- created Main class inside SRC module
- named a public class "Main"
- created a main method within "Main" (by using psvm)
- made 2 new static methods: sayGreeting and sayGoodbye (uses sout)
- these 2 methods print out "Hello there!" and "Goodbye!"




DESCRIPTION OF PERSONAL PROJECT WEEK 2 CHANGES:***************

- first real draft of what future application will look like
- experimenting with creating 2 classes: Item and Inventory
- also trying to incorporate the functionality and logging capabilities of
scanner (so I have a log of all operations performed in the end)
- confusion regarding the inability to add and store data when item has
3 fields (name, price, rating)
- trying to stick to just having item as a 1 field item (itemname)
- try to incorporate a for-loop in deleteInventory and addInventory
methods
- currently, project is not functioning properly (but will run)
- trying to understand the importance of constructors and where
to put them
- may have to restart from scratch to make a much simpler program without
trying to incorporate the logging capabilities of scanner




DESCRIPTION OF PERSONAL PROJECT WEEK 3 CHANGES:********************

- trying to fix functionality of deleteInventory method (GOT IT TO WORK!)
- trying to fix functionality of addInventory method
- eliminate the logging functionality of the scanner to reduce complexity
...
...
...
...
- fixed functionality of program as a whole (but only using itemName instead of 
full Item + the fields of Item (AKA price, rating)
- started a test class but not sure how to continue with testing
if program uses user input? (HOW TO TEST WITH USER INPUT/SCANNER)
- for future, maybe try to implement full Item into inventory
    -> AKA, have each Item in inventory have its own:
     string name, int rating, double price
     
     
     
DESCRIPTION OF PERSONAL PROJECT WEEK 4 CHANGES:********************

- try to incorporate interface concepts 
- try to make each Item in Inventory have 3 different fields:
    -> itemName
    -> itemPrice
    -> itemRating
- change scanner functionality into main and take it out of 
methods inside classes?
- added 2 interfaces: Loadable & Saveable
- incorporated the load() and save() method from the 2 interfaces
  into InventoryFunction()
- ^^^ this allows for load and saving or file input/output in my
  program
  
DESCRIPTION OF PERSONAL PROJECT WEEK 5 CHANGES:********************

- moved away from earlier project structure where I had to make/preset
  a list inside class in order to run program 
  -> now, entirety of project runs via flie input/output
- introduced abstract class Inventory 
- BakeryInventory, ElectronicInventory, SportInventory all extend
  the abstract class Inventory
- took some scanner functionalities out of a few methods into main method
  of InventoryFunctions2 (but still needs more fixing)
