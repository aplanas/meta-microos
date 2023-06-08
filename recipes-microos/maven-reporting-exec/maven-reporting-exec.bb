SUMMARY = "Classes to manage report plugin executions with Maven 3"
DESCRIPTION = "Classes to manage and configure report plugin executions with Maven 3."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "maven-reporting-exec-1.6.0-1.10.noarch.rpm"
RPM_HASH = "27c967e5e3af7da6a840f1b58d0b4371a05275f08bce105312dd53449135020b2c80f02a5bc9d71676d4327dca49214dd4d0079833cc65ef2e394a8fb5b93087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-exec mvn(org.apache.maven.reporting:maven-reporting-exec) mvn(org.apache.maven.reporting:maven-reporting-exec:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.reporting:maven-reporting-api) mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.apache.maven:maven-artifact) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-model) mvn(org.apache.maven:maven-plugin-api) mvn(org.apache.maven:maven-settings) mvn(org.apache.maven:maven-settings-builder) mvn(org.codehaus.plexus:plexus-utils) mvn(org.eclipse.aether:aether-util)"

inherit rpm
