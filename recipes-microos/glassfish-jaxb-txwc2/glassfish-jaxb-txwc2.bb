SUMMARY = "TXW2 Compiler"
DESCRIPTION = "JAXB schema generator. The tool to generate XML schema based on java \
classes."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-txwc2-2.3.1-4.4.noarch.rpm"
RPM_HASH = "ad2d2562f2a7858f15b919fd2941a44253dbef2b07164e5faa16798e1dcc3f790784f4919e632d65e75f1eb3db3ad39c5ab1e938ff8c0479ef2057cd7f330f4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-txwc2 mvn(org.glassfish.jaxb:txwc2) mvn(org.glassfish.jaxb:txwc2:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(args4j:args4j) mvn(com.sun.xml.bind.external:rngom) mvn(org.glassfish.jaxb:codemodel) mvn(org.glassfish.jaxb:txw2) mvn(org.glassfish.jaxb:xsom)"

inherit rpm
