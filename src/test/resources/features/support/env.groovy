package features.support

import geb.Browser

this.metaClass.mixin (cucumber.api.groovy.Hooks)

Before () {
	browser = new Browser()
}

After () {
	
}
