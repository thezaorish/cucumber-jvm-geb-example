import geb.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)
this.metaClass.mixin(geb.Browser)

Given(~'I am on the Google search page') { ->
	browser.go('http://www.google.com/')
	
	// to GoogleHomePage
	// at GoogleHomePage
}

When(~'I search for "(.+)"') { searchTerm ->
	browser.$('input', name: 'q').value(searchTerm)
	browser.$('button', name: 'btnG').click()
	 
	// searchFor(searchTerm)
}

Then(~'I should see the results page') { ->
	Thread.sleep(1000)
	def title = browser.page.title
	assert title.endsWith("Google Search") || title.endsWith("Căutare Google")
	
	// at GoogleResultsPage
} 

Then(~'The first link should be "(.+)"') { searchTerm ->
	assert $('div#ires ol li')[0].find('a').text() == searchTerm
	 
	// assertResultIs(1, searchTerm)
}
