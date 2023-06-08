SUMMARY = "Compatibility Maven settings artifact"
DESCRIPTION = "Maven settings artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-settings-2.2.1-3.8.noarch.rpm"
RPM_HASH = "70c0df79427812b67b58b80e033f474249955e9b05877e8f2eb9603fcb44cf947231d06314721fa941c398ab2a8a0c484eeacaa2656e5b8066df2011957eb19c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-settings mvn(org.apache.maven:maven-settings:2.0.2) mvn(org.apache.maven:maven-settings:2.0.6) mvn(org.apache.maven:maven-settings:2.0.7) mvn(org.apache.maven:maven-settings:2.0.8) mvn(org.apache.maven:maven-settings:2.2.1) mvn(org.apache.maven:maven-settings:pom:2.0.2) mvn(org.apache.maven:maven-settings:pom:2.0.6) mvn(org.apache.maven:maven-settings:pom:2.0.7) mvn(org.apache.maven:maven-settings:pom:2.0.8) mvn(org.apache.maven:maven-settings:pom:2.2.1)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven:maven-model) mvn(org.codehaus.plexus:plexus-container-default) mvn(org.codehaus.plexus:plexus-interpolation) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
