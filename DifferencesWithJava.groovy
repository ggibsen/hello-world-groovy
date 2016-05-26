
class DifferencesWithJava {

	def defaultImports() {
		/*
		 java io java lang and groovy lang etc
		 */
	}

	def dynamicBinding_multiMethods() {
		Object obj = "aString";
		// someMethod(obj);
		// in java, someMethod would expect obj to be treated as object since it's static binding
		// but in Groovy, runtime binding so obj is treated as a string and 
		// dynamicBinding_someMethod(String o) is called
	}

	def dynamicBinding_someMethod(Object o) {

	}
	def dynamicBinding_someMethod(String o) {

	}
	
	def arrayInitializers() {
		// { ... } is reserved for closures
		 
	}
}
