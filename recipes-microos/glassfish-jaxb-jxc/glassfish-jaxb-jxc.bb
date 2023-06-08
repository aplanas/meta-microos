SUMMARY = "JAXB schema generator"
DESCRIPTION = "The tool to generate XML schema based on java classes."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-jxc-2.3.1-4.4.noarch.rpm"
RPM_HASH = "23b301593751d593fa8f366ca013ce7b5fed2b42c2996144e64213767f649140281de4e266e0040e3b5207f38245c620a8d8bad1a4ce76620a30655aef08ab26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-jxc mvn(org.glassfish.jaxb:jaxb-jxc) mvn(org.glassfish.jaxb:jaxb-jxc-jdk9) mvn(org.glassfish.jaxb:jaxb-jxc-jdk9:pom:) mvn(org.glassfish.jaxb:jaxb-jxc:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.sun.istack:istack-commons-runtime) mvn(org.glassfish.jaxb:jaxb-runtime) mvn(org.glassfish.jaxb:jaxb-xjc) mvn(org.glassfish.jaxb:txw2)"

inherit rpm
