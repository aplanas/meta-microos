SUMMARY = "Maven plugin for generating platform-dependent properties"
DESCRIPTION = "os-maven-plugin is a Maven extension/plugin that generates various \
useful platform-dependent project properties normalized from \
${os.name} and ${os.arch}. \
 \
${os.name} and ${os.arch} are often subtly different between JVM and \
operating system versions or they sometimes contain machine-unfriendly \
characters such as whitespaces. This plugin tries to remove such \
fragmentation so that you can determine the current operating system \
and architecture reliably."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "os-maven-plugin-1.7.0-3.8.noarch.rpm"
RPM_HASH = "b96f696c27f5e3ccdf1d6eea7f404a9f82fff293c32627da4097d01f950a2ed04fc4d151dc64d8a71b28de12fca49530131efb1f9a2b282fa936cb4fbc4a8953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(kr.motd.maven:os-maven-plugin) \
mvn(kr.motd.maven:os-maven-plugin:pom:) \
os-maven-plugin"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.code.findbugs:jsr305) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
