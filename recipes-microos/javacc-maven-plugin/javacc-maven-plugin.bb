SUMMARY = "Maven Plugin for processing JavaCC grammar files"
DESCRIPTION = "Maven Plugin for processing JavaCC grammar files."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "javacc-maven-plugin-2.6-2.10.noarch.rpm"
RPM_HASH = "eab4946065db974b17ae7d6a8c63977acfd7b8b0902c624978052ddb85e219767ec709d9d7416e99b3428655171af6b52334fefc8e59c6e257ce2fa15de53a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-maven-plugin mvn(org.codehaus.mojo:javacc-maven-plugin) mvn(org.codehaus.mojo:javacc-maven-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(net.java.dev.javacc:javacc) mvn(org.apache.maven.doxia:doxia-sink-api) mvn(org.apache.maven.doxia:doxia-site-renderer) mvn(org.apache.maven.reporting:maven-reporting-api) mvn(org.apache.maven.reporting:maven-reporting-impl) mvn(org.apache.maven:maven-model) mvn(org.apache.maven:maven-plugin-api) mvn(org.apache.maven:maven-project) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
