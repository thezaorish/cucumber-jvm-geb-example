package features.support

import geb.Browser

this.metaClass.mixin (cucumber.runtime.groovy.Hooks)

Before () {
	browser = new Browser()
}

After () {
	
}