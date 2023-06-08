SUMMARY = "Maven Archetype common classes"
DESCRIPTION = "Maven Archetype common classes."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-common-3.2.1-1.9.noarch.rpm"
RPM_HASH = "98b9a750da162d7a7d8ae10c92f27944eab2fa51a9c385562f07be207d46e0879ad0a141ea110ee35239334b28cabef0b7796b297a3a0763d5fb0d08630f65a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-common mvn(org.apache.maven.archetype:archetype-common) mvn(org.apache.maven.archetype:archetype-common:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.ibm.icu:icu4j) mvn(commons-collections:commons-collections) mvn(commons-io:commons-io) mvn(org.apache.maven.archetype:archetype-catalog) mvn(org.apache.maven.archetype:archetype-descriptor) mvn(org.apache.maven.shared:maven-artifact-transfer) mvn(org.apache.maven.shared:maven-invoker) mvn(org.apache.maven:maven-aether-provider) mvn(org.apache.velocity:velocity) mvn(org.codehaus.plexus:plexus-component-annotations) mvn(org.codehaus.plexus:plexus-utils) mvn(org.codehaus.plexus:plexus-velocity) mvn(org.eclipse.aether:aether-impl) mvn(org.jdom:jdom2)"

inherit rpm
