SUMMARY = "Build Helper Maven Plugin"
DESCRIPTION = "This plugin contains various small independent goals to assist with \
Maven build lifecycle."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "maven-plugin-build-helper-3.2.0-2.8.noarch.rpm"
RPM_HASH = "ea90a56704801a9b0a8630c47c3bcd8781713a3ffaa76a4c3caca5e2f66ffcfcc8303130f507dcd1846d3c63b9102f5eb2d11c92c952befb175fe80ebd83b53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-build-helper mvn(org.codehaus.mojo:build-helper-maven-plugin) mvn(org.codehaus.mojo:build-helper-maven-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache-extras.beanshell:bsh) mvn(org.apache.maven.shared:file-management) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
