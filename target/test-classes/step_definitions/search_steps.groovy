import geb.*

this.metaClass.mixin(cucumber.runtime.groovy.Hooks)
this.metaClass.mixin(cucumber.runtime.groovy.EN)
this.metaClass.mixin(geb.Browser)

Given(~'I am on the Google search page') { ->
	to GoogleHomePage
	at GoogleHomePage
}

When(~'I search for "(.+)"') { searchTerm -> 
	searchFor(searchTerm)
}

Then(~'I should see the results page') { ->
	at GoogleResultsPage
} 

Then(~'The first link should be "(.+)"') { searchTerm -> 
	assertResultIs(1, searchTerm)
}