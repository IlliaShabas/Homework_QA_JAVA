Feature: feature test

Background:
        Given that I'm on the home page
		
	Scenario: Reading frequently asked questions
		When I click on "About"
		And I click on "FAQ"
		Then I go to the FAQ page

	Scenario: Searching for cucumber
		When I press the search button
		And I'm looking for "Cucumber"
		Then I see a list of dishes that have the word "cucumber"

	Scenario: Searching for ideas
		Given that I changed the language of the site to Russian
		When I press the search button 
		And I'm looking for "Идея"
		Then I see a list of articles that have the word "Идея"

Scenario: Reading the article
	Given that I'm on the "How Do We Do It" page
	When I click on Best practices plate
	Then I should see the page

Scenario: Route to SolutionHub
	Given that I'm on the "How Do We Do It" page
	When I click on the words "our own IP"
	Then I go to the SolutionHub page

Scenario: Customer solution article
	Given that I am on the page "Our work"
	When I click on "Healthcare"
	And I click on "Learn more"
	Then I go to the solution page for this client

Scenario: Following a link
	When I click "About"
	And I scroll down
	And I click "FOLLOW. Instagram"
	Then I go to the  instagram page

Scenario: Going home
	Given I am on page "Services"
	When I click on "<epam>"
	Then I go to the main page
	Given I am on page1 "Services"
	When I click on "<epam>"
	Then I go to the main page