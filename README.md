# OOD-project
Final project for a OOD class 
Project Description:
	For my project I chose to simulate a small Lebanese restaurant, I was going off of pervious experiences in Lebanon with these small restaurants that were like food trunks, they had a limited number of options but always had really good food. 
	The code starts off by prompting the user whether or not they would like the “full” or “fast” method, the fast method gives you three choices like the fast cash feature of an ATM, it doesn’t use the full façade method but is similar in principle. For the full menu, you are asked if you would like coffee, then a sandwich and lastly A Manush. At each step you are asked if you like to order another before moving on and at the end your order is given to you. I used two creational methods: Builder and Factory, and then one full structural: Decorator. I also modeled my “fast option” on façade. 

Methods: 
 	
	Builder – Coffee
I chose to use builder method for the coffee creation because there was two building blocks you had to have, the type of coffee and the size. Then you can add the extra stuff like milk and sugar if you wanted top of that, utilizing the optional parameters of the builder class. The Builder class was definitely the easiest method to set up since it’s contained in just a coffee class file. 

	Factory – Sandwich 
I used factory for my Sandwich maker because of the three different types of sandwich’s I was making that all used the same two parameters, the filling and the bread. I debated adding other addons but couldn’t be done since fafel and Shawarma would take different parameters. Factory was not my favorite method to use since it took a while to run but otherwise, I think it was a good fit

	Decorator – Manush
I used Decorator for Manush because every Manush at least traditional ones (there is a cheese one but its not as good) have a base of zaatar that is fine on its own but is better with tomatoes or onions. It ended up fitting the need well and worked pretty well. 
