SUMMARY = "Glassfish Hundred Kilobytes Kernel"
DESCRIPTION = "HK2 for Hundred Kilobytes Kernel is an abstraction to \
a module subsystem coupled with a simple yet powerful \
component model to build server side software."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-2.5.0-2.3.noarch.rpm"
RPM_HASH = "da0b2b8db2e7d891219d8273f655dec69bd2c0106642086b260625dec740c31973ea70495928ce779f24bd52f0bf0c02ee67f3115aa943cb0a5510d8b5d5c0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2 \
mvn(org.glassfish.hk2:hk2-bom:pom:) \
mvn(org.glassfish.hk2:hk2-parent:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.felix:maven-bundle-plugin) \
mvn(org.apache.maven.plugins:maven-compiler-plugin) \
mvn(org.apache.maven.plugins:maven-jar-plugin) \
mvn(org.apache.maven.plugins:maven-surefire-plugin)"

inherit rpm
