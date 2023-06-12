SUMMARY = "Master POM for Glassfish Maven projects"
DESCRIPTION = "This is a shared POM parent for Glassfish Maven projects."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "8"

RPM_NAME = "glassfish-master-pom-8-1.11.noarch.rpm"
RPM_HASH = "02cc0c0cb994d22e0a877537492b473ae0b5bcfa0b6a88d0cb4cc6ba39592e9cab3d71d08a844b0fac8503cd8e8f473e435709f9d6508cc63877420c2617195b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-master-pom \
mvn(org.glassfish:pom:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.plugins:maven-compiler-plugin)"

inherit rpm
