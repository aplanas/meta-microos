SUMMARY = "Capability to package the artifact in an uber-jar"
DESCRIPTION = "This plugin provides the capability to package the artifact in an \
uber-jar, including its dependencies and to shade, i.e. rename, the \
packages of some of the dependencies."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-shade-plugin-3.4.1-1.1.noarch.rpm"
RPM_HASH = "97b300f2a3ba5dff34441b0557d8897edd1d09a5921372f1fcc0e7cc01b653d63fe53a48d206f327ed93590c7a69fb31bd990244ea1d7dfbb9a8f0396add8729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shade-plugin mvn(org.apache.maven.plugins:maven-shade-plugin) mvn(org.apache.maven.plugins:maven-shade-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-io:commons-io) mvn(org.apache.commons:commons-collections4) mvn(org.apache.maven.shared:maven-artifact-transfer) mvn(org.apache.maven.shared:maven-dependency-tree) mvn(org.codehaus.plexus:plexus-utils) mvn(org.jdom:jdom2) mvn(org.ow2.asm:asm) mvn(org.ow2.asm:asm-commons) mvn(org.slf4j:slf4j-api) mvn(org.vafer:jdependency)"

inherit rpm
