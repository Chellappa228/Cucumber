Feature: Verifying Adactin Hotel Page 
Scenario Outline: Booking Room 

	Given user is on Adactin
	When user enter "<username>" and "<password>" 
	And user should click button 
	And user should select LOCATION "<locations>"
	And user should select HOTELS "<hotels>"
	And user should select ROOMTYPE "<roomtype>"
	And user should select NUMBER OF ROOMS "<numberofrooms>"	
	And user should select ADULTS PER ROOM "<adultsperroom>"
	And user should select CHILDRENS PER ROOM "<childrensperroom>"
	Then user should click search button
	
	Examples: 
		|username|password|locations|hotels|roomtype|numberofrooms|adultsperroom|childrensperroom|
		|Cksujith|Ck@1234|Sydney|Hotel Creek|Standard|1 - One|1 - One|3 - Three|		
		|Cksujith|Ck@1234|Melbourne|Hotel Creek|Standard|1 - One|1 - One|3 - Three|
		|Cksujith|Ck@1234|Brisbane|Hotel Creek|Standard|1 - One|1 - One|3 - Three|
		|Cksujith|Ck@1234|Adelaide|Hotel Creek|Standard|1 - One|1 - One|3 - Three|
		|Cksujith|Ck@1234|London|Hotel Creek|Standard|1 - One|1 - One|3 - Three|
		|Cksujith|Ck@1234|New York|Hotel Creek|Standard|1 - One|1 - One|3 - Three|
		|Cksujith|Ck@1234|Los Angeles|Hotel Creek|Standard|1 - One|1 - One|3 - Three|
		|Cksujith|Ck@1234|Paris|Hotel Creek|Standard|1 - One|1 - One|3 - Three|