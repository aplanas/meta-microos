SUMMARY = "Maven Plugin for using archetypes"
DESCRIPTION = "Maven Plugin for using archetypes."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-plugin-3.2.1-1.9.noarch.rpm"
RPM_HASH = "354eda0236ea9902157d45b14edac9b230e62068a01fed8ca5f49ecb234f38cf4b432225a0c5b22f8ea2d90f75993fd7db61e0cdaa29b33625a5449494b1cf9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-plugin mvn(org.apache.maven.plugins:maven-archetype-plugin) mvn(org.apache.maven.plugins:maven-archetype-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-collections:commons-collections) mvn(org.apache.commons:commons-lang3) mvn(org.apache.maven.archetype:archetype-catalog) mvn(org.apache.maven.archetype:archetype-common) mvn(org.apache.maven.archetype:archetype-descriptor) mvn(org.apache.maven.shared:maven-artifact-transfer) mvn(org.apache.maven.shared:maven-invoker) mvn(org.apache.maven.shared:maven-script-interpreter) mvn(org.apache.maven:maven-archiver) mvn(org.apache.velocity:velocity) mvn(org.codehaus.plexus:plexus-archiver) mvn(org.codehaus.plexus:plexus-component-annotations) mvn(org.codehaus.plexus:plexus-interactivity-api) mvn(org.codehaus.plexus:plexus-utils) mvn(org.codehaus.plexus:plexus-velocity)"

inherit rpm
