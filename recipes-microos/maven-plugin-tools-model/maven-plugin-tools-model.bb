SUMMARY = "Maven Plugin Metadata Model"
DESCRIPTION = "The Maven Plugin Metadata Model provides an API to play with the Metadata \
model."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-model-3.6.0-5.1.noarch.rpm"
RPM_HASH = "319b0fd30bfc7a87f0fdc87a92d6a9842eb5a156423fd484b107ff3e2af66d1ca642228c06ffec23233c5fcbc5285a65e9142381dcdfa2d966ad032e350248de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-model mvn(org.apache.maven.plugin-tools:maven-plugin-tools-model) mvn(org.apache.maven.plugin-tools:maven-plugin-tools-model:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
