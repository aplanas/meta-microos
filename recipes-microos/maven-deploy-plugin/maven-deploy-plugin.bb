SUMMARY = "Maven Deploy Plugin"
DESCRIPTION = "Uploads the project artifacts to the internal remote repository."
LICENSE = "Apache-2.0"

PV = "3.0.0~M2"

RPM_NAME = "maven-deploy-plugin-3.0.0~M2-1.8.noarch.rpm"
RPM_HASH = "38adbb87fbe2d5c827eec5eb9f334886a0dcdc0d2d65d3a803e036fab114d45a980a146d86ef6bf8e9dce30f5b2fd133418029b095d580ad6e560d4b37d80bd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-deploy-plugin mvn(org.apache.maven.plugins:maven-deploy-plugin) mvn(org.apache.maven.plugins:maven-deploy-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-io:commons-io) mvn(org.apache.maven.shared:maven-artifact-transfer) mvn(org.codehaus.plexus:plexus-utils) mvn(org.eclipse.aether:aether-api) mvn(org.eclipse.aether:aether-util)"

inherit rpm
