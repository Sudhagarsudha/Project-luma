@ProjectStart
Feature: To Verify Luma Webpage

@SigninPage
Scenario: To Validate The Luma Signin Page 
		Given User Should Put "<Driver>" and "<Url>"
		When User Should Click SignIn button
		And User Should Enter "<Email>" and "<Password>"
		And User Should Click the Login button
	
	Examples:
		|Driver|Url|Email|Password|
		|Chrome|https://magento.softwaretestingboard.com/|Sudhagar12200341@gmail.com|Asudha1785|
		
@AddToCart	
Scenario: To Validate The Product
		When User Should Search The Product "<Name>"
		And User Should Click The Product
		And User Should Click The AddToCart button


		Examples:
		|Driver|Url|Email|Password|Name|
		|Chrome|https://magento.softwaretestingboard.com/|Sudhagar12200341@gmail.com|Asudha1785|HOODIE|

@EnterDetails		
Scenario: To Validate The Shipment Details
		When User Should Click The ShoppingCart button
		And User Should Click The Checkout button
		And User Should Click The New Address
		And User Should Enter The "<FirstName>", "<LastName>", "<Company>","<Address1>", "<Address2>", "<Address3>", "<City>", "<Region>", "<Postal>", "<Country>", "<Phonenumber>"
		
		Examples:
		|Driver|Url|Email|Password|Name|FirstName|LastName|Company|Address1|Address2|Address3|City|Region|Postal|Country|Phonenumber|
		|Chrome|https://magento.softwaretestingboard.com/|Sudhagar12200341@gmail.com|Asudha1785|HOODIE|Sudhagar|Sudha|SudhagarTech|No.320MettuStreet|Velachery|TamilNadu|Chennai|Alaska|12345-6789|UnitedStates|9876543210|

@ProceedOrder	
Scenario: To Validate The Order Details
		When User Should Proceed The Order
		Then User Should Verify The Order
		
	Examples:
		|Driver|Url|Email|Password|Name|FirstName|LastName|Company|Address1|Address2|Address3|City|Region|Postal|Country|Phonenumber|
		|Chrome|https://magento.softwaretestingboard.com/|Sudhagar12200341@gmail.com|Asudha1785|HOODIE|Sudhagar|Sudha|SudhagarTech|No.320MettuStreet|Velachery|TamilNadu|Chennai|Alaska|12345-6789|UnitedStates|9876543210|
 

