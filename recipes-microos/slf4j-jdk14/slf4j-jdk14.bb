SUMMARY = "SLF4J JDK14 Binding"
DESCRIPTION = "SLF4J JDK14 Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-jdk14-1.7.36-3.3.noarch.rpm"
RPM_HASH = "9b908b6ff6100c751f337a4fc1eb638784178a03af90d8927b0c403e763a75fbebd6b3c9bb547db32b6692975687466e5311051f57b418729babc7e024ca4325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:slf4j-jdk14) mvn(org.slf4j:slf4j-jdk14:pom:) osgi(slf4j.jdk14) slf4j-jdk14"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.slf4j:slf4j-api)"

inherit rpm
