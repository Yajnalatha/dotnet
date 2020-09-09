def buildMethod() {
    println('dotnetBuildMethod enter');
	sh 'dotnet --version'
	sh 'dotnet build --configuration Release'
    println('dotnetBuildMethod exit');
}

def testMethod() {
    println('dotnetTestMethod enter');
    sh('dotnet test');
    println('dotnetTestMethod exit');
}

def sonarMethod() {
	println('Sonar Method enter');
    def scannerHome = tool 'Sonar Scanner';
    sh "${scannerHome}/bin/sonar-scanner -Dsonar.login=$USERNAME -Dsonar.password=$PASSWORD";
	println('Sonar Method exit');
	
}
return this
