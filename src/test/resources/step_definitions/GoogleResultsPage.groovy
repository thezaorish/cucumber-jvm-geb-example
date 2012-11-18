import geb.Page;

class GoogleResultsPage extends Page {
	
	static at = {
		waitFor {
			title.endsWith("Google Search") || title.endsWith("Căutare Google")
			// depending on the location settings
		}
	}
	
	void assertResultIs(def index, def title) {
		assert $('div#ires ol li')[index - 1].find('a').text() == title
	}
	
}