SUMMARY = "Test framework project"
DESCRIPTION = "Surefire is a test framework project."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-2.22.0-8.1.noarch.rpm"
RPM_HASH = "067ac445b2f27f4a48a429fd440459c2ee6f79e5de0a41fb68f427bdfd98759c22a584157de72b79e44bc7f1f7288a85bb78a1ef13fed3bdab9cf86b1c1803b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire mvn(org.apache.maven.surefire:common-java5) mvn(org.apache.maven.surefire:common-java5:pom:) mvn(org.apache.maven.surefire:maven-surefire-common) mvn(org.apache.maven.surefire:maven-surefire-common:pom:) mvn(org.apache.maven.surefire:surefire-api) mvn(org.apache.maven.surefire:surefire-api:pom:) mvn(org.apache.maven.surefire:surefire-booter) mvn(org.apache.maven.surefire:surefire-booter:pom:) mvn(org.apache.maven.surefire:surefire-grouper) mvn(org.apache.maven.surefire:surefire-grouper:pom:) mvn(org.apache.maven.surefire:surefire-logger-api) mvn(org.apache.maven.surefire:surefire-logger-api:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.google.code.findbugs:jsr305) mvn(commons-io:commons-io) mvn(org.apache.commons:commons-lang3) mvn(org.apache.maven.plugin-tools:maven-plugin-annotations) mvn(org.apache.maven.shared:maven-common-artifact-filters) mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.apache.maven:maven-artifact) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-model) mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-java) procps"

inherit rpm
