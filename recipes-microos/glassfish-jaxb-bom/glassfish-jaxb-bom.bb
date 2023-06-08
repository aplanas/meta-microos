SUMMARY = "JAXB BOM"
DESCRIPTION = "JAXB Bill of Materials (BOM)"
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-bom-2.3.1-4.4.noarch.rpm"
RPM_HASH = "4584fd3e012e89b2158c43136b07746952f64b48244d930fa824b0a48ee91730bf5eb15311a17a5871d2db051e570bf625ad2e5445b1dd5133676c1c8cab85ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-bom mvn(org.glassfish.jaxb:jaxb-bom:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(net.java:jvnet-parent:pom:)"

inherit rpm
