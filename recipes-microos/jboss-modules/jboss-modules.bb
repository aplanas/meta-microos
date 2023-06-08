SUMMARY = "A Modular Classloading System"
DESCRIPTION = "Ths package contains A Modular Classloading System."
LICENSE = "Apache-2.0 & xpp"

PV = "1.5.2"

RPM_NAME = "jboss-modules-1.5.2-1.20.noarch.rpm"
RPM_HASH = "06c3c1433c9ecacf4a1fb7062b5437b29420690f8340abbf8f010b207dbd93ca09844af75a3d523c47defaf0e8e0de607785afb58c6292d7cd5f6c270104bd00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-modules mvn(org.jboss.modules:jboss-modules) mvn(org.jboss.modules:jboss-modules:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
